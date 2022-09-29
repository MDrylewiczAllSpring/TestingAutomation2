package backend;

import dbconnections.devConnect;
import org.testng.annotations.Test;
import sqlQueries.common;
import ui.TestMain;
import util.dlConfigMap;
import util.dlFinalMap;
import util.dlStagingMap;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class iceCurveTest extends TestMain {
    Map<String, Map<String, String>> excelConfigDataMap;
    Map<String, Map<String, String>> excelStagingDataMap;
    Map<String, Map<String, String>> excelFinalDataMap;
    List<String> fileInBound;
    //Data for each test case that will need to be added
    String configExcelName = "ICECURVEFILESCONFIG";
    String configExcelSheet = "ICECURVEFILESCONFIG";
    String orderBy;
    String sourceFileName;
    String sourceFileNamePartial;
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
    int inboundStart = 3;

    public iceCurveTest() throws AWTException {
    }


    @Test
    public void testIceCurve() throws SQLException, IOException {
        //getConfig
        excelConfigDataMap = new dlConfigMap().readAllRows(configExcelSheet, configHeaderDocRow,configExcelName);
        String[] prevArray = getPrevDateArray();
        for (int i = configHeaderDocRow + 1; i < excelConfigDataMap.size() - 1; i++) {
            System.out.println("Index Row #" + i);
            if (excelConfigDataMap.get("row" + i).get("RunMode").equals("TRUE")) {
//            excelConfigDataMap.get("row" + i).get("Table Name").toString();
                //Excel Config
                //Staging
                stagingParent = excelConfigDataMap.get("row" + i).get("stagingParent").toString();
                stagingTable = excelConfigDataMap.get("row" + i).get("stagingTable").toString();
                stagingExcelSheet = excelConfigDataMap.get("row" + i).get("stagingExcelSheet").toString();
                headerStagingDocRow = Integer.parseInt(excelConfigDataMap.get("row" + i).get("headerStagingDocRow").toString());
                //Final
//                finalParent = excelConfigDataMap.get("row" + i).get("finalParent").toString();
//                finalTable = excelConfigDataMap.get("row" + i).get("finalTable").toString();
//                finalTableExcelLookup = excelConfigDataMap.get("row" + i).get("finalTableExcelLookup").toString();
//                finalExcelSheet = excelConfigDataMap.get("row" + i).get("finalExcelSheet").toString();
//                headerFinalDocRow = Integer.parseInt(excelConfigDataMap.get("row" + i).get("headerFinalDocRow").toString());
                //Inbound
                inboundExcelSheet = excelConfigDataMap.get("row" + i).get("inboundExcelSheet").toString();
                inboundFolder = excelConfigDataMap.get("row" + i).get("inboundFolder").toString();
                inboundFile = excelConfigDataMap.get("row" + i).get("inboundFile").toString();
//            indexName = excelConfigDataMap.get("row" + i).get("indexName").toString();
                //Other
                sourceFileName = excelConfigDataMap.get("row" + i).get("sourceFileName").toString();
                sourceFileNamePartial = excelConfigDataMap.get("row" + i).get("sourceFileNamePartial").toString();
                columnName1 = excelConfigDataMap.get("row" + i).get("columnName1").toString();
                equalsColumn1 = excelConfigDataMap.get("row" + i).get("equalsColumn1").toString();
                orderBy = excelConfigDataMap.get("row" + i).get("OrderBy").toString();


                //Staging
                String queryStaging = common.selectAllFrom + stagingParent + "." + stagingParent + "." + stagingTable + common.orderBy + orderBy;
                //getStaging Doc
                excelStagingDataMap = new dlStagingMap().readAllRows(stagingExcelSheet, headerStagingDocRow);
//            System.out.println(excelStagingDataMap.toString());
                //get sql results
                List<HashMap> rowListStaging = devConnect.connectAndGetHashTableUAT(queryStaging);
                String sourceFileName = rowListStaging.get(1).get("sourcefilename").toString();
                List<String> headersStaging = checkTableStructure(excelStagingDataMap, rowListStaging, headerStagingDocRow, stagingTable, "Table Name");
//            String queryFinal = common.selectAllFrom + finalParent + "." + finalParent + "." + finalTable + " " + common.where + " " + columnName1 + " = " + "'" + prevArray[2]+"-"+prevArray[0]+"-"+prevArray[1] + "'" + common.orderBy + orderBy;
                String queryFinal = common.selectAllFrom + finalParent + "." + finalParent + "." + finalTable + " " + common.where + " " + columnName1 + " = " + "'" + prevArray[2] + "-" + prevArray[0] + "-" + prevArray[1] + "'";
// Final
//            //getFinal Doc
                excelFinalDataMap = new dlFinalMap().readAllRows(finalExcelSheet, headerFinalDocRow);
//            //get sql results
                List<HashMap> rowFinalList = devConnect.connectAndGetHashTableUAT(queryFinal);
                List<String> headersFinal = checkTableStructure(excelFinalDataMap, rowFinalList, headerFinalDocRow, finalTableExcelLookup, "Table / File Name");
//            //Compare data
                compareRowsBetweenStagingFinalConcat(false, rowListStaging, rowFinalList, totalRow, headersStaging, headersFinal);
                compareNumberOfRowsExact(rowListStaging, rowFinalList, totalRow);
//            //Compare Inbound Files
//            rowListStaging = devConnect.connectAndGetHashTable(queryStaging);
//            fileInBound = new dlInboundMap().readFile(inboundExcelSheet, inboundFolder, sourceFileName, headerOutBoundDocRow, headerColumnsExpected);
//            System.out.println(fileInBound.toString());
                //        checkOutboundStructure(excelStagingDataMap, excelOutBound, headerStagingDocRow, tableNameStaging);
//            queryStaging = common.selectAllFrom + stagingParent + "." + stagingParent + "." + stagingTable;
//            //get sql results
//            rowListStaging = devConnect.connectAndGetHashTable(queryStaging);

//            noteCompare(rowListStaging, fileInBound.toString(), inboundStart);
            }
        }
    }
}

