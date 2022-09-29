package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.approveTradesPage;
import pages.homePage;
import pages.smaBenchmarkPage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class smaBenchmarksScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public smaBenchmarksScreen() throws AWTException, IOException {
    }

    @Test
    public void smaBenchmarksPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToTwo(home.smaDataMaintenance, home.smaBenchmarks);
        System.out.println("smaBenchmarksTest");
        smaBenchmarkPage smaBenchmark = new smaBenchmarkPage();
        smaBenchmark.verifySMAbBenchmarkPage();
        driver.close();


    }


}
