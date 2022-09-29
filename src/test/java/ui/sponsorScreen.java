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
import pages.transitionPlanReportsPage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class sponsorScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public sponsorScreen() throws AWTException, IOException {
    }

    @Test
    public void transitionPlanReportsPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToTwo(home.smaDataMaintenance, home.sponser);
        System.out.println("sponserPageTest");
        sponsorPage sponsor = new sponsorPage();
        sponsor.verifySponsorPage();
        driver.close();


    }


}
