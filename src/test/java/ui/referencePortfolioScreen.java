package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.homePage;
import pages.referencePortfolioPage;
import pages.transitionPlanReportsPage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class referencePortfolioScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public referencePortfolioScreen() throws AWTException, IOException {
    }

    @Test
    public void referencePortfolioPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToTwo(home.smaDataMaintenance, home.referencePortfolio);
        System.out.println("referencePortfolioPageTest");
        referencePortfolioPage referencePortfolio = new referencePortfolioPage();
        referencePortfolio.verifyAssetExposurePage();
        driver.close();


    }


}
