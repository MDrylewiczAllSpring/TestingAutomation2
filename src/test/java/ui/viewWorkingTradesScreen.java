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
import pages.viewWorkingTradesPages;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class viewWorkingTradesScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public viewWorkingTradesScreen() throws AWTException, IOException {
    }

    @Test
    public void viewWorkingTradesPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToTwo(home.trading, home.viewWorkingTrades);
        System.out.println("viewWorkingTradesTest");
        viewWorkingTradesPages viewWorkingTrades = new viewWorkingTradesPages();
        viewWorkingTrades.verifyWorkingTradesPagesPage();
        driver.close();


    }


}
