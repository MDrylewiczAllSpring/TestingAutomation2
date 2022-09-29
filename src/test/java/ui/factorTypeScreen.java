package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.factorPage;
import pages.factorTypePage;
import pages.homePage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class factorTypeScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public factorTypeScreen() throws AWTException, IOException {
    }

    @Test
    public void factorTypePageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToThree(home.smaDataMaintenance, home.codeTables, home.factorType);
        System.out.println("factorTypePageTest");
        factorTypePage factorType = new factorTypePage();
        factorType.verifyFactorTypePage();
        driver.close();


    }


}
