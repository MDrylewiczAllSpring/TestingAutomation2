package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.adHocRunActiveAcctPage;
import pages.homePage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class adHocRunActiveAcctScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public adHocRunActiveAcctScreen() throws AWTException, IOException {
    }

    @Test
    public void adHocRunActiveAcctPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToTwo(home.optimization, home.ahrActiveAcct);
        System.out.println("adHocRunActiveAcctTest");
        adHocRunActiveAcctPage ahrActiveAcct = new adHocRunActiveAcctPage();
        ahrActiveAcct.verifyAccountFlowPage();
        driver.close();


    }


}
