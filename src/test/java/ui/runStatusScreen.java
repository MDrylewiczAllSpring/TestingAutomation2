package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.homePage;
import pages.runStatusPage;
import pages.transitionPlanReportsPage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class runStatusScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public runStatusScreen() throws AWTException, IOException {
    }

    @Test
    public void runStatusPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToTwo(home.optimization, home.runStatus);
        System.out.println("runStatusTest");
        runStatusPage runStatus = new runStatusPage();
        runStatus.verifyRunStatusPage();
        driver.close();


    }


}
