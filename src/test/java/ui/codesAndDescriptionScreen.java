package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.codesAndDescriptionPage;
import pages.homePage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class codesAndDescriptionScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public codesAndDescriptionScreen() throws AWTException, IOException {
    }

    @Test
    public void codesAndDescriptionPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToThree(home.smaDataMaintenance, home.codeTables, home.codesAndDescription);
        System.out.println("codesAndDescriptionPageTest");
        codesAndDescriptionPage codesAndDescription = new codesAndDescriptionPage();
        codesAndDescription.verifyCodesAndDescriptionPage();
        driver.close();


    }


}
