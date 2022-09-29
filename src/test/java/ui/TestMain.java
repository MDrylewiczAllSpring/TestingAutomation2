package ui;

import org.junit.Assert;
import pages.pagesMain;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.*;


import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.Assert.assertThat;

//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
public class TestMain extends pagesMain {


    public TestMain() throws AWTException {
    }

    public String getAll(String query, String tableName) {
//        System.out.println("SQL Query: " + query + tableName);
        return query + tableName;
    }

    public List<String> checkTableStructure(Map<String, Map<String, String>> excelDataMap, List<HashMap> rowList, int headerRow, String tableName, String columnName) {
        System.out.println("Checking " + tableName + " table Structure");
        List<String> tableNameExcelList = getRowsForTableInExcel(excelDataMap, columnName, headerRow, tableName);
        List<String> tableColumn2ExcelList = getColumnsForTableInExcel(tableNameExcelList, excelDataMap, rowList, headerRow, tableName);
        List<String> headers = checkHeaders(tableColumn2ExcelList, rowList);
//        checkForPK(tableNameExcelList, tableColumn2ExcelList, excelDataMap, rowList, headerRow, tableName);
//        checkForLength(tableNameExcelList, excelDataMap, tableColumn2ExcelList, rowList, headerRow, tableName);
        return headers;
    }

    public void checkOutboundStructure(Map<String, Map<String, String>> excelDataMap, Map<String, Map<String, String>> outgoingExcelMap, int headerRow, String tableName) {
        System.out.println("Checking " + tableName + " table Structure");
        checkHeadersOutgoing(excelDataMap, outgoingExcelMap, headerRow, tableName);
        checkForPKOutgoing(excelDataMap, outgoingExcelMap, headerRow, tableName);
        checkForLengthOutgoing(excelDataMap, outgoingExcelMap, headerRow, tableName);
    }


    public void checkForPK(List<String> tableNameList, List<String> tableColumn2List, Map<String, Map<String, String>> excelDataMap, List<HashMap> rowList, int headerRow, String tableName) {
        List<String> tableNullList = new ArrayList<String>();
        //Gets PK's from column names
        for (int i = 0; i < tableColumn2List.size(); i++) {
//            System.out.println(excelDataMap.get(tableNameList.get(i)).get("Nullable (Y/N)2"));
//            if (!(excelDataMap.get(tableNameList.get(i)).get("Nullable (Y/N)2")).isEmpty()||excelDataMap.get(tableNameList.get(i)).get("Nullable (Y/N)2").contentEquals("N")) {
            if (excelDataMap.get(tableNameList.get(i)).get("Nullable (Y/N)2").contentEquals("N")) {
            tableNullList.add(excelDataMap.get(tableNameList.get(i)).get("Column Name2"));
            }
        }
        //Check if the PK is empty
        for (int i = 0; i < tableNullList.size(); i++) {
            for (int j = 0; j < rowList.size(); j++) {
//                System.out.println(rowList.get(j));
//                System.out.println(tableNullList.get(i));
//                System.out.println(rowList.get(j).get(tableNullList.get(i).replace("[","").replace("]","")));
                Assert.assertFalse(rowList.get(j).get(tableNullList.get(i).replace("[","").replace("]","")).toString().isEmpty());
            }
        }
    }

    public void checkForPKOutgoing(Map<String, Map<String, String>> excelDataMap, Map<String, Map<String, String>> rowList, int headerRow, String tableName) {
        List<String> tableNameList = new ArrayList<String>();
        List<String> tableColumn2List = new ArrayList<String>();
        List<String> tableNullList = new ArrayList<String>();
        for (int i = headerRow + 1; i < excelDataMap.size(); i++) {
//            System.out.println(excelDataMap.get("row" + i));
//            System.out.println(excelDataMap.get("row"+i).get("Table Name"));
            if (excelDataMap.get("row" + i).get("Table Name").equals(tableName)) {
                tableNameList.add("row" + i);
            }
        }
        for (int i = 0; i < tableNameList.size(); i++) {
            if (!(excelDataMap.get(tableNameList.get(i)).get("Column Name2")).isEmpty()) {
                tableColumn2List.add(excelDataMap.get(tableNameList.get(i)).get("Column Name2"));
            }
        }
        for (int i = 0; i < tableColumn2List.size(); i++) {
//            System.out.println(excelDataMap.get(tableNameList.get(i)).get("Nullable (Y/N)2"));
            if (!(excelDataMap.get(tableNameList.get(i)).get("Nullable (Y/N)2")).isEmpty()) {
                tableNullList.add(excelDataMap.get(tableNameList.get(i)).get("Column Name2"));
            }
        }
        for (int i = 0; i < tableNullList.size(); i++) {
            for (int j = 1; j < rowList.size(); j++) {
//                System.out.println(rowList.toString());
//                System.out.println(rowList.get(j).get(tableNullList.get(i)).toString());
                Assert.assertFalse(rowList.get(j).get(tableNullList.get(i)).toString().isEmpty());
            }
        }
    }

