package pages;

import java.awt.*;
import java.io.IOException;

public class approveTradesPage extends pagesMain {
    public approveTradesPage() throws AWTException, IOException {
    }

    String all = "//*[@id=\"mat-tab-content-1-0\"]/div/div/app-trade-approval-list/div/mat-toolbar/mat-toolbar-row/div[1]";
    String reload = "//*[@id=\"mat-tab-content-1-0\"]/div/div/app-trade-approval-list/div/mat-toolbar/mat-toolbar-row/div[2]";
    String approveDiscard = "//*[@id=\"mat-tab-content-1-0\"]/div/div/app-trade-approval-list/div/mat-toolbar/mat-toolbar-row/div[3]";
    String filter = "//*[@id=\"mat-tab-content-1-0\"]/div/div/app-trade-approval-list/div/mat-toolbar/mat-toolbar-row/div[4]/div/ng-multiselect-dropdown/div";
    String header = "//*[@id=\"mat-tab-content-1-0\"]/div/div/app-trade-approval-list/mat-dialog-content/div/table/thead";
    String table = "//*[@id=\"mat-tab-content-1-0\"]/div/div/app-trade-approval-list/mat-dialog-content/div/table";
    String all2 = "//*[@id=\"mat-tab-content-1-1\"]/div/div/app-trade-delivery-list/div/mat-toolbar/mat-toolbar-row/div[1]";
    String reload2 = "//*[@id=\"mat-tab-content-1-1\"]/div/div/app-trade-delivery-list/div/mat-toolbar/mat-toolbar-row/div[2]";
    String approveDiscard2 = "//*[@id=\"mat-tab-content-1-1\"]/div/div/app-trade-delivery-list/div/mat-toolbar/mat-toolbar-row/div[3]";
    String filter2 = "//*[@id=\"mat-tab-content-1-1\"]/div/div/app-trade-delivery-list/div/mat-toolbar/mat-toolbar-row/div[4]/div/ng-multiselect-dropdown/div";
    String table2 = "//*[@id=\"mat-tab-content-1-1\"]/div/div/app-trade-delivery-list/mat-dialog-content/div";


    public void verifyApproveTradePage() {
        softAssertion.assertTrue(elementExists(all));
        softAssertion.assertTrue(elementExists(reload));
        softAssertion.assertTrue(elementExists(approveDiscard));
        softAssertion.assertTrue(elementExists(filter));
        softAssertion.assertTrue(elementExists(table));
        softAssertion.assertTrue(elementExists(header));
        softAssertion.assertTrue(elementExists(all2));
        softAssertion.assertTrue(elementExists(reload2));
        softAssertion.assertTrue(elementExists(approveDiscard2));
        softAssertion.assertTrue(elementExists(filter2));
        softAssertion.assertTrue(elementExists(table2));
    }

}

