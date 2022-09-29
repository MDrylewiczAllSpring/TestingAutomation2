package pages;

import java.awt.*;
import java.io.IOException;

public class codesAndDescriptionPage extends pagesMain {
    public codesAndDescriptionPage() throws AWTException, IOException {
    }

    String selectColumn = "//*[@id='cdk-accordion-child-0']/div/app-single-field-filter/div/form/div/mat-form-field[1]";
    String genCode = "//*[@id='cdk-accordion-child-0']/div/app-single-field-filter/div/form/div/mat-form-field[2]";
    String retrieve = "//*[@id='cdk-accordion-child-0']/div/app-single-field-filter/div/form/div/span[1]";
    String retrieveAll = "//*[@id='cdk-accordion-child-0']/div/app-single-field-filter/div/form/div/span[2]";
    String table = "//*[@id='mat-tab-content-0-0']/div/app-gen-code/div/app-tables-template/mat-dialog-content/div/mat-table";
    String search = "//*[@id='mat-tab-content-0-0']/div/app-gen-code/div/app-tables-template/div/mat-toolbar/mat-toolbar-row/div/input";
    String add = "//*[@id='mat-tab-content-0-0']/div/app-gen-code/div/app-tables-template/mat-dialog-actions/button";
    String itemsDropdown = "//*[@id='mat-select-0']";
    String itemsOf = "//*[@id='mat-tab-content-0-0']/div/app-gen-code/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/div";
    String firstPage = "//*[@id='mat-tab-content-0-0']/div/app-gen-code/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[1]/span";
    String previousPage = "//*[@id='mat-tab-content-0-0']/div/app-gen-code/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[2]/span";
    String nextPage = "//*[@id='mat-tab-content-0-0']/div/app-gen-code/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[3]/span";
    String lastPage = "//*[@id='mat-tab-content-0-0']/div/app-gen-code/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[4]/span";
    String genCodeTab = "//*[@id='mat-tab-label-0-0']";
    String genCodeTypeTab = "//*[@id='mat-tab-label-0-1']";

    String selectColumn2 = "//*[@id='cdk-accordion-child-1']/div/app-single-field-filter/div/form/div/mat-form-field[1]";
    String genCodeType = "//*[@id='cdk-accordion-child-1']/div/app-single-field-filter/div/form/div/mat-form-field[2]";
    String retrieve2 = "//*[@id='cdk-accordion-child-1']/div/app-single-field-filter/div/form/div/span[1]";
    String retrieveAll2 = "//*[@id='cdk-accordion-child-1']/div/app-single-field-filter/div/form/div/span[2]";
    String table2 = "//*[@id='mat-tab-content-0-1']/div/app-gen-code-type/div/app-tables-template/mat-dialog-content/div/mat-table";
    String search2 = "//*[@id='mat-tab-content-0-1']/div/app-gen-code/div/app-tables-template/div/mat-toolbar/mat-toolbar-row/div/input";
    String add2 = "//*[@id='mat-tab-content-0-1']/div/app-gen-code/div/app-tables-template/mat-dialog-actions/button";
    String itemsDropdown2 = "//*[@id='mat-select-1']";
    String itemsOf2 = "//*[@id='mat-tab-content-0-1']/div/app-gen-code/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/div";
    String firstPage2 = "//*[@id='mat-tab-content-0-1']/div/app-gen-code/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[1]/span";
    String previousPage2 = "//*[@id='mat-tab-content-0-1']/div/app-gen-code/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[2]/span";
    String nextPage2 = "//*[@id='mat-tab-content-0-1']/div/app-gen-code/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[3]/span";
    String lastPage2 = "//*[@id='mat-tab-content-0-1']/div/app-gen-code/div/app-tables-template/mat-dialog-actions/mat-paginator/div/div/div[2]/button[4]/span";

    public void verifyCodesAndDescriptionPage() {
        softAssertion.assertTrue(elementExists(selectColumn));
        softAssertion.assertTrue(elementExists(genCode));
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
        softAssertion.assertTrue(elementExists(genCodeTab));
        softAssertion.assertTrue(elementExists(genCodeTypeTab));

        softAssertion.assertTrue(elementExists(selectColumn2));
        softAssertion.assertTrue(elementExists(genCodeType));
        softAssertion.assertTrue(elementExists(retrieve2));
        softAssertion.assertTrue(elementExists(retrieveAll2));
        softAssertion.assertTrue(elementExists(table2));
        softAssertion.assertTrue(elementExists(search2));
        softAssertion.assertTrue(elementExists(add2));
        softAssertion.assertTrue(elementExists(itemsDropdown2));
        softAssertion.assertTrue(elementExists(itemsOf2));
        softAssertion.assertTrue(elementExists(firstPage2));
        softAssertion.assertTrue(elementExists(previousPage2));
        softAssertion.assertTrue(elementExists(nextPage2));
        softAssertion.assertTrue(elementExists(lastPage2));
    }


}