    public void checkForLength(List<String> tableNameList, Map<String, Map<String, String>> excelDataMap, List<String> tableColumn2List, List<HashMap> rowList, int headerRow, String tableName) {
        List<String> tableLengthColumnList = new ArrayList<String>();
        Map<String, Integer> columnLengthMap = new HashMap<String, Integer>();;
        //get Length Limits from Column names
        for (int i = 0; i < tableColumn2List.size(); i++) {
//            System.out.println(excelDataMap.get(tableNameList.get(i)).get("Length2"));
            if (!(excelDataMap.get(tableNameList.get(i)).get("Length2")).isEmpty()) {
                if (!excelDataMap.get(tableNameList.get(i)).get("Length2").contains("N/A")) {
                    if (!excelDataMap.get(tableNameList.get(i)).get("Length2").contains("IDENTITY(1,1)")) {
                        int tempLength = Integer.valueOf(excelDataMap.get(tableNameList.get(i)).get("Length2").replace(".0", ""));
                        String tempColumn = excelDataMap.get(tableNameList.get(i)).get("Column Name2").replace("[", "").replace("]", "");
//                        System.out.println(tempLength);
//                        System.out.println(tempColumn);
                        columnLengthMap.put(tempColumn, tempLength);
                        tableLengthColumnList.add(tempColumn);
                    }
                }
            }
        }
        //Assert if the
        if (columnLengthMap != null) {
            for(int i = 0; i < rowList.size(); i++) {
                for (int k = 0; k < columnLengthMap.size(); k++) {
                    System.out.println("row: "+ i);
                    System.out.println(columnLengthMap);
                    System.out.println(rowList.toString());
                    System.out.println(columnLengthMap.size());
                    System.out.println(rowList.size());
                    if (rowList.get(i).get(tableLengthColumnList.get(k)) != null) {

//                        System.out.println(rowList.get(i).get(tableLengthColumnList.get(k)));

                        int length = columnLengthMap.get(tableLengthColumnList.get(k));
//                        System.out.println(length);
                        Assert.assertTrue(rowList.get(i).get(tableLengthColumnList.get(k)).toString().length() < length);
                    }

                }
            }
        }
    }

    public void checkForLengthOutgoing(Map<String, Map<String, String>> excelDataMap, Map<String, Map<String, String>> rowList, int headerRow, String tableName) {
        List<String> tableNameList = new ArrayList<String>();
        List<String> tableColumn2List = new ArrayList<String>();
        List<String> tableLengthColumnList = new ArrayList<String>();
        Map<String, Integer> columnLengthMap = null;
        for (int i = headerRow + 1; i < excelDataMap.size(); i++) {
//            System.out.println(excelDataMap.get("row" + i));
//            System.out.println(excelDataMap.get("row"+i).get("Table Name"));
            if (excelDataMap.get("row" + i).get("Table Name").equals(tableName)) {
                tableNameList.add("row" + i);
            }
        }
        for (int i = 0; i < tableNameList.size(); i++) {
            if (!(excelDataMap.get(tableNameList.get(i)).get("Column Name2")).isEmpty()) {
                tableColumn2List.add(excelDataMap.get(tableNameList.get(i)).get("Column Name2"));
            }
        }
        for (int i = 0; i < tableColumn2List.size(); i++) {
//            System.out.println(excelDataMap.get(tableNameList.get(i)).get("Length2"));
            if (!(excelDataMap.get(tableNameList.get(i)).get("Length2")).isEmpty()) {
                columnLengthMap.put(excelDataMap.get(tableNameList.get(i)).get("Column Name2"), Integer.valueOf(excelDataMap.get(tableNameList.get(i)).get("Length2")));
            }
        }
        if (columnLengthMap != null) {
            for (int i = 0; i < columnLengthMap.size(); i++) {
                for (int j = 1; j < rowList.size(); j++) {
//                System.out.println(rowList.toString());
//                    System.out.println(rowList.get(j).get(columnLengthMap.get(i)).toString());
                    Assert.assertFalse(rowList.get(j).get(columnLengthMap.get(i)).toString().isEmpty());
                }
            }
        }
    }

