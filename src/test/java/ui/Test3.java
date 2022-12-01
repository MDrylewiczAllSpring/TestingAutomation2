package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

//import dbconnections.barraOneTables;
import dbconnections.devConnect;
import org.testng.annotations.Test;
import pages.homePage;
import pages.runStatusPage;
import sqlQueries.common;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
//

public class Test3 extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public Test3() throws AWTException {
    }

    @Test
    public void homePageTest() throws AWTException, IOException, SQLException {
//        List<HashMap> rowListStaging = devConnect.connectAndGetHashTable(queryStaging);
//        homePage home = new homePage();
//        home.verifyHomePage();
//        home.navigateToTwo(home.optimization, home.runStatus);
//        runStatusPage runStatus = new runStatusPage();
//        runStatus.verifyRunStatusPage();
//        runStatus.inputTest();
////        runStatus.verifyTableRows(rowListStaging);
//
//        driver.close();
    }


}
