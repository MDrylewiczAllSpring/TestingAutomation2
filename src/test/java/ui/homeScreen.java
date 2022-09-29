package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import pages.homePage;

import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class homeScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public homeScreen() throws AWTException, IOException {
    }

    @Test
    public void homePageTest() throws AWTException, IOException {
        System.out.println("Test");
        homePage home = new homePage();
        home.verifyHomePage();
        home.verifySandwichMenu();
        driver.close();


    }


}