    public List<String> getRowsForTableInExcel(Map<String, Map<String, String>> excelDataMap, String columnName, int headerRow, String tableName) {

        List<String> tableNameList = new ArrayList<String>();
//        System.out.println(excelDataMap.toString());
//        excelDataMap.get(excelDataMap.get("row" + headerRow));
        //starting at header row, go through the excel and get data that equals the Table name we are looking for
        int addon = 0;
        for (int i = headerRow; i <= excelDataMap.size() + headerRow; i++) {
//            System.out.println("row" + i);
//            System.out.println(excelDataMap.get("row" + i));
//          System.out.println(excelDataMap.get(i).get("Table Name").toString());
//            if(i==141){
//                System.out.println(excelDataMap.get("row" + i));
//            }
            if (excelDataMap.get("row" + i) != null) {
                if(excelDataMap.get("row" + i).get(columnName)!=null) {
//                    System.out.println(tableName);
//                    System.out.println(excelDataMap.get("row" + i).get(columnName).toString());
                    if (excelDataMap.get("row" + i).get(columnName).toString().equals(tableName)) {
                        tableNameList.add("row" + i);
                    }
                }
            } else {
                addon++;
            }
        }
        return tableNameList;
    }

    public List<String> getColumnsForTableInExcel(List<String> tableNameList, Map<String, Map<String, String>> excelDataMap, List<HashMap> rowList, int headerRow, String tableName) {

        List<String> tableColumn2List = new ArrayList<String>();

        //Now with the data for the Table we are looking for, we look for the Column names to match up against
        for (int i = 0; i < tableNameList.size(); i++) {
            if (!(excelDataMap.get(tableNameList.get(i)).get("Column Name2")).isEmpty()) {
                tableColumn2List.add(excelDataMap.get(tableNameList.get(i)).get("Column Name2").replace("[", "").replace("]", ""));
            }

        }
        return tableColumn2List;
    }

    public List<String> checkHeaders(List<String> tableColumn2ExcelList, List<HashMap> rowList) {

//        System.out.println(tableColumn2List.toString());
//        System.out.println(rowList.toString());
        //Last we search in the query for the column name added, we assert that what we searched for isn't empty
        for (int i = 0; i < tableColumn2ExcelList.size(); i++) {
            System.out.println(tableColumn2ExcelList.get(i));
            System.out.println(rowList.get(0));

//            if(!tableColumn2List.get(i).equals("Factor")) {
                Assert.assertTrue(rowList.get(0).containsKey(tableColumn2ExcelList.get(i)));
//            }

        }
        return tableColumn2ExcelList;
    }

    public void checkHeadersOutgoing(Map<String, Map<String, String>> excelDataMap, Map<String, Map<String, String>> outgoingExcelMap, int headerRow, String tableName) {
        List<String> tableNameList = new ArrayList<String>();
        List<String> tableColumn2List = new ArrayList<String>();
        System.out.println(excelDataMap.toString());
//        excelDataMap.get(excelDataMap.get("row" + headerRow));
        for (int i = headerRow + 1; i < excelDataMap.size(); i++) {
//            System.out.println("row"+i);
//            System.out.println(excelDataMap.get("row"+i).get("Table Name"));
            if (excelDataMap.get("row" + i).get("Table Name").equals(tableName)) {
                tableNameList.add("row" + i);
            }
        }
        for (int i = 0; i < tableNameList.size(); i++) {
            if (!(excelDataMap.get(tableNameList.get(i)).get("Column Name2")).isEmpty()) {
                tableColumn2List.add(excelDataMap.get(tableNameList.get(i)).get("Column Name2"));
            }

        }
//        System.out.println(rowList.get(0).get("scenario").toString());
//        System.out.println(tableColumn2List.toString());
        for (int i = 0; i < tableColumn2List.size(); i++) {
//            System.out.println(rowList.get(0).get(tableColumn2List.get(i)).toString());
//            Assert.assertFalse(rowList.get(0).get(tableColumn2List.get(i)).toString().isEmpty());
        }
    }

