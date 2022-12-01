package backend;

import dbconnections.devConnect;
import org.testng.annotations.Test;
import ui.TestMain;
import util.dlLEI;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leiMappingTest extends TestMain {
    Map<String, Map<String, String>> excelInboundDataMap;
    Map<String, Map<String, String>> excelFinalDataMap;
    Map<String, Map<String, String>> excelInBound;
    //Data for each test case that will need to be added
    String tableNameStaging = "stg_bar_mac_fi_l_dlyfacret";
    String inboundSheet = "ISIN_LEI_";
    String tableNameFinal = "msci_barra_fi_facret";
    String finalExcelSheet = "MSCI MAC FI Files";
    String indexName = "'msci_eq_offbmk_universe'";
    String inboundExcelSheet = "BarraOne Eq Stress Test Files";
    String inboundFolder = "BarraOne";
    String todaysDate;
    int headerInboundDocRow = 0;
    int headerFinalDocRow = 2;
    int headerOutBoundDocRow = 21;
    int headerColumnsExpected = 34;
    int totalRow = 2;

    public leiMappingTest() throws AWTException {
    }

    @Test
    public void testDemo() throws SQLException, IOException {
        todaysDate = getDateToday();
////        loadConfig();

        //Staging
        //getStaging Doc
        System.out.println(inboundSheet + todaysDate);
        excelInboundDataMap = new dlLEI().readAllRows(inboundSheet + todaysDate, "GLEIF", inboundSheet + todaysDate, headerInboundDocRow, 2);
        System.out.println(excelInboundDataMap.toString());
        //get sql results
//        List<HashMap> rowListStaging = devConnect.connectAndGetHashTable(queryStaging);
//        checkTableStructure(excelStagingDataMap, rowListStaging, headerStagingDocRow, tableNameStaging);
//
//        //Final
//        //getFinal Doc
//        excelFinalDataMap = new dlFinalMap().readAllRows(finalExcelSheet, headerFinalDocRow);
//        //get sql results
//        List<HashMap> rowFinalList = devConnect.connectAndGetHashTable(queryFinal);
//        checkTableStructure(excelFinalDataMap, rowFinalList, headerFinalDocRow, tableNameFinal);
//
//        //get specific queries for Staging and Final
//        queryFinal = common.getAllFinal+barraOneTables.msci_barra_eq_stress_test.toString()+ common.where+ common.indexName+ common.equals+indexName+ common.and+" "+ common.analysisDate+" "+ common.equals+" '"+getDatePrevFinal()+"'"+ common.orderBy+ common.assetId;
        String queryStaging = null;
        List<HashMap> rowListStaging = devConnect.connectAndGetHashTableUAT(queryStaging);
        String queryFinal = null;
        List<HashMap> rowFinalList = devConnect.connectAndGetHashTableUAT(queryFinal);
//        //Compare data
        compareRowsBetweenStagingInboundGLEIF(rowListStaging, excelInboundDataMap);
        compareRowsBetweenStagingFinalGLEIF(rowListStaging, rowFinalList);
//        compareRowsBetweenStagingFinal(rowListStaging, rowFinalList, totalRow);
//        compareNumberOfRows(rowListStaging, rowFinalList, totalRow);
//        //Compare Inbound Files
//        rowListStaging = devConnect.connectAndGetHashTable(queryStaging);
//        excelInBound = new dlInboundMap().readAllRows(inboundExcelSheet, inboundFolder, inboundFile+getDatePrevInbound(), headerOutBoundDocRow, headerColumnsExpected);
////        checkOutboundStructure(excelStagingDataMap, excelOutBound, headerStagingDocRow, tableNameStaging);

    }
}

