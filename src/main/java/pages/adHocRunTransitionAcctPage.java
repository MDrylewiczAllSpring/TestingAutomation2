package pages;

import java.awt.*;
import java.io.IOException;

public class adHocRunTransitionAcctPage extends pagesMain {
    public adHocRunTransitionAcctPage() throws AWTException, IOException {
    }

    String all = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-adhoc-port-spec-list/div/mat-grid-list/div/mat-grid-tile[1]/figure/div/mat-toolbar/mat-toolbar-row/div[1]";
    String reload = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-adhoc-port-spec-list/div/mat-grid-list/div/mat-grid-tile[1]/figure/div/mat-toolbar/mat-toolbar-row/div[2]/button";
    String transitionAccounts = "//*[@id=\"mat-select-0\"]";
    String and = "//*[@id=\"mat-select-1\"]";
    String tplanEligible = "//*[@id=\"mat-select-2\"]/div";
    String fromDate = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-adhoc-port-spec-list/div/mat-grid-list/div/mat-grid-tile[1]/figure/div/mat-toolbar/mat-toolbar-row/div[6]/mat-form-field[1]/div/div[1]/div";
    String toDate = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-adhoc-port-spec-list/div/mat-grid-list/div/mat-grid-tile[1]/figure/div/mat-toolbar/mat-toolbar-row/div[6]/mat-form-field[2]/div/div[1]/div[1]";
    String clear = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-adhoc-port-spec-list/div/mat-grid-list/div/mat-grid-tile[1]/figure/div/mat-toolbar/mat-toolbar-row/div[6]/mat-icon";
    String main = "//*[@id=\"mat-select-3\"]/div";
    String all2 = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-adhoc-port-spec-list/div/mat-grid-list/div/mat-grid-tile[2]/figure/div/mat-toolbar/mat-toolbar-row/div[1]/button/span/mat-icon";
    String clearAllSummary = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-adhoc-port-spec-list/div/mat-grid-list/div/mat-grid-tile[2]/figure/div/mat-toolbar/mat-toolbar-row/div[2]/button/span/mat-icon";
    String headerRow = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-adhoc-port-spec-list/div/mat-grid-list/div/mat-grid-tile[1]/figure/div/mat-dialog-content/div/mat-table/mat-header-row";
    String table = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-adhoc-port-spec-list/div/mat-grid-list/div/mat-grid-tile[1]/figure/div/mat-dialog-content/div/mat-table";
    String headerRow2 = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-adhoc-port-spec-list/div/mat-grid-list/div/mat-grid-tile[2]/figure/div/mat-dialog-content/div/mat-table/mat-header-row";
    String table2 = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-adhoc-port-spec-list/div/mat-grid-list/div/mat-grid-tile[2]/figure/div/mat-dialog-content/div/mat-table";

    public void verifyAccountFlowPage() {
        softAssertion.assertTrue(elementExists(all));
        softAssertion.assertTrue(elementExists(reload));
        softAssertion.assertTrue(elementExists(transitionAccounts));
        softAssertion.assertTrue(elementExists(and));
        softAssertion.assertTrue(elementExists(tplanEligible));
        softAssertion.assertTrue(elementExists(fromDate));
        softAssertion.assertTrue(elementExists(toDate));
        softAssertion.assertTrue(elementExists(clear));
        softAssertion.assertTrue(elementExists(table));
        softAssertion.assertTrue(elementExists(main));
        softAssertion.assertTrue(elementExists(all2));
        softAssertion.assertTrue(elementExists(clearAllSummary));
        softAssertion.assertTrue(elementExists(headerRow));
        softAssertion.assertTrue(elementExists(table2));
        softAssertion.assertTrue(elementExists(headerRow2));
    }


}