    public void compareNumberOfRows(List<HashMap> rowStagingList, List<HashMap> rowFinalList, int totalRow) {
        int staging = rowStagingList.size() - 1;
        int finalS = rowFinalList.size();
        Assert.assertTrue(((rowStagingList.size() - 1) * 26) == rowFinalList.size());
    }

    public void compareNumberOfRowsExact(List<HashMap> rowStagingList, List<HashMap> rowFinalList, int totalRow) {
        int staging = rowStagingList.size();
        int finalS = rowFinalList.size();
//        System.out.println("Sizes, Staging: "+staging + " Final:"+ finalS);
        Assert.assertTrue(rowStagingList.size() == rowFinalList.size());
    }

    public void compareRowsBetweenStagingFinalConcat(Boolean concat, List<HashMap> rowStagingList, List<HashMap> rowFinalList, int totalRow, List<String> headersStaging, List<String> headersFinal) {
//        System.out.println(headersStaging.toString());
//        System.out.println(headersFinal.toString());
//        System.out.println(rowStagingList.size());
//        System.out.println(rowFinalList.size());
//        System.out.println(headersStaging.toString());
//        System.out.println(headersFinal.toString());
//        System.out.println(headersStaging.size());
//        System.out.println(headersFinal.size());
//        System.out.println(rowStagingList);
        Object stagingValue;
        Object finalValue;
        if(!concat){
            for (int i = 0; i < rowStagingList.size() - 1; i++) {
                for (int k = 0; k < headersStaging.size(); k++) {
//                    System.out.println("Row: " + i);
//                    System.out.println("Staging: " + rowStagingList.get(i));
//                    System.out.println("Final: " + rowFinalList.get(i));
//                    System.out.println("Staging: " + headersStaging.get(k));
//                    System.out.println("Final: " + headersFinal.get(k));
                    stagingValue = rowStagingList.get(i).get(headersStaging.get(k));
                    finalValue = rowFinalList.get(i).get(headersFinal.get(k));
//                boolean result = rowStagingList.get(i).get(headersStaging.get(k)).toString().matches("[0-9]+");
                    if (stagingValue == null || finalValue == null) {
                        if (headersStaging.get(k).contains("Factor")) {

                        } else {
                            Assert.assertTrue(stagingValue == null);
                            Assert.assertTrue(finalValue == null);
                        }
                    } else {
//                        System.out.println(stagingValue);
//                        System.out.println(finalValue);
                        if (stagingValue.toString().contains("-") || stagingValue.toString().contains("/") || finalValue.toString().contains("-") || finalValue.toString().contains("/")) {
//                            System.out.println("Is a date");
                        } else {
                            if (isNumeric(stagingValue.toString())&&isNumeric(finalValue.toString())) {
                                compareBigENumbers(stagingValue.toString(), finalValue.toString());
                            } else {
                                Assert.assertTrue(stagingValue.toString().trim().equals(finalValue.toString().trim()));
                            }
                        }
                    }
                }
            }
        }

        else {
            int scenarioCounter = 0;
            for (int s = 0; s < headersStaging.size(); s++) {
                if (headersStaging.get(s).toString().contains("scenario")) {
                    scenarioCounter++;
                }
            }
            int scenarioIncrement = 0;
            int stagingRow = 0;

            for (int i = 0; i < rowStagingList.size(); i++) {
                for (int k = 0; k < headersStaging.size(); k++) {
                    if (scenarioIncrement == scenarioCounter) {
                        stagingRow++;
                        scenarioIncrement = 0;
                    }
                    System.out.println("Row: " + k);
                    finalValue = rowStagingList.get(scenarioIncrement);
                    stagingValue = rowStagingList.get(i).get(headersStaging.get(k));
                    System.out.println(stagingValue);
                    System.out.println(finalValue);
                    if (stagingValue == null || finalValue == null) {
                        if (headersStaging.get(k).contains("Factor")) {

                        } else {
                            Assert.assertTrue(stagingValue == null);
                        }
                    } else {
                        if (finalValue.toString().contains("-") || finalValue.toString().contains("/")) {
                            System.out.println("Is a date");
                        } else {
                            boolean numberB = isNumeric(stagingValue.toString());
                            if (numberB) {
                                compareBigENumbersContains(finalValue.toString(), stagingValue.toString());
                            } else {
                                Assert.assertTrue(stagingValue.toString().contains(finalValue.toString()));
                            }
                        }
                    }
                }

                scenarioIncrement++;
            }
        }

    }

