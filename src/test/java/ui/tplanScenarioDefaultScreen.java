package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.tplanScenarioDefaultPage;
import pages.homePage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class tplanScenarioDefaultScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public tplanScenarioDefaultScreen() throws AWTException, IOException {
    }

    @Test
    public void tplanScenarioDefaultPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToThree(home.smaDataMaintenance, home.codeTables, home.tPlanScenarioDefault);
        System.out.println("tplanScenarioDefaultPageTest");
        tplanScenarioDefaultPage tplanScenarioDefault = new tplanScenarioDefaultPage();
        tplanScenarioDefault.verifyTplanScenarioDefaultPage();
        driver.close();


    }


}
