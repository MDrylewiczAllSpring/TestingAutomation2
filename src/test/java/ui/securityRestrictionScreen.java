package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.securityRestrictionPage;
import pages.homePage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class securityRestrictionScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public securityRestrictionScreen() throws AWTException, IOException {
    }

    @Test
    public void securityRestrictionPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToThree(home.smaDataMaintenance, home.codeTables, home.securityRestriction);
        System.out.println("securityRestrictionPageTest");
        securityRestrictionPage securityRestriction = new securityRestrictionPage();
        securityRestriction.verifySecurityRestrictionPage();
        driver.close();


    }


}
