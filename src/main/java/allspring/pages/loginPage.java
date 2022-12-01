package allspring.pages;

import pages.pagesMain;

import java.awt.*;
import java.io.IOException;

public class loginPage extends pagesMain {
    public loginPage() throws AWTException, IOException {
    }

    String remiLogo = "//*[@id=\"root\"]/div/div/div/header/h1/button";
    String remiSubHeader = "//*[@id=\"root\"]/div/div/div/header/h1/div";
    String signInTitle = "//*[@id=\"root\"]/div/div/div/section/div/div/div[1]/h2";
    String signInSubTitle = "//*[@id=\"root\"]/div/div/div/section/div/div/div[1]/div";
    String emailInput  = "//*[@id=\"loginEmail\"]";
    String passwordInput = "//*[@id=\"loginPassword\"]";
    String showPasswordButton = "//*[@id=\":r1:-panel\"]/div/form/div[2]/div/button";
    String signInButton = "/html/body/div[2]/div/div/div/section/div/section/div/form/button";

    public void verifyLoginPage() {
        softAssertion.assertTrue(elementExists(remiLogo));
        softAssertion.assertTrue(elementExists(remiSubHeader));
        softAssertion.assertTrue(elementExists(signInSubTitle));
        softAssertion.assertTrue(elementExists(emailInput));
        softAssertion.assertTrue(elementExists(passwordInput));
        softAssertion.assertTrue(elementExists(showPasswordButton));
        softAssertion.assertTrue(elementExists(signInButton));

    }
    public void logInto(String email, String password) {
        waitForElement(remiLogo);
//        clickWebElement(sandwichMenu);
        enterInWebElement(emailInput, email);
        enterInWebElement(passwordInput, password);
        clickWebElement(signInButton);

    }

}