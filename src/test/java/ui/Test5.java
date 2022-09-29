package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.homePage;
import util.colorFinder;

import java.awt.*;
import java.sql.Statement;

//

public class Test5 extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public Test5() throws AWTException {

    }

    @Test
    public void launch() throws Exception {
        System.out.println("Test");
        homePage home = new homePage();
        home.verifyHomePage();
        colorFinder cFinder = new colorFinder();
        cFinder.findColorOfPixel(getElement(home.toolbar));
        home.verifySandwichMenu();

        driver.close();
    }
}
