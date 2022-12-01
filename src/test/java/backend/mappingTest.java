package backend;

//import dbconnections.barraOneTables;
import dbconnections.devConnect;
import org.testng.annotations.Test;
import sqlQueries.common;
import ui.TestMain;
import util.dlFinalMap;
import util.dlInboundMap;
import util.dlStagingMap;

import java.awt.*;
import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mappingTest extends TestMain {
    Map<String, Map<String, String>> excelStagingDataMap;
    Map<String, Map<String, String>> excelFinalDataMap;
    Map<String, Map<String, String>> excelInBound;
    //Data for each test case that will need to be added
    String tableNameStaging = "stg_bar_mac_fi_l_dlyfacret";
    String stagingExcelSheet = "MSCI MAC FI Files";
    String tableNameFinal = "msci_barra_fi_facret";
    String finalExcelSheet = "MSCI MAC FI Files";
    String indexName = "'msci_eq_offbmk_universe'";
    String inboundExcelSheet = "BarraOne Eq Stress Test Files";
    String inboundFolder = "BarraOne";
    String prevDate;
    int headerStagingDocRow = 2;
    int headerFinalDocRow = 2;
    int headerOutBoundDocRow = 21;
    int headerColumnsExpected = 34;
    int totalRow = 0;

    public mappingTest() throws AWTException {
    }

    @Test
    public void testDemo() throws SQLException, IOException {
        prevDate = getDatePrevStaging();
//        loadConfig();
//        String queryFinal = common.getAllFinal + barraOneTables.msci_barra_eq_stress_test.toString() + common.where + indexName + common.equals + indexName;
//        //Staging
//        //getStaging Doc
//        excelStagingDataMap = new dlStagingMap().readAllRows(stagingExcelSheet, headerStagingDocRow);
//        //get sql results
//        List<HashMap> rowListStaging = devConnect.connectAndGetHashTable(queryStaging);
//        List<String> headersStaging = checkTableStructure(excelStagingDataMap, rowListStaging, headerStagingDocRow, tableNameStaging,"Table Name");
//
//        //Final
//        //getFinal Doc
//        excelFinalDataMap = new dlFinalMap().readAllRows(finalExcelSheet, headerFinalDocRow);
//        //get sql results
//        List<HashMap> rowFinalList = devConnect.connectAndGetHashTable(queryFinal);
//        List<String> headersFinal = checkTableStructure(excelFinalDataMap, rowFinalList, headerFinalDocRow, tableNameFinal,"Table / File Name");
//
//        //get specific queries for Staging and Final
//        queryFinal = common.getAllFinal + barraOneTables.msci_barra_eq_stress_test.toString() + common.where + common.indexName + common.equals + indexName + common.and + " " + common.analysisDate + " " + common.equals + " '" + getDatePrevFinal() + "'" + common.orderBy + common.assetId;
//        rowListStaging = devConnect.connectAndGetHashTable(queryStaging);
//        rowFinalList = devConnect.connectAndGetHashTable(queryFinal);
//        //Compare data
//        compareRowsBetweenStagingFinalConcat(false, rowListStaging, rowFinalList, totalRow, headersStaging,headersFinal);
//        compareNumberOfRows(rowListStaging, rowFinalList, totalRow);
//        //Compare Inbound Files
//        rowListStaging = devConnect.connectAndGetHashTable(queryStaging);
        String inboundFile = null;
        excelInBound = new dlInboundMap().readAllRows( inboundFolder, inboundFile + getDatePrevInbound(), headerOutBoundDocRow, headerColumnsExpected);
//        checkOutboundStructure(excelStagingDataMap, excelOutBound, headerStagingDocRow, tableNameStaging);
//        compareRowsBetweenStagingInbound(rowListStaging, excelInBound, totalRow);
    }
}

