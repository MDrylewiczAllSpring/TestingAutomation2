package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.homePage;
import pages.viewWorkingTradesPages;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class portfolioSpecsScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public portfolioSpecsScreen() throws AWTException, IOException {
    }

    @Test
    public void portfolioSpecsPageTest() throws AWTException, IOException {
//        homePage home = new homePage();
//        home.verifyHomePage();
//        home.navigateToTwo(home.smaDataMaintenance, home.portfolioSpecs);
//        System.out.println("portfolioSpecsTest");
//        viewWorkingTradesPages viewWorkingTrades = new viewWorkingTradesPages();
//        viewWorkingTrades.verifyWorkingTradesPagesPage();
        driver.close();


    }


}
