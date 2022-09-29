package util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class dlInboundMap {
    public static String excelSheetName = "";
    public static FileInputStream fis;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static XSSFRow row;

    public static void loadExcel(String sheetName) {
        System.out.println("Load Excel Sheet.........");
        File file = new File(excelSheetName);
        try {
            fis = new FileInputStream(file);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Map<String, String>> getDataMap(String sheetName) {
        if (sheet == null) {
            loadExcel(sheetName);
        }
        Map<String, Map<String, String>> parentMap = new HashMap<String, Map<String, String>>();
        Map<String, String> childMap = new HashMap<String, String>();
        Iterator<Row> rowIterator = sheet.iterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            System.out.println(row.getCell(0).getStringCellValue());
            System.out.println(row.getCell(1).getStringCellValue());
            childMap.put(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
        }
        parentMap.put("MASTERDATA", childMap);
        return parentMap;

    }

    public static String getValue(String key, String sheetName) {
        Map<String, String> mapValue = getDataMap(sheetName).get("MASTERDATA");
        String retValue = mapValue.get(key);
        return retValue;
    }

    public void readFirstRow(String sheetName, String folderName, String fileName) {
        List<String> fieldsArrayList = new ArrayList<String>();
        try {
            File file = new File(excelSheetName + "/" + folderName + "/" + fileName + ".csv");
            fis = new FileInputStream(file);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetName);
            Row firstRow = sheet.getRow(0);
            int length = firstRow.getLastCellNum();
            Cell cell = null;
            for (int i = 0; i < length; i++) {
                cell = firstRow.getCell(i);
                fieldsArrayList.add(cell.toString());

            }
            System.out.println(fieldsArrayList.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Map<String, Map<String, String>> readAllRows(String folderName, String fileName, int headerRow, int headerColumnsExpected) throws IOException {

        Map<String, Map<String, String>> excelFileMap = new HashMap<String, Map<String, String>>();
        Map<String, String> tempFileMap = new HashMap<String, String>();
        List<String> tempList = new ArrayList<String>();
        List<String> inboundList = new ArrayList<String>();
        List<String> headerList = new ArrayList<String>();
//        File file = new File(excelSheetName + "/" + folderName + "/" + fileName + ".csv");
        File file = new File(excelSheetName + "/" + folderName + "/" + fileName);
        Scanner sc = new Scanner(file);
        sc.useDelimiter(",");   //sets the delimiter pattern
//        sc.useDelimiter("\n");
//        sc.useDelimiter("|");
//        sc.useDelimiter(",|\\\\n");
        System.out.println(sc.toString());
        while (sc.hasNext())  //returns a boolean value
        {
            tempList.add(sc.next().toString());
        }
        sc.close();  //closes the scanner
        for (int i = 0; i < tempList.size(); i++) {
            System.out.println(tempList.get(i));
            if (tempList.get(i).contains("\r\n")) {
                String[] splitArray = tempList.get(i).split("\r\n");
                for (int k = 0; k < splitArray.length; k++) {
                    inboundList.add(splitArray[k]);
                }
            } else {
                inboundList.add(tempList.get(i));
            }

        }
        String[] array = inboundList.toArray(new String[0]);
        System.out.println("Table Starts Now");
        System.out.println(inboundList.toString());
        int rowMarker = 0;
        int columnMarker = 0;
        for (int i = headerRow; i < headerRow + headerColumnsExpected; i++) {
            headerList.add(inboundList.get(i));
        }
        for (int i = headerRow + headerColumnsExpected; i < inboundList.size(); i++) {

            tempFileMap.put(headerList.get(columnMarker), inboundList.get(i));
            if (columnMarker == headerColumnsExpected - 1) {
                columnMarker = 0;
                excelFileMap.put("row" + rowMarker, tempFileMap);
                tempFileMap = new HashMap<String, String>();
                rowMarker++;
            } else {
                columnMarker++;
            }
        }
        return excelFileMap;
    }
    public Map<String, Map<String, String>> readAllRowsExcel(String sheetName, String folderName, String fileName, int headerRow) throws IOException {
        Map<String, Map<String, String>> excelFileMap = new HashMap<String, Map<String, String>>();
        //setup Excel
        File file = new File(excelSheetName + "/" + folderName + "/" + fileName);
        fis = new FileInputStream(file);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetName);
        int lastRow = sheet.getLastRowNum();
        Cell cell = null;
        int lastCell;
        List<String> headerList = new ArrayList<String>();
        //until last row, get headers, then seperate data in a to a list for each, then add to HashMap Finally
        for (int i = headerRow; i <= lastRow + 1; i++) {
            Row row = sheet.getRow(i);
            if (row != null) {
//                System.out.println("Row : "+ row.toString());
//                System.out.println("Row : " + i);
                lastCell = row.getLastCellNum();
                if (i == headerRow) {
                    for (int j = 0; j <= lastCell - 1; j++) {
//                    System.out.println("Header List " + j + ": " + row.getCell(j).toString());
                        if (headerList.contains(row.getCell(j).toString())) {
                            headerList.add(row.getCell(j).toString() + 2);
                        } else {
                            headerList.add(row.getCell(j).toString());
                        }
                    }
//                System.out.println("Header List" + headerList.toString());
                } else {
                    Map<String, String> dataMap = new HashMap<String, String>();
                    for (int k = 0; k <= lastCell - 1; k++) {

                        Cell valueCell;
                        String value;
                        if ((valueCell = row.getCell(k)) == null) {
                            value = "";
                        } else {
                            value = valueCell.toString().trim();
                        }

                        //Putting key & value in dataMap
                        dataMap.put(headerList.get(k), value);


                    }
                    //putting dataMap to excelFileMap
//                System.out.println(dataMap.toString());
                    excelFileMap.put("row" + i, dataMap);

                }

            }
        }
        return excelFileMap;
    }
    public List<String> readFile(String folderName, String fileName) throws IOException {

        Map<String, Map<String, String>> excelFileMap = new HashMap<String, Map<String, String>>();
        Map<String, String> tempFileMap = new HashMap<String, String>();
        List<String> tempList = new ArrayList<String>();
        List<String> inboundList = new ArrayList<String>();
        List<String> headerList = new ArrayList<String>();
//        File file = new File(excelSheetName + "/" + folderName + "/" + fileName + ".csv");
        File file = new File(excelSheetName + "/" + folderName + "/" + fileName);
        Scanner sc = new Scanner(file);
//        sc.useDelimiter("}");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            tempList.add(sc.next().toString());
        }
        sc.close();  //closes the scanner

        return tempList;
    }

    public static File changeExtension(File f, String newExtension) {
        int i = f.getName().lastIndexOf('.');
        String name = f.getName().substring(0, i);
        return new File(f.getParent(), name + newExtension);
    }

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }

}
