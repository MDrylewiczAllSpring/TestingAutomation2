package pages;

import java.awt.*;
import java.io.IOException;

public class viewImportedTemplatesPage extends pagesMain {
    public viewImportedTemplatesPage() throws AWTException, IOException {
    }

    String fromDate = "//*[@id='cdk-accordion-child-0']/div/div/mat-form-field[1]/div/div[1]/div[3]";
    String toDate = "//*[@id='cdk-accordion-child-0']/div/div/mat-form-field[2]/div/div[1]/div[3]";
    String retrieve = "//*[@id='cdk-accordion-child-0']/div/div/div/button";
    String search = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-imported-template-list/div/app-tables-template/div/mat-toolbar/mat-toolbar-row/div";
    String table = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-imported-template-list/div/app-tables-template/mat-dialog-content/div/mat-table";
    String itemsPerPage = "//*[@id='mat-select-0']";
    String firstpage = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-imported-template-list/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[1]";
    String previousPage = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-imported-template-list/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[2]";
    String nextPage = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-imported-template-list/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[3]";
    String lastPage = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-imported-template-list/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[4]";


    public void verifyViewImportedTemplatesPage() {
        softAssertion.assertTrue(elementExists(fromDate));
        softAssertion.assertTrue(elementExists(toDate));
        softAssertion.assertTrue(elementExists(retrieve));
        softAssertion.assertTrue(elementExists(itemsPerPage));
        softAssertion.assertTrue(elementExists(table));
        softAssertion.assertTrue(elementExists(search));
        softAssertion.assertTrue(elementExists(firstpage));
        softAssertion.assertTrue(elementExists(previousPage));
        softAssertion.assertTrue(elementExists(nextPage));
        softAssertion.assertTrue(elementExists(lastPage));
        softAssertion.assertAll();
    }
}