    public void compareRowsBetweenStagingInbound(List<HashMap> rowStagingList, Map<String, Map<String, String>> outGoingExcel, int minusColumn, List<String> headersStaging) {
        Object stagingValue;
        Object inboundValue;
        for (int i = 0; i < outGoingExcel.size() - 1; i++) {
            for (int k = 0; k < headersStaging.size()-minusColumn; k++) {
//                System.out.println("Row: " + i);
//                System.out.println("header: " + headersStaging.get(k));
//                System.out.println(outGoingExcel.get("row"+(i+1)));
                stagingValue = rowStagingList.get(i).get(headersStaging.get(k));
                inboundValue = outGoingExcel.get("row"+(i+1)).get(headersStaging.get(k));
//                System.out.println(stagingValue);
//                System.out.println(inboundValue);
//                boolean result = rowStagingList.get(i).get(headersStaging.get(k)).toString().matches("[0-9]+");
                if (stagingValue == null || inboundValue == null) {
                    if (stagingValue == "" || inboundValue == "") {
                    } else {
                        Assert.assertTrue(stagingValue == null);
                        Assert.assertTrue(inboundValue == null);
                    }
                } else {
                    if (stagingValue.toString().contains("-") || stagingValue.toString().contains("/") || inboundValue.toString().contains("-") || inboundValue.toString().contains("/")) {
                        System.out.println("Is a date");
                    } else {
                        if (isNumeric(stagingValue.toString())&&isNumeric(inboundValue.toString())) {
                            compareBigENumbers(stagingValue.toString(), inboundValue.toString());
                        } else {
                            Assert.assertTrue(stagingValue.toString().equals(inboundValue.toString()));
                        }
                    }
                }
            }
        }


    }

    public void compareRowsBetweenStagingInboundGLEIF(List<HashMap> rowStagingList, Map<String, Map<String, String>> outGoingExcel) {
        int k = 0;
        System.out.println("Staging size: " + rowStagingList.size());
        System.out.println("Excel size: " + outGoingExcel.size());
        System.out.println("Staging Table Full: ");
        System.out.println(rowStagingList.toString());
        System.out.println("Staging Table: ");
        for (int i = 0; i < rowStagingList.size(); i++) {
            System.out.println("staging row " + i + ": " + rowStagingList.get(i).get("LEI").toString());
        }
        System.out.println("Excel Table: ");
        for (int i = 0; i < rowStagingList.size(); i++) {
            System.out.println("Excel row " + i + ": " + outGoingExcel.get("row" + i).get("LEI").toString());
        }
        for (int i = 0; i < rowStagingList.size(); i++) {
            System.out.println("staging: " + rowStagingList.get(i).get("LEI").toString());
            System.out.println("Excel: " + outGoingExcel.get("row" + i).get("LEI"));
            System.out.println("staging: " + rowStagingList.get(i).get("ISIN").toString());
            System.out.println("Excel: " + outGoingExcel.get("row" + i).get("ISIN"));
            Assert.assertTrue(rowStagingList.get(i).get("LEI").toString().equals(outGoingExcel.get("row" + i).get("LEI")));
            Assert.assertTrue(rowStagingList.get(i).get("ISIN").toString().equals(outGoingExcel.get("row" + i).get("ISIN")));
        }
    }

    public void compareRowsBetweenStagingFinalGLEIF(List<HashMap> rowStagingList, List<HashMap> rowFinalList) {
        int k = 0;
        System.out.println("Staging size: " + rowStagingList.size());
        System.out.println("Final size: " + rowFinalList.size());
        for (int i = 0; i < rowStagingList.size(); i++) {
            System.out.println("staging: " + rowStagingList.get(i).get("LEI").toString());
            System.out.println("Final: " + rowFinalList.get(i).get("LEI"));
            System.out.println("staging: " + rowStagingList.get(i).get("ISIN").toString());
            System.out.println("Final: " + rowFinalList.get(i).get("ISIN"));
            Assert.assertTrue(rowStagingList.get(i).get("LEI").toString().equals(rowFinalList.get(i).get("LEI")));
            Assert.assertTrue(rowStagingList.get(i).get("ISIN").toString().equals(rowFinalList.get(i).get("ISIN")));
        }
    }

