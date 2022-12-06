package allspring.pages;

import pages.pagesMain;

import java.awt.*;

import static pages.pagesMain.softAssertion;

public class allProposalsPage extends pagesMain {
    public allProposalsPage() throws AWTException {
    }

    String remiLogo = "//*[@id=\"root\"]/div/div/div/div/div/header/button";
    String leftNavigation = "//*[@id=\"root\"]/div/div/div/div/div/nav";
    String allProposalsNav = "//*[@id=\"root\"]/div/div/div/div/div/nav/button";
    String accountLabel = "//*[@id=\"root\"]/div/div/div/div/div/aside/div";
    String signOutButton = "//*[@id=\"root\"]/div/div/div/div/div/aside/button";
    String allProposalsHeader = "//*[@id=\"root\"]/div/div/div/main/div/div/header";
    String tabHeader = "//*[@id=\"total-proposals-panel\"]/div/div/div[2]/div/table/thead/tr/th[{0}]/button";
    String columnHeader = "//*[@id=\"total-proposals-panel\"]/div/div/div[2]/div/table/thead/tr/th[{0}]";
    String tableRow = "//*[@id=\"total-proposals-panel\"]/div/div/div[2]/div/table/tbody/tr[{0}]";

    String specificCell = "//*[@id=\"total-proposals-panel\"]/div/div/div[2]/div/table/tbody/tr[{0}]/td[{1}]";

    String quickActionsHeader = "//*[@id=\"root\"]/div/div/div/main/div/div/div[2]/div/div/div[1]";
    String createNewProposalButton = "//*[@id=\"root\"]/div/div/div/main/div/div/div[2]/div/div/div[2]/a";

    String xOutSignOut = "//*[@id=\"modal-root\"]/div/div[2]/div/button";
    String signOutHeader = "//*[@id=\"modal-dialog-heading\"]";
    String signOutSubHeader = "//*[@id=\"modal-root\"]/div/div[2]/div/p";
    String cancelSignOut = "//*[@id=\"modal-root\"]/div/div[2]/div/div/button[1]";
    String signOut = "//*[@id=\"modal-root\"]/div/div[2]/div/div/button[2]";


    public void verifyAllProposalsPage() {
        waitForElement(leftNavigation);
        softAssertion.assertTrue(elementExists(remiLogo));
        System.out.println(getWebElementText(remiLogo));
        softAssertion.assertTrue(elementExists(leftNavigation));
        System.out.println(getWebElementText(leftNavigation));
        softAssertion.assertTrue(elementExists(allProposalsNav));
        System.out.println(getWebElementText(allProposalsNav));
        softAssertion.assertTrue(elementExists(accountLabel));
        System.out.println(getWebElementText(accountLabel));
        softAssertion.assertTrue(elementExists(signOutButton));
        System.out.println(getWebElementText(signOutButton));
        softAssertion.assertTrue(elementExists(allProposalsHeader));
        System.out.println(getWebElementText(allProposalsHeader));
        softAssertion.assertTrue(elementExists(parseXpath(tabHeader,1)));
        System.out.println(getWebElementText(parseXpath(tabHeader,1)));
        softAssertion.assertTrue(elementExists(parseXpath(tabHeader,2)));
        System.out.println(getWebElementText(parseXpath(tabHeader,2)));
        softAssertion.assertTrue(elementExists(parseXpath(tabHeader,3)));
        System.out.println(getWebElementText(parseXpath(tabHeader,3)));
        softAssertion.assertTrue(elementExists(parseXpath(tabHeader,4)));
        System.out.println(getWebElementText(parseXpath(tabHeader,4)));
        softAssertion.assertTrue(elementExists(parseXpath(columnHeader,1)));
        System.out.println(getWebElementText(parseXpath(columnHeader,1)));
        softAssertion.assertTrue(elementExists(parseXpath(columnHeader,2)));
        System.out.println(getWebElementText(parseXpath(columnHeader,2)));
        softAssertion.assertTrue(elementExists(parseXpath(columnHeader,3)));
        System.out.println(getWebElementText(parseXpath(columnHeader,3)));
        softAssertion.assertTrue(elementExists(parseXpath(columnHeader,4)));
        System.out.println(getWebElementText(parseXpath(columnHeader,4)));
        softAssertion.assertTrue(elementExists(parseXpath(columnHeader,5)));
        System.out.println(getWebElementText(parseXpath(columnHeader,5)));
        softAssertion.assertTrue(elementExists(parseXpath(tableRow,1)));
        System.out.println(getWebElementText(parseXpath(tableRow,1)));
        softAssertion.assertTrue(elementExists(parseXpathTwice(specificCell,1,1)));
        System.out.println(getWebElementText(parseXpathTwice(specificCell,1,1)));
        softAssertion.assertTrue(elementExists(quickActionsHeader));
        System.out.println(getWebElementText(quickActionsHeader));
        softAssertion.assertTrue(elementExists(createNewProposalButton));
        System.out.println(getWebElementText(createNewProposalButton));

    }
    public void signOut() {
//        String xOutSignOut = "//*[@id=\"modal-root\"]/div/div[2]/div/button";
//        String signOutHeader = "//*[@id=\"modal-dialog-heading\"]";
//        String signOutSubHeader = "//*[@id=\"modal-root\"]/div/div[2]/div/p";
//        String cancelSignOut = "//*[@id=\"modal-root\"]/div/div[2]/div/div/button[1]";
//        String signOut = "//*[@id=\"modal-root\"]/div/div[2]/div/div/button[2]";
        waitForElement(signOutButton);
        softAssertion.assertTrue(elementExists(signOutButton));
        System.out.println(getWebElementText(signOutButton));
        clickWebElement(signOutButton);
        waitForElement(signOut);
        softAssertion.assertTrue(elementExists(xOutSignOut));
        System.out.println(getWebElementText(xOutSignOut));
        softAssertion.assertTrue(elementExists(signOutHeader));
        System.out.println(getWebElementText(signOutHeader));
        softAssertion.assertTrue(elementExists(signOutSubHeader));
        System.out.println(getWebElementText(signOutSubHeader));
        softAssertion.assertTrue(elementExists(cancelSignOut));
        System.out.println(getWebElementText(cancelSignOut));
        softAssertion.assertTrue(elementExists(signOut));
        System.out.println(getWebElementText(signOut));
        //Test X Out
        clickWebElement(xOutSignOut);
        softAssertion.assertFalse(elementExists(signOut));
        clickWebElement(signOutButton);
        waitForElement(signOut);
        //Test Cancel
        clickWebElement(cancelSignOut);
        softAssertion.assertFalse(elementExists(signOut));
        clickWebElement(signOutButton);
        waitForElement(signOut);
        //Test signOut
        clickWebElement(signOut);
        softAssertion.assertFalse(elementExists(signOut));
//        enterInWebElement(emailInput, email);
//        enterInWebElement(passwordInput, password);
//        clickWebElement(signInButton);

    }
    public void createNewProposal() {
        waitForElement(leftNavigation);
        clickWebElement(createNewProposalButton);
    }
}
