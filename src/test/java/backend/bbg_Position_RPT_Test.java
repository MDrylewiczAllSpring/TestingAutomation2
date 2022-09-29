package backend;

import dbconnections.devConnect;
import org.testng.annotations.Test;
import sqlQueries.common;
import ui.TestMain;
import util.dlConfigMap;
import util.dlInboundMap;
import util.dlNewFinalMap;
import util.dlNewStagingMap;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bbg_Position_RPT_Test extends TestMain {
    Map<String, Map<String, String>> excelConfigDataMap;
    Map<String, Map<String, String>> excelStagingDataMap;
    Map<String, Map<String, String>> excelFinalDataMap;
    List<String> fileInBound;
    //Data for each test case that will need to be added
    String configExcelName = "OFF_BMK_SEC_FILESCONFIG";
    String configExcelSheet = "OFF_BMK_SEC_FILESCONFIG";
    String orderBy;
    String orderBy2;
    String sourceFileName;
    String finalTable;
    String finalTableExcelLookup;
    String finalExcelSheet;
    String inboundFile;
    String stagingParent;
    String indexName;
    String stagingTable;
    String inboundExcelSheet;
    String inboundFolder;
    String stagingExcelSheet;
    String finalParent;
    String columnName1;
    String columnName2;
    String equalsColumn1;

    int configHeaderDocRow = 0;
    int headerStagingDocRow;
    int headerFinalDocRow;
    int headerOutBoundDocRow = 0;
    int headerColumnsExpected = 1;
    int totalRow = 0;
    int inboundStart = 2;

    public bbg_Position_RPT_Test() throws AWTException {
    }

    @Test
    public void testDemo() throws SQLException, IOException {
        //EMPTY STAGING TABLE
        //issue with formatting inbound
        //getConfig
        excelConfigDataMap = new dlConfigMap().readAllRows(configExcelSheet, configHeaderDocRow, configExcelName);
        String[] prevArray = getPrevDateArray();
        for (int i = 1; i <= excelConfigDataMap.size(); i++) {
//            excelConfigDataMap.get("row" + i).get("Table Name").toString();
//            System.out.println(excelConfigDataMap.get("row" + i).toString());
            if (excelConfigDataMap.get("row" + i).get("RunMode").equals("TRUE")) {
                //Excel Config
                //Staging
                stagingParent = excelConfigDataMap.get("row" + i).get("stagingParent").toString();
                stagingTable = excelConfigDataMap.get("row" + i).get("stagingTable").toString();
                stagingExcelSheet = excelConfigDataMap.get("row" + i).get("stagingExcelSheet").toString();
                headerStagingDocRow = Integer.parseInt(excelConfigDataMap.get("row" + i).get("headerStagingDocRow").toString());
                //Final
                finalParent = excelConfigDataMap.get("row" + i).get("finalParent").toString();
                finalTable = excelConfigDataMap.get("row" + i).get("finalTable").toString();
                finalTableExcelLookup = excelConfigDataMap.get("row" + i).get("finalTableExcelLookup").toString();
                finalExcelSheet = excelConfigDataMap.get("row" + i).get("finalExcelSheet").toString();
                headerFinalDocRow = Integer.parseInt(excelConfigDataMap.get("row" + i).get("headerFinalDocRow").toString());
                //Inbound
                inboundExcelSheet = excelConfigDataMap.get("row" + i).get("inboundExcelSheet").toString();
                inboundFolder = excelConfigDataMap.get("row" + i).get("inboundFolder").toString();
                inboundFile = excelConfigDataMap.get("row" + i).get("inboundFile").toString();
//                indexName = excelConfigDataMap.get("row" + i).get("indexName").toString();
                //Other
                sourceFileName = excelConfigDataMap.get("row" + i).get("sourceFileName").toString();
                columnName1 = excelConfigDataMap.get("row" + i).get("columnName1").toString();
                columnName2 = excelConfigDataMap.get("row" + i).get("columnName2").toString();
                equalsColumn1 = excelConfigDataMap.get("row" + i).get("equalsColumn1").toString();
                orderBy = excelConfigDataMap.get("row" + i).get("OrderBy").toString();
                orderBy2 = excelConfigDataMap.get("row" + i).get("OrderBy").toString();
                System.out.println("Checking: "+ stagingTable.toString());
                //Staging
                String queryStaging = common.selectAllFrom + stagingParent + "." + stagingParent + "." + stagingTable+ common.orderBy + orderBy;
                //getStaging Doc
                excelStagingDataMap = new dlNewStagingMap().readAllRows(stagingExcelSheet, headerStagingDocRow);
//                System.out.println(excelStagingDataMap.toString());
                //get sql results
                List<HashMap> rowListStaging = devConnect.connectAndGetHashTableUAT(queryStaging);
                //This date for the effective_date is one day behind
//                System.out.println(rowListStaging.get(1).toString());
                String[] sourceFileDate = rowListStaging.get(1).get("SourceFileDate").toString().split("\\s+");
                String[] sourceFileDateSeperated = sourceFileDate[0].split("-");
//                String familyID = rowListStaging.get(1).get("family_id").toString();

                //!----- stg_edm_bbg_sec_desc fails at industry_subgroup_num

                List<String> headersStaging = checkTableStructure(excelStagingDataMap, rowListStaging, headerStagingDocRow, stagingTable, "Table Name");
                String queryFinal = common.selectAllFrom + finalParent + "." + finalParent + "." + finalTable + " " + common.where + " " + columnName1 + " = " + "'" + sourceFileDate[0]+ "' "+ common.orderBy + orderBy  ;
////                //Final
////                //getFinal Doc
                excelFinalDataMap = new dlNewFinalMap().readAllRows(finalExcelSheet, headerFinalDocRow);
//////            //get sql results
                List<HashMap> rowFinalList = devConnect.connectAndGetHashTableUAT(queryFinal);
                List<String> headersFinal = checkTableStructure(excelFinalDataMap, rowFinalList, headerFinalDocRow, finalTableExcelLookup, "Table Name");
//////            //Compare data
                compareRowsBetweenStagingFinalConcat(true, rowListStaging, rowFinalList, totalRow, headersStaging, headersFinal);
//                //!~~~~Duplicates in stg_imgr_corp_data
                compareNumberOfRowsExact(rowListStaging, rowFinalList, totalRow);
//            //Compare Inbound Files
          fileInBound = new dlInboundMap().readFile(inboundFolder, "f2456af10.ext."+sourceFileDateSeperated[0].toString().substring(2)+sourceFileDateSeperated[1].toString()+sourceFileDateSeperated[2].toString()+".1");
            System.out.println(fileInBound.toString());
//                //        checkOutboundStructure(excelStagingDataMap, excelOutBound, headerStagingDocRow, tableNameStaging);
//            queryStaging = common.selectAllFrom + stagingParent + "." + stagingParent + "." + stagingTable;
////            //get sql results
//           rowListStaging = devConnect.connectAndGetHashTableUAT(queryStaging);

//cannot compare inbound due to
                noteCompareContains(rowListStaging, fileInBound.toString(),2,1, headersStaging);
            }
        }
    }
}

