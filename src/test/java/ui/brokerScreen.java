package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.brokerPage;
import pages.homePage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class brokerScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public brokerScreen() throws AWTException, IOException {
    }

    @Test
    public void brokerPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToThree(home.smaDataMaintenance, home.codeTables, home.broker);
        System.out.println("brokerPageTest");
        brokerPage broker = new brokerPage();
        broker.verifyBrokerPage();
        driver.close();


    }


}
