package ui.inputTemplate;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.homePage;
import pages.templateImportPage;
import ui.TestMain;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class templateFailedTest1 extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public templateFailedTest1() throws AWTException, IOException {
    }

    @Test
    public void templateImportPageTest() throws AWTException, IOException {
        homePage home = new homePage();
        home.verifyHomePage();
        home.navigateToTwo(home.transitionAnalysis, home.templateImport);
        System.out.println("templateImportPageTest");
        templateImportPage viewImportedTemplates = new templateImportPage();
        viewImportedTemplates.waitForElement(viewImportedTemplates.chooseFile);
        viewImportedTemplates.enterInWebElement(viewImportedTemplates.chooseFile,"");
        viewImportedTemplates.waitForElement(viewImportedTemplates.importTemplate);
        viewImportedTemplates.clickWebElement(viewImportedTemplates.importTemplate);
        viewImportedTemplates.waitForElementToDisappear(viewImportedTemplates.loading);
        System.out.println(viewImportedTemplates.getWebElementText(viewImportedTemplates.client).toString());
        System.out.println(viewImportedTemplates.getWebElementText(viewImportedTemplates.client));
        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.client).contentEquals("MichaelTest"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.account).contentEquals("DryTest1"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.fundingSource).contentEquals("Cash and Securities"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.totalMV).contentEquals("1,500,000"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.sponserFirm).contentEquals("Wells Fargo Advisors (WFA)"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.grpTmName).contentEquals(""));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.strategy).contentEquals("Municipal Bond ladder 1-7 Year"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.statePrefOpt).contentEquals("NJ"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.maturity).contentEquals(""));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.yield).contentEquals(""));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.sector).contentEquals(""));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.esgPreference).contentEquals(""));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.creditQuantitySPInstr).contentEquals(""));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.taxState).contentEquals(""));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.shortTermTaxRate).contentEquals("12.00%"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.longTermTaxRate).contentEquals("18.00%"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.maxRealizedSTGains).contentEquals("1,000"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.yrsToTrans).contentEquals("1"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.stYIDRealizedGain).contentEquals("1000"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.stYIDRealizedLoss).contentEquals("-1000"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.liYIDRealizedGain).contentEquals("1000"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.liYIDRealizedLoss).contentEquals("-1000"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.carryForwardLosses).contentEquals("-1000"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.cashToRaise).contentEquals("20000"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.fileName).contentEquals("Remi_SMA_Questionnaire_Input_V2_MikeTest.xlsm"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.importDate).contentEquals("2022-04-18T13:24:02.126"));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.accountCode).contentEquals(""));
//        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.status).contentEquals("New"));
        viewImportedTemplates.clickWebElement(viewImportedTemplates.validateAndSave);
        viewImportedTemplates.waitForElementToDisappear(viewImportedTemplates.loading);
        System.out.println(viewImportedTemplates.getWebElementText(viewImportedTemplates.tableStatus1));
        System.out.println(viewImportedTemplates.getWebElementText(viewImportedTemplates.tableStatus2));
        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.tableStatus1).contentEquals("Validated"));
        Assert.assertTrue(viewImportedTemplates.getWebElementText(viewImportedTemplates.tableStatus2).contentEquals("Exception"));
//        viewImportedTemplates.clickWebElement(viewImportedTemplates.submit);
        driver.close();


    }


}
