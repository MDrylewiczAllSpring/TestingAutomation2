package pages;

import java.awt.*;
import java.io.IOException;

public class applicationLogsPage extends pagesMain {
    public applicationLogsPage() throws AWTException, IOException {
    }

    String fromDate = "//*[@id='cdk-accordion-child-2']/div/div/mat-form-field[1]/div";
    String toDate = "//*[@id='cdk-accordion-child-2']/div/div/mat-form-field[2]/div/div[1]";
    String retrieve = "//*[@id='cdk-accordion-child-0']/div/app-single-field-filter/div/form/div/span[1]";
    String retrieveAll = "//*[@id='cdk-accordion-child-0']/div/app-single-field-filter/div/form/div/span[2]";
    String table = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-appl-logs/div/app-tables-template/mat-dialog-content/div/mat-table";
    String search = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-appl-logs/div/app-tables-template/div/mat-toolbar/mat-toolbar-row/div";
    String add = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-appl-logs/div/app-tables-template/mat-dialog-actions/button";
    String itemsDropdown = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-appl-logs/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[1]/mat-form-field";
    String itemsOf = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-appl-logs/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/div";
    String firstPage = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-appl-logs/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[1]";
    String previousPage = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-appl-logs/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[2]";
    String nextPage = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-appl-logs/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[3]";
    String lastPage = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-appl-logs/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[4]";

    public void verifyAssetExposurePage() {
        softAssertion.assertTrue(elementExists(fromDate));
        softAssertion.assertTrue(elementExists(toDate));
        softAssertion.assertTrue(elementExists(retrieve));
        softAssertion.assertTrue(elementExists(retrieveAll));
        softAssertion.assertTrue(elementExists(table));
        softAssertion.assertTrue(elementExists(search));
        softAssertion.assertTrue(elementExists(add));
        softAssertion.assertTrue(elementExists(itemsDropdown));
        softAssertion.assertTrue(elementExists(itemsOf));
        softAssertion.assertTrue(elementExists(firstPage));
        softAssertion.assertTrue(elementExists(previousPage));
        softAssertion.assertTrue(elementExists(nextPage));
        softAssertion.assertTrue(elementExists(lastPage));
    }
}