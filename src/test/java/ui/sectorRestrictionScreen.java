package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.sectorRestrictionPage;
import pages.homePage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class sectorRestrictionScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public sectorRestrictionScreen() throws AWTException, IOException {
    }

    @Test
    public void sectorRestrictionPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToThree(home.smaDataMaintenance, home.codeTables, home.sectorRestriction);
        System.out.println("sectorRestrictionPageTest");
        sectorRestrictionPage sectorRestriction = new sectorRestrictionPage();
        sectorRestriction.verifySectorRestrictionPage();
        driver.close();


    }


}