    public String[] getPrevDateArray() {
        Calendar cal = Calendar.getInstance();
        //subtracting a day or 3 depending on Monday
        if (cal.get(Calendar.DAY_OF_WEEK) == 2) {
            cal.add(Calendar.DATE, -3);
        } else {
            cal.add(Calendar.DATE, -1);
        }
        SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
        String[] array = s.format(new Date(cal.getTimeInMillis())).split("\\/");

        return array;
    }

    public String getDateToday() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat s = new SimpleDateFormat("yyyyMMdd");
        return s.format(new Date(cal.getTimeInMillis()));
    }

    public String getDatePrevStaging() {
        Calendar cal = Calendar.getInstance();
        //subtracting a day or 3 depending on Monday
        if (cal.get(Calendar.DAY_OF_WEEK) == 2) {
            cal.add(Calendar.DATE, -3);
        } else {
            cal.add(Calendar.DATE, -1);
        }
        SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd");
        return s.format(new Date(cal.getTimeInMillis()));
    }

    public String getDatePrevFinal() {
        int dayMinus = 1;
        Calendar cal = Calendar.getInstance();
        //subtracting a day or 3 depending on Monday
        if (cal.get(Calendar.DAY_OF_WEEK) == 2) {
            cal.add(Calendar.DATE, -3);
        } else {
            cal.add(Calendar.DATE, -1);
        }

        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        return s.format(new Date(cal.getTimeInMillis()));
    }

    public String getDatePrevInbound() {
        int dayMinus = 1;
        Calendar cal = Calendar.getInstance();
        //subtracting a day or 3 depending on Monday
        if (cal.get(Calendar.DAY_OF_WEEK) == 2) {
            cal.add(Calendar.DATE, -3);
        } else {
            cal.add(Calendar.DATE, -1);
        }

        SimpleDateFormat s = new SimpleDateFormat("yyyyMMdd");
        return s.format(new Date(cal.getTimeInMillis()));
    }

    public String loadConfig() throws IOException {
        Properties prop = new Properties();
        String fileName = "indexConfig.config";
        FileInputStream fis = new FileInputStream(fileName);
        prop.load(fis);
        System.out.println(configLine);
//        System.out.println(prop.getProperty("app.version"));
        return configLine;
    }

//    public void jiraConfig() throws Exception {
////        startServer serverStart = new startServer();
//        myJiraClient2 myJiraClient = new myJiraClient2();
//        Issue issue;
////        issue = myJiraClient2.getIssue("WLHB-3448");
////        Issue issue = new myJiraClient2.getIssue("WLHB-3448");
////        Object jiraKey = null;
////        assertThat(issue.getKey(), is(jiraKey));
//    }

