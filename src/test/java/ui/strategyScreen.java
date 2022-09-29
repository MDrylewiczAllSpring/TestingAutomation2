package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.homePage;
import pages.sponsorPage;
import pages.strategyPage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class strategyScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public strategyScreen() throws AWTException, IOException {
    }

    @Test
    public void strategyPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToTwo(home.smaDataMaintenance, home.strategy);
        System.out.println("strategyPageTest");
        strategyPage strategy = new strategyPage();
        strategy.verifyStrategyPage();
        driver.close();


    }


}
