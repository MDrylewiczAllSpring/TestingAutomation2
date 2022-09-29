package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.sectorTypeRestrictionPage;
import pages.homePage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class sectorTypeRestrictionScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public sectorTypeRestrictionScreen() throws AWTException, IOException {
    }

    @Test
    public void sectorTypeRestrictionPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToThree(home.smaDataMaintenance, home.codeTables, home.sectorTypeRestriction);
        System.out.println("sectorTypeRestrictionPageTest");
        sectorTypeRestrictionPage sectorTypeRestriction = new sectorTypeRestrictionPage();
        sectorTypeRestriction.verifySectorRestrictionTypePage();
        driver.close();


    }


}
