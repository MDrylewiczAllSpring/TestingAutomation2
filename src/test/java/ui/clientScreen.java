package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.homePage;
import pages.clientPage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class clientScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public clientScreen() throws AWTException, IOException {
    }

    @Test
    public void clientPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToTwo(home.smaDataMaintenance, home.client);
        System.out.println("clientPageTest");
        clientPage client = new clientPage();
        client.verifyClientPage();
        driver.close();


    }


}
