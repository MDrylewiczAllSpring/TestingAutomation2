package backend;

import dbconnections.devConnect;
import org.testng.annotations.Test;
import sqlQueries.common;
import ui.TestMain;
import util.*;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bbg_position_rpt_FilesTest extends TestMain {
    Map<String, Map<String, String>> excelConfigDataMap;
    Map<String, Map<String, String>> excelStagingDataMap;
    Map<String, Map<String, String>> excelFinalDataMap;
    List<String> fileInBound;
    //Data for each test case that will need to be added
    String configExcelName = "RDR_GRID_DATA_FILESCONFIG";
    String configExcelSheet = "RDR_GRID_DATA_FILESCONFIG";
    String orderBy;
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
    String equalsColumn1;

    int configHeaderDocRow = 0;
    int headerStagingDocRow;
    int headerFinalDocRow;
    int headerOutBoundDocRow = 0;
    int headerColumnsExpected = 1;
    int totalRow = 0;
    int inboundStart = 2;

    public bbg_position_rpt_FilesTest() throws AWTException {
    }

    @Test
    public void testDemo() throws SQLException, IOException {
        //getConfig
        excelConfigDataMap = new dlConfigMap().readAllRows(configExcelSheet, configHeaderDocRow, configExcelName);
        String[] prevArray = getPrevDateArray();
        for (int i = 1; i <= excelConfigDataMap.size(); i++) {
//            excelConfigDataMap.get("row" + i).get("Table Name").toString();
            System.out.println(excelConfigDataMap.get("row" + i).toString());
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
                equalsColumn1 = excelConfigDataMap.get("row" + i).get("equalsColumn1").toString();
                orderBy = excelConfigDataMap.get("row" + i).get("OrderBy").toString();


                //Staging
                String queryStaging = common.selectAllFrom + stagingParent + "." + stagingParent + "." + stagingTable + common.orderBy + orderBy;
                //getStaging Doc
                excelStagingDataMap = new dlNewStagingMap().readAllRows(stagingExcelSheet, headerStagingDocRow);
                System.out.println(excelStagingDataMap.toString());
                //get sql results
                List<HashMap> rowListStaging = devConnect.connectAndGetHashTableUAT(queryStaging);
                //This date for the effective_date is one day behind
                String[] sourceFileDate = rowListStaging.get(1).get("SourceFileDate").toString().split("\\s+");
                String[] sourceFileDateSeperated = sourceFileDate[0].split("-");
                //!----- stg_edm_bbg_sec_desc fails at industry_subgroup_num

                List<String> headersStaging = checkTableStructure(excelStagingDataMap, rowListStaging, headerStagingDocRow, stagingTable, "Table Name");
               //Final
                //getFinal Doc
                excelFinalDataMap = new dlFinalMap().readAllRows(finalExcelSheet, headerFinalDocRow);
//            //get sql results
                List<HashMap> rowFinalList = devConnect.connectAndGetHashTableUAT(queryFinal);
                List<String> headersFinal = checkTableStructure(excelFinalDataMap, rowFinalList, headerFinalDocRow, finalTableExcelLookup, "Table Name");
//            //Compare data
                compareRowsBetweenStagingFinalConcat(false, rowListStaging, rowFinalList, totalRow, headersStaging, headersFinal);
                //!~~~~Duplicates in stg_imgr_corp_data
                compareNumberOfRowsExact(rowListStaging, rowFinalList, totalRow);
//            //Compare Inbound Files

//            noteCompareSplit(rowListStaging, fileInBound.toString(),2, headersStaging);
            }

        }
    }
}

