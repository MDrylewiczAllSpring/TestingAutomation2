package backend;

//import dbconnections.barraOneTables;
import dbconnections.devConnect;
import org.testng.annotations.Test;
import sqlQueries.common;
import ui.TestMain;
import util.dlConfigMap;
import util.dlFinalMap;
import util.dlInboundMap;
import util.dlStagingMap;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leiTest extends TestMain {
    Map<String, Map<String, String>> excelConfigDataMap;
    Map<String, Map<String, String>> excelStagingDataMap;
    Map<String, Map<String, String>> excelFinalDataMap;
    Map<String, Map<String, String>> excelInBound;
    //Data for each test case that will need to be added
    String configExcelName = "LEIFILESCONFIG";
    String configExcelSheet = "MSCI MAC FI";
    String tableNameStaging = "MSCI MAC FI Files";
    String stagingExcelSheet = "BarraOne Eq Stress Test Files";
    String tableNameFinal = "MSCI MAC FI Files";
    String finalExcelSheet = "BarraOne Eq Stress Test";
    //    String indexName = "'msci_eq_offbmk_universe'";

    String orderBy;
    String sourceFileName;
    String finalTable;
    String finalExcel;
    String inboundFile;
    String stagingParent;
    String indexName;
    String stagingTable;
    String inboundExcelSheet;
    String inboundFolder;
    String stagingExcel;
    String finalParent;
    String columnName1;
    String equalsColumn1;

    int configHeaderDocRow = 0;
    int headerStagingDocRow = 2;
    int headerFinalDocRow = 2;
    int headerOutBoundDocRow = 21;
    int headerColumnsExpected = 34;
    int totalRow = 0;

    public leiTest() throws AWTException {
    }

    @Test
    public void testDemo() throws SQLException, IOException {
        excelConfigDataMap = new dlConfigMap().readAllRows(configExcelSheet, configHeaderDocRow,configExcelName);
        System.out.println(excelConfigDataMap.toString());
       int i = 1;
        String[] prevArray = getPrevDateArray();
        for (int k = 0; k < excelConfigDataMap.size(); k++) {
//            excelConfigDataMap.get("row" + i).get("Table Name").toString();
            System.out.println(excelConfigDataMap.get("row" + i));
            orderBy = excelConfigDataMap.get("row" + i).get("OrderBy").toString();
            sourceFileName = excelConfigDataMap.get("row" + i).get("sourceFileName").toString();
            finalTable = excelConfigDataMap.get("row" + i).get("finalTable").toString();
            finalExcel = excelConfigDataMap.get("row" + i).get("finalExcel").toString();
            inboundFile = excelConfigDataMap.get("row" + i).get("inboundFile").toString();
            stagingParent = excelConfigDataMap.get("row" + i).get("stagingParent").toString();
            indexName = excelConfigDataMap.get("row" + i).get("indexName").toString();
            stagingTable = excelConfigDataMap.get("row" + i).get("stagingTable").toString();
            inboundExcelSheet = excelConfigDataMap.get("row" + i).get("inboundExcelSheet").toString();
            inboundFolder = excelConfigDataMap.get("row" + i).get("inboundFolder").toString();
            stagingExcel = excelConfigDataMap.get("row" + i).get("stagingExcel").toString();
            finalParent = excelConfigDataMap.get("row" + i).get("finalParent").toString();
            columnName1 = excelConfigDataMap.get("row" + i).get("columnName1").toString();
            equalsColumn1 = excelConfigDataMap.get("row" + i).get("equalsColumn1").toString();
//            loadConfig();
//            readConfigFromExcel();
            String queryStaging = common.selectAllFrom + stagingParent + "." + stagingParent + "." + stagingTable + common.orderBy + orderBy;

            //Staging
            //getStaging Doc
            excelStagingDataMap = new dlStagingMap().readAllRows(stagingExcelSheet, headerStagingDocRow);
//            //get sql results
            List<HashMap> rowListStaging = devConnect.connectAndGetHashTableUAT(queryStaging);
            String sourceFileName = rowListStaging.get(1).get("sourcefilename").toString();
            List<String> headersStaging = checkTableStructure(excelStagingDataMap, rowListStaging, headerStagingDocRow, tableNameStaging, "Table Name");
            String queryFinal = common.selectAllFrom + finalParent + "." + finalParent + "." + finalTable + " " + common.where + " " + columnName1 + " = " + "'" + sourceFileName + "'" + common.orderBy + orderBy;
//            //Final
//            //getFinal Doc
            excelFinalDataMap = new dlFinalMap().readAllRows(finalExcelSheet, headerFinalDocRow);
//            //get sql results
            List<HashMap> rowFinalList = devConnect.connectAndGetHashTableUAT(queryFinal);
            List<String> headersFinal = checkTableStructure(excelFinalDataMap, rowFinalList, headerFinalDocRow, tableNameFinal, "Table / File Name ");
//            //Compare data
            compareRowsBetweenStagingFinalConcat(false, rowListStaging, rowFinalList, totalRow, headersStaging, headersFinal);
            compareNumberOfRows(rowListStaging, rowFinalList, totalRow);
//            //Compare Inbound Files
        rowListStaging = devConnect.connectAndGetHashTableUAT(queryStaging);
            excelInBound = new dlInboundMap().readAllRows( inboundFolder, inboundFile + getDatePrevInbound(), headerOutBoundDocRow, headerColumnsExpected);
//        checkOutboundStructure(excelStagingDataMap, excelOutBound, headerStagingDocRow, tableNameStaging);
            compareRowsBetweenStagingInbound(rowListStaging, excelInBound, totalRow, headersStaging);
        }

    }
}

