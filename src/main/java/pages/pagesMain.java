package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import util.webdrivers;

import java.awt.*;
import java.io.IOException;
import java.util.Properties;

public class pagesMain {
    public static boolean isWebPageOpen;
    public static WebDriver driver;

    public pagesMain() throws AWTException {
        if (!isWebPageOpen) {
            driver = webdrivers.loadWebdriver( "","");
            isWebPageOpen = true;
        }
    }

    public WebElement getElement(String xpathLine) {
        return driver.findElement(By.xpath(String.valueOf(xpathLine)));
    }

    public void waitForElement(String xpathLine) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.valueOf(xpathLine))));
    }
    public void waitForElementToDisappear(String xpathLine) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(String.valueOf(xpathLine))));
    }
    public void clickWebElement(String xpathLine) {
        driver.findElement(By.xpath(String.valueOf(xpathLine))).click();
    }

    public String getWebElementText(String xpathLine) {
        return driver.findElement(By.xpath(String.valueOf(xpathLine))).getText();
    }

    public boolean elementExists(String xpathLine) {
        return driver.findElements(By.xpath(String.valueOf(xpathLine))).size() > 0;
    }

    public void enterInWebElement(String xpathLine, String text) {
        driver.findElement(By.xpath(xpathLine)).sendKeys(text);
    }

    public String getWebElementLength(String xpathLine) {
        return driver.findElement(By.xpath(xpathLine)).getAttribute("value");
    }

    public String getProperty(String fileName, String propName) throws IOException {
//        InputStream input = homePage.class.getClassLoader().getResourceAsStream("home.properties");
//        System.out.println(input.toString());
        Properties props = new Properties();
        props.load(getClass().getResourceAsStream("/pageProperties/" + fileName));
//    if (input == null) {
//        System.out.println("Sorry, unable to find config.properties");
//        return;
//    }
        return props.getProperty(propName);
    }

    public static SoftAssert softAssertion = new SoftAssert();

    public void textCheck(String xpath, String expected) {
        softAssertion.assertTrue(elementExists(xpath));
        System.out.println("Expected: " + expected + " Actual: " + getWebElementText(xpath));
        softAssertion.assertEquals(getWebElementText(xpath), expected);

    }

    public void existCheck(String xpath) {
        softAssertion.assertTrue(elementExists(xpath));
        softAssertion.assertAll();
    }

    public String parseXpath(String xpath, int numberRow) {
        return xpath.replace("{0}", String.valueOf(numberRow));
    }
    public String parseXpathTwice(String xpath, int numberRow1, int numberRow2) {
        return xpath.replace("{0}", String.valueOf(numberRow1)).replace("{1}", String.valueOf(numberRow2));
    }
}
