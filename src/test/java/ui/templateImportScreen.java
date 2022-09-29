package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.homePage;
import pages.templateImportPage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class templateImportScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public templateImportScreen() throws AWTException, IOException {
    }

    @Test
    public void templateImportPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToTwo(home.transitionAnalysis, home.templateImport);
        System.out.println("templateImportPageTest");
        templateImportPage viewImportedTemplates = new templateImportPage();

        driver.close();


    }


}
