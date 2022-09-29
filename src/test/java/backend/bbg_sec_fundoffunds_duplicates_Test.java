package backend;

import dbconnections.devConnect;
import org.junit.Assert;
import org.testng.annotations.Test;
import sqlQueries.common;
import ui.TestMain;
import util.dlHistoricalMap;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bbg_sec_fundoffunds_duplicates_Test extends TestMain {
    Map<String, Map<String, String>> prevTableMap;
    List<String> excelFinalDataMap;
    List<String> fileInBound;
    //Data for each test case that will need to be added

    String finalTable;
    String finalTableExcelLookup;
    String finalExcelSheet;
    String finalParent;


    int configHeaderDocRow = 0;
    int headerStagingDocRow;
    int headerFinalDocRow;
    int headerOutBoundDocRow = 0;
    int headerColumnsExpected = 1;
    int totalRow = 0;
    int inboundStart = 1;

    public bbg_sec_fundoffunds_duplicates_Test() throws AWTException {
    }

    @Test
    public void testDemo() throws SQLException, IOException {
        String queryFinal = common.selectAllFrom +  "MarketData.MarketData.sec_fundoffunds_fi";
        List<HashMap> currentTableMap = devConnect.connectAndGetHashTableDEV(queryFinal);
//        new dlHistoricalMap().writeToFile(currentTableMap.toString());

        excelFinalDataMap = new dlHistoricalMap().readFile(25);
//        System.out.println(excelFinalDataMap.toString());
//        System.out.println(excelFinalDataMap.get(2));
//        System.out.println(excelFinalDataMap.size());


        List headers = new dlHistoricalMap().getHeaders(excelFinalDataMap,25);
        prevTableMap = new dlHistoricalMap().fileContentsToMap(excelFinalDataMap,25, headers);
        System.out.println(prevTableMap.size());
        int row = 0;
        for(int i = 0; i<currentTableMap.size(); i++ ) {

//            System.out.println("sql: " + currentTableMap.get(i+1));
//            System.out.println("sql: " + currentTableMap.get(i).get(headers.get(18).toString().trim()));
//            System.out.println("Prev Note: " + prevTableMap.get("row" + row+1));
//            System.out.println("Prev Note: " + prevTableMap.get("row" + row).get(headers.get(18)).trim());
            if (currentTableMap.get(i).get("idBbUnique")==null||currentTableMap.get(i).get("idBbUnique").toString().contentEquals("")) {
//                System.out.println("Test row");
            } else {
                for (int j = 0; j < prevTableMap.size(); j++) {
                    if (prevTableMap.get("row" + j).get("idBbUnique")==null|| prevTableMap.get("row" + j).get("idBbUnique").toString().contentEquals("")) {
                    }else {
                        if (currentTableMap.get(i).get("idBbUnique").toString().trim().contentEquals(prevTableMap.get("row" + j).get("idBbUnique").trim())) {
//                            System.out.println("header: " + currentTableMap.get(i).get(headers.get(18)));
//                            System.out.println("header: " + prevTableMap.get("row" + j).get(headers.get(18)).trim());
                            row = j;
                            break;
                        }
                    }
                }
                for (int k = 0; k < 25; k++) {
//                    System.out.println("i: " + i);
//                    System.out.println("j: " + row);
//                    System.out.println("header: " + headers.get(k));
//                    System.out.println("sql: " + currentTableMap.get(i));
//                    System.out.println("sql: " + currentTableMap.get(i).get(headers.get(k).toString().trim()));
//                    System.out.println("Prev Note: " + prevTableMap.get("row" + (row)));
//                    System.out.println("Prev Note: " + prevTableMap.get("row" + row).get(headers.get(k)).trim());
                    if(i==44875){
                        System.out.println("sql: " + currentTableMap.get(i));
                    System.out.println("sql: " + currentTableMap.get(i).get(headers.get(k).toString().trim()));
                    System.out.println("Prev Note: " + prevTableMap.get("row" + (row)));
                    System.out.println("Prev Note: " + prevTableMap.get("row" + row).get(headers.get(k)).trim());
                    }
                    if(i==44876){
                        System.out.println("sql: " + currentTableMap.get(i));
                    System.out.println("sql: " + currentTableMap.get(i).get(headers.get(k).toString().trim()));
                    System.out.println("Prev Note: " + prevTableMap.get("row" + (row)));
                    System.out.println("Prev Note: " + prevTableMap.get("row" + row).get(headers.get(k)).trim());
//                System.out.println("sql: " + currentTableMap.get(i));
                    }
                    Assert.assertTrue(currentTableMap.get(i).get(headers.get(k)).toString().replace("!#!", ",").trim().equals(prevTableMap.get("row" + row).get(headers.get(k)).toString().replace("!#!", ",").trim()));
                }
//        new dlHistoricalMap().(currentTableMap.toString());
            }
        }
    }

}

