package dbconnections;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class devConnect {


    public static List<HashMap> connectAndGetHashTableUAT(String searchString) throws SQLException, IOException {
        //Connect to DB and execute the query
        String url = "### DB.SMA ###";
        Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(searchString);
        return getAllRows(rs);
    }
    public static List<HashMap> connectAndGetHashTableDEV(String searchString) throws SQLException, IOException {
        //Connect to DB and execute the query
        String url = "### DB.SMA ###";
                Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(searchString);
        return getAllRows(rs);
    }
    public static String getAll(String query, String tableName) {
        System.out.println("SQL Query: " + query + tableName);
        return query + tableName;
    }

    public static List<HashMap> getAllRows(ResultSet rs) throws IOException, SQLException {
        Map<String, Map<String, String>> tableMap = new HashMap<String, Map<String, String>>();
        List<String> headerList = new ArrayList<String>();
        List<HashMap> rowList = new ArrayList<HashMap>();
        ResultSetMetaData rsmd = rs.getMetaData();
        for (int i = 0; i < rsmd.getColumnCount(); i++) {
            headerList.add(rsmd.getColumnName(1));
        }
        while (rs.next()) {

            HashMap row = new HashMap(headerList.size());
            for (int i = 1; i <= headerList.size(); ++i) {
                row.put(rsmd.getColumnName(i), rs.getObject(i));
            }
            rowList.add(row);
        }


        return rowList;
    }
}