//    public MyJiraClient(String username, String password, String jiraUrl) {
//        this.username = username;
//        this.password = password;
//        this.jiraUrl = jiraUrl;
//        this.restClient = getJiraRestClient();
//    }
//    private JiraRestClient getJiraRestClient() {
//        return new AsynchronousJiraRestClientFactory()
//                .createWithBasicHttpAuthentication(getJiraUri(), this.username, this.password);
//    }

    public String readConfigFromExcel() {

        return null;
    }

    public String convertENumberZero(String num) {
        if (num.contains("7.434803E-07")) {
            System.out.println("");
        }

        String[] tempArray = num.split("E");
        if (tempArray.length > 1) {
            if (tempArray[1].equals("01") || tempArray[1].equals("02") || tempArray[1].equals("03") || tempArray[1].equals("04") || tempArray[1].equals("05") || tempArray[1].equals("06") || tempArray[1].equals("07") || tempArray[1].equals("08") || tempArray[1].equals("09") || tempArray[1].equals("-01") || tempArray[1].equals("-02") || tempArray[1].equals("-03") || tempArray[1].equals("-04") || tempArray[1].equals("-05") || tempArray[1].equals("-06") || tempArray[1].equals("-07") || tempArray[1].equals("-08") || tempArray[1].equals("-09")) {
                tempArray[1] = tempArray[1].replace("0", "");
                num = tempArray[0] + "E" + tempArray[1];
            }
        }
        return num;
    }

    public void compareBigENumbers(String num1, String num2) {

        num1 = String.valueOf(Double.parseDouble(num1));
        num2 = String.valueOf(Double.parseDouble(num2));
        String[] tempArray1 = num1.split("E");
        String[] tempArray2 = num2.split("E");
        if (tempArray1.length > 1) {
            if (tempArray1[1].equals("01") || tempArray1[1].equals("02") || tempArray1[1].equals("03") || tempArray1[1].equals("04") || tempArray1[1].equals("05") || tempArray1[1].equals("06") || tempArray1[1].equals("07") || tempArray1[1].equals("08") || tempArray1[1].equals("09") || tempArray1[1].equals("-01") || tempArray1[1].equals("-02") || tempArray1[1].equals("-03") || tempArray1[1].equals("-04") || tempArray1[1].equals("-05") || tempArray1[1].equals("-06") || tempArray1[1].equals("-07") || tempArray1[1].equals("-08") || tempArray1[1].equals("-09")) {
                tempArray1[1] = tempArray1[1].replace("0", "");
            }
        }
        if (tempArray2.length > 1) {
            if (tempArray2[1].equals("01") || tempArray2[1].equals("02") || tempArray2[1].equals("03") || tempArray2[1].equals("04") || tempArray2[1].equals("05") || tempArray2[1].equals("06") || tempArray2[1].equals("07") || tempArray2[1].equals("08") || tempArray2[1].equals("09") || tempArray2[1].equals("-01") || tempArray2[1].equals("-02") || tempArray2[1].equals("-03") || tempArray2[1].equals("-04") || tempArray2[1].equals("-05") || tempArray2[1].equals("-06") || tempArray2[1].equals("-07") || tempArray2[1].equals("-08") || tempArray2[1].equals("-09")) {
                tempArray2[1] = tempArray2[1].replace("0", "");
            }
        }
//        if (tempArray1.length > 1) {
//            while (tempArray1[0].length() != tempArray2[0].length()) {
//                if (tempArray1[0].length() > tempArray2[0].length()) {
//                    tempArray1[0] = tempArray1[0].substring(0, tempArray1[0].length() - 1);
//                } else {
//                    tempArray2[0] = tempArray2[0].substring(0, tempArray2[0].length() - 1);
//                }
//
//            }
//        }
        if (tempArray2[0].length() > tempArray1[0].length()) {
            String numOfDecimals = null;
            if (tempArray1[0].contains("-")) {
                numOfDecimals = String.valueOf(tempArray1[0].length() - 3);
            } else {
                numOfDecimals = String.valueOf(tempArray1[0].length() - 2);
            }
            tempArray2[0] = String.format("%." + numOfDecimals + "f", Double.parseDouble(tempArray2[0]));
            num2 = tempArray2[0] + "E" + tempArray2[1];
        }
//        System.out.println(num1);
//        System.out.println(num2);
        Assert.assertTrue(num1.equals(num2));
    }
    public void compareBigENumbersContains(String stagingRow, String num2) {
        System.out.println(stagingRow);
        System.out.println(num2);
        num2 = String.valueOf(Double.parseDouble(num2));
        String[] tempArray2 = num2.split("E");
        if (tempArray2.length > 1) {
            if (tempArray2[1].equals("01") || tempArray2[1].equals("02") || tempArray2[1].equals("03") || tempArray2[1].equals("04") || tempArray2[1].equals("05") || tempArray2[1].equals("06") || tempArray2[1].equals("07") || tempArray2[1].equals("08") || tempArray2[1].equals("09") || tempArray2[1].equals("-01") || tempArray2[1].equals("-02") || tempArray2[1].equals("-03") || tempArray2[1].equals("-04") || tempArray2[1].equals("-05") || tempArray2[1].equals("-06") || tempArray2[1].equals("-07") || tempArray2[1].equals("-08") || tempArray2[1].equals("-09")) {
                tempArray2[1] = tempArray2[1].replace("0", "");
            }
        }
        System.out.println(num2);
        Assert.assertTrue(stagingRow.contains(num2));
    }

    public void noteCompare(List<HashMap> rowStagingList, String inboundLine, int startRow, List<String> headersStaging) {
        String stagingValue;
        String inboundValue;
        String[] tempArray2;


        for (int i = startRow; i < tempArray1.length - startRow; i++) {
            System.out.println("Line"+i+": "+tempArray1[i].toString());
            tempArray1[i].replaceAll(", \",","*@*,");
            if(tempArray1[i].contentEquals("*@*")){
                tempArray2 = tempArray1[i].split(",");

            }else{
                tempArray2 = tempArray1[i].split(",");
            }

            for (int k = 0; k < headersStaging.size()-3; k++) {
                stagingValue = rowStagingList.get(i-1).get(headersStaging.get(k)).toString();
                inboundValue = tempArray2[k].toString();
                if(inboundValue.contains("*@*")){
                    inboundValue = inboundValue.replace("*@*",",");
                }

                System.out.println(stagingValue);
                System.out.println(inboundValue);
                Assert.assertTrue(stagingValue.toString().equals(inboundValue.toString()));
            }
        }
    }
    public void noteCompareSplit(List<HashMap> rowStagingList, String inboundLine, int startRowNote,int startRowStaging, List<String> headersStaging, String seperator) {
        Object stagingValue;
        Object inboundValue;
        String[] tempArray2 = null;

        System.out.println(headersStaging.toString());
        for (int i = startRowNote; i < tempArray1.length - startRowNote; i++) {
//            System.out.println("Line"+i+": "+tempArray1[i].toString());
//            tempArray1[i].replaceAll(", \",","*@*,");
            if(seperator.equals(",")){
                tempArray2 = tempArray1[i].split(",");
            }
            if(seperator.equals("|")){
                tempArray1[i]=tempArray1[i].replaceAll("\\|","~");
//                while(tempArray1[i].contains("~~")){
//                    tempArray1[i]=tempArray1[i].replaceAll("~~","~!@!~");
//                }
                System.out.println("Line"+i+": "+tempArray1[i].toString());
                tempArray2 = tempArray1[i].split("~");
//                System.out.println(tempArray2.toString());
            }

            for (int k = 0; k < headersStaging.size()-3; k++) {
//                System.out.println("headers : "+ headersStaging.toString());
//                System.out.println("k is : "+ k);
                System.out.println(headersStaging.get(k));
                if (rowStagingList.get(i).get(headersStaging.get(k)) == null) {
                    System.out.println("NUll value");
                    System.out.println(rowStagingList.get(i).get(headersStaging.get(k)));
                    System.out.println(tempArray2[k]);
                    if(tempArray2[k].toString().equals("")||tempArray2[k].toString().equals("!@!")||tempArray2[k].toString().isEmpty()){
                        tempArray2[k]=null;
                    }
//                    Assert.assertTrue(tempArray2[k].toString()==null);
                } else {
                    stagingValue = rowStagingList.get(i).get(headersStaging.get(k));
                    inboundValue = tempArray2[k];
                    System.out.println(stagingValue);
                    System.out.println(inboundValue);
                    Assert.assertTrue(stagingValue.toString().equals(inboundValue.toString()));
                }
            }
        }
    }
    public void noteCompareContains(List<HashMap> rowStagingList, String inboundLine, int startRowStaging,int startRowInbound, List<String> headersStaging) {
        Object stagingValue;
        Object inboundValue;
        String[] tempArray2;

        int inboundCounter = startRowInbound;
        for (int i = startRowStaging; i < tempArray1.length - startRowStaging; i++) {
            for (int k = 0; k < headersStaging.size()-2; k++) {
//                System.out.println("headers : "+ headersStaging.toString());
//                System.out.println("k is : "+ k);
                System.out.println(headersStaging.get(k));
                if (rowStagingList.get(i - 1).get(headersStaging.get(k)) == null) {
                    System.out.println("NUll value");
                    System.out.println(rowStagingList.get(i - 1).get(headersStaging.get(k)));
                    System.out.println(tempArray1[k]);
                    if(tempArray1[k].equals("")||tempArray1[k].equals("!@!")){
                        tempArray1[k]=null;
                    }
                    Assert.assertTrue(tempArray1[k] == null);
                } else {
                    stagingValue = rowStagingList.get(i-1).get(headersStaging.get(k));
                    inboundValue = tempArray1[inboundCounter];
                    System.out.println(stagingValue);
                    System.out.println(inboundValue);
                    Assert.assertTrue(inboundValue.toString().contains(stagingValue.toString()));
                    inboundCounter++;
                }
            }
        }
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
            System.out.println(d);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public String minusString(int minusAmt, String strNum) {
        int temp = Integer.parseInt(strNum);
        temp=temp-minusAmt;
        return  String.valueOf(temp);
    }
}
