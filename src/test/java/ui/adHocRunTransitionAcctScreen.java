package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.adHocRunTransitionAcctPage;
import pages.homePage;
import pages.runStatusPage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class adHocRunTransitionAcctScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public adHocRunTransitionAcctScreen() throws AWTException, IOException {
    }

    @Test
    public void adHocRunTransitionAcctPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToTwo(home.optimization, home.ahrTransitionAcct);
        System.out.println("adHocRunTransitionAcctTest");
        adHocRunTransitionAcctPage ahrTransitionAcct = new adHocRunTransitionAcctPage();
        ahrTransitionAcct.verifyAccountFlowPage();
        driver.close();


    }


}
