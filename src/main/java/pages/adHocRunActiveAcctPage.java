package pages;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class adHocRunActiveAcctPage extends pagesMain {
    public adHocRunActiveAcctPage() throws AWTException, IOException {
    }

    String all = "//*[@id=\"mat-tab-content-0-0\"]/div/app-adhoc-run-active-accounts-cashraise-list/div/mat-grid-list/div/mat-grid-tile[1]/figure/div/mat-toolbar/mat-toolbar-row/div[1]";
    String reload = "//*[@id=\"mat-tab-content-0-0\"]/div/app-adhoc-run-active-accounts-cashraise-list/div/mat-grid-list/div/mat-grid-tile[1]/figure/div/mat-toolbar/mat-toolbar-row/div[2]";
    String cashDR = "//*[@id=\"mat-select-22\"]";
    String optEligible = "//*[@id=\"mat-tab-content-0-0\"]/div/app-adhoc-run-active-accounts-cashraise-list/div/mat-grid-list/div/mat-grid-tile[1]/figure/div/mat-toolbar/mat-toolbar-row/div[4]";
    String main = "//*[@id=\"mat-select-24\"]";
    String search = "//*[@id=\"mat-tab-content-0-0\"]/div/app-adhoc-run-active-accounts-cashraise-list/div/mat-grid-list/div/mat-grid-tile[1]/figure/div/mat-toolbar/mat-toolbar-row/div[5]/input";
    String addToQueue = "//*[@id=\"mat-tab-content-0-0\"]/div/app-adhoc-run-active-accounts-cashraise-list/div/mat-grid-list/div/mat-grid-tile[1]/figure/div/mat-toolbar/mat-toolbar-row/div[6]";
    String all2 = "//*[@id=\"mat-tab-content-0-0\"]/div/app-adhoc-run-active-accounts-cashraise-list/div/mat-grid-list/div/mat-grid-tile[2]/figure/div/mat-toolbar/mat-toolbar-row/div[1]";
    String clearAllSummary = "//*[@id=\"mat-tab-content-0-0\"]/div/app-adhoc-run-active-accounts-cashraise-list/div/mat-grid-list/div/mat-grid-tile[2]/figure/div/mat-toolbar/mat-toolbar-row/div[2]/button";
    String execute = "//*[@id=\"mat-tab-content-0-0\"]/div/app-adhoc-run-active-accounts-cashraise-list/div/mat-grid-list/div/mat-grid-tile[2]/figure/div/mat-toolbar/mat-toolbar-row/div[3]/button";
    String table = "//*[@id=\"mat-tab-content-0-0\"]/div/app-adhoc-run-active-accounts-cashraise-list/div/mat-grid-list/div/mat-grid-tile[1]/figure/div/mat-dialog-content/div/mat-table";
    String headerRow = "//*[@id=\"mat-tab-content-0-0\"]/div/app-adhoc-run-active-accounts-cashraise-list/div/mat-grid-list/div/mat-grid-tile[1]/figure/div/mat-dialog-content/div/mat-table/mat-header-row";
    String table2 = "//*[@id=\"mat-tab-content-0-0\"]/div/app-adhoc-run-active-accounts-cashraise-list/div/mat-grid-list/div/mat-grid-tile[2]/figure/div/mat-dialog-content/div/mat-table";
    String headerRow2 = "//*[@id=\"mat-tab-content-0-0\"]/div/app-adhoc-run-active-accounts-cashraise-list/div/mat-grid-list/div/mat-grid-tile[2]/figure/div/mat-dialog-content/div/mat-table/mat-header-row";

    public void verifyAccountFlowPage() {
        softAssertion.assertTrue(elementExists(all));
        softAssertion.assertTrue(elementExists(reload));
        softAssertion.assertTrue(elementExists(cashDR));
        softAssertion.assertTrue(elementExists(optEligible));
        softAssertion.assertTrue(elementExists(table));
        softAssertion.assertTrue(elementExists(search));
        softAssertion.assertTrue(elementExists(main));
        softAssertion.assertTrue(elementExists(addToQueue));
        softAssertion.assertTrue(elementExists(all2));
        softAssertion.assertTrue(elementExists(clearAllSummary));
        softAssertion.assertTrue(elementExists(execute));
        softAssertion.assertTrue(elementExists(headerRow));
        softAssertion.assertTrue(elementExists(table2));
        softAssertion.assertTrue(elementExists(headerRow2));
    }


}

