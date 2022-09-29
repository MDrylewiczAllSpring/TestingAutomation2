package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.creditScopeRatingPage;
import pages.homePage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class creditScopeRatingScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public creditScopeRatingScreen() throws AWTException, IOException {
    }

    @Test
    public void creditScopeRatingPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToThree(home.smaDataMaintenance, home.codeTables, home.creditScopeRating);
        System.out.println("creditScopeRatingPageTest");
        creditScopeRatingPage creditScopeRating = new creditScopeRatingPage();
        creditScopeRating.verifyCreditScopeRatingPage();
        driver.close();


    }


}
