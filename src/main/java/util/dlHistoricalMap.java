package util;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.net.InetAddress;
import java.util.*;

public class dlHistoricalMap {
    public static FileInputStream fis;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static XSSFRow row;

    public static String getUser() {
        String username = null;
        try {
            username = InetAddress.getLocalHost().getHostName();
        } catch (Exception ex) {
        }
        return username;
    }
    public List<String>  readFile(int amountOfHeaders) throws IOException {
        String filePath = "";
        List<String> fileContents = null;
        Map<String, Map<String, String>> excelFileMap = new HashMap<String, Map<String, String>>();
        Map<String, String> tempFileMap = new HashMap<String, String>();
        List<String> tempList = new ArrayList<String>();
        List<String> outboundList = new ArrayList<String>();
        List<String> headerList = new ArrayList<String>();
//        File file = new File(excelSheetName + "/" + folderName + "/" + fileName + ".csv");
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        sc.useDelimiter("}");   //sets the delimiter pattern
        String temp = null;
        while (sc.hasNext())  //returns a boolean value
        {
            temp = sc.next().toString().replace(", {","").replace("[{","");

            if(getCommas(temp)>amountOfHeaders-2){
                String[] tempArray = temp.split("=");
                for(int k = 0; k < tempArray.length; k++) {
                   if(getCommas(tempArray[k])>1){
                       tempArray[k]=tempArray[k].replaceFirst(",","!#!");
                   }
                }
                temp = tempArray.toString();
            }
            tempList.add(temp);
        }
        sc.close(); //closes the scanner
//        for(int i = 0;i<tempList.size();i++){
//            System.out.println(tempList.get(i));
//        }
        outboundList = Arrays.asList(tempList.toString().split(","));
        return outboundList;
    }
    public static void writeToFile(String writtenText) {
        String filePath = "";
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), "utf-8"))) {
            writer.write(writtenText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static  Map<String, Map<String, String>> fileContentsToMap(List<String> unorganizedContents, int rowSize, List headers) {
        Map<String, Map<String, String>> convertedContents = new HashMap<String, Map<String, String>>();
    int k = 0;
    int j = 0;
        Map<String, String> dataMap = new HashMap<String, String>();
      for(int i = 0; i<unorganizedContents.size(); i++ ) {

              String[] temp = unorganizedContents.get(i).split("=");
              String header = temp[0].toString().replace("{","").replace("[","").replace("]","").trim();
              String value= null;
              if(temp.length<2){
                  value="";
              }else{
                  value=temp[1].replace("}","").trim();
              }
              dataMap.put(header,value);
              k++;
              if(k==rowSize-1){
                  convertedContents.put("row"+j,dataMap);
                  j++;
                  k=0;
                  dataMap = new HashMap<String, String>();
              }


      }
       return convertedContents;
    }
    public static List getHeaders(List<String> unorganizedContents, int rowSize) {
        List headerList = new ArrayList();
        for(int i = 0; i<rowSize; i++ ) {
            String headerTemp[] = unorganizedContents.get(i).split("=");
            String header = headerTemp[0].replace("{","").replace("[","").replace("]","").trim();
            headerList.add(header);
        }
        return headerList;
    }
    public static int getCommas(String temp) {
        int commas = 0;
        for(int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i) == ',') commas++;
        }
        return commas;
    }


}
