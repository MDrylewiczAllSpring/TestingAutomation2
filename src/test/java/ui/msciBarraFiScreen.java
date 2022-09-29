package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.homePage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class msciBarraFiScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public msciBarraFiScreen() throws AWTException, IOException {
    }

    @Test
    public void msciBarraFiPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToThree(home.smaDataMaintenance, home.riskModel,home.msciBarraFI);
        System.out.println("msciBarraFiTest");
//        viewWorkingTradesPages viewWorkingTrades = new viewWorkingTradesPages();
//        viewWorkingTrades.verifyWorkingTradesPagesPage();
        driver.close();


    }


}
