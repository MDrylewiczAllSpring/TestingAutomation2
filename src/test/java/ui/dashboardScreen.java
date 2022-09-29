package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.dashboardPage;
import pages.homePage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class dashboardScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public dashboardScreen() throws AWTException, IOException {
    }

    @Test
    public void dashboardPageTest() throws AWTException, IOException {
        System.out.println("DashBoardTest");
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToOne(home.dashboard);
        dashboardPage dash = new dashboardPage();
        dash.verifyDashboardPage();
        driver.close();


    }


}
