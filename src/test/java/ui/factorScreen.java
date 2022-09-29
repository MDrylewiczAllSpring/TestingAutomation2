package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.factorPage;
import pages.homePage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class factorScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public factorScreen() throws AWTException, IOException {
    }

    @Test
    public void factorPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToThree(home.smaDataMaintenance, home.codeTables, home.factor);
        System.out.println("factorPageTest");
        factorPage factor = new factorPage();
        factor.verifyFactorPage();
        driver.close();


    }


}
