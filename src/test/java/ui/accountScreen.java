package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.accountPage;
import pages.homePage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class accountScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public accountScreen() throws AWTException, IOException {
    }

    @Test
    public void accountPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToTwo(home.smaDataMaintenance, home.account);
        System.out.println("accountPageTest");
        accountPage account = new accountPage();
        account.verifyAccountPage();
        driver.close();


    }


}
