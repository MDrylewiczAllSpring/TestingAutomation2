package ui;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.homePage;
import pages.viewImportedTemplatesPage;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class viewImportedTemplatesScreen extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public viewImportedTemplatesScreen() throws AWTException, IOException {
    }

    @Test
    public void viewImportedTemplatesPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToTwo(home.transitionAnalysis, home.viewImportedTemplates);
        System.out.println("viewImportedTemplatesPageTest");
        viewImportedTemplatesPage viewImportedTemplates = new viewImportedTemplatesPage();
        viewImportedTemplates.verifyViewImportedTemplatesPage();
        driver.close();


    }


}
