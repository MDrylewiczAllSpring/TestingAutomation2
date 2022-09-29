package pages;

import org.apache.velocity.runtime.directive.Parse;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class runStatusPage extends pagesMain {
    public runStatusPage() throws AWTException, IOException {
    }

    String title = "//*[@id='mat-expansion-panel-header-0']/span[1]/mat-panel-title";
    String fromDate = "//*[@id='mat-input-0']";
    String toDate = "//*[@id='mat-input-1']";
    String getOutputLogWorkspaceFile = "//*[@id='cdk-accordion-child-0']/div/div/div[2]/button/span/span";
    String retrieve = "//*[@id='cdk-accordion-child-0']/div/div/div[1]/div/div/button/span";
    String search = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-run-request-list/div/app-scrollable-table-template/div/mat-toolbar/mat-toolbar-row/div/input";
    String table = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-run-request-list/div/app-scrollable-table-template/mat-dialog-content/div/mat-table";
    String itemsPerPage = "//*[@id='mat-select-0']/div/div[1]";
    String itemsShownPerPage = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-run-request-list/div/app-scrollable-table-template/mat-dialog-actions/mat-toolbar-row/span[1]/mat-paginator/div/div/div[2]/div";
    String firstPage = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-run-request-list/div/app-scrollable-table-template/mat-dialog-actions/mat-toolbar-row/span[1]/mat-paginator/div/div/div[2]/button[1]";
    String prevPage = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-run-request-list/div/app-scrollable-table-template/mat-dialog-actions/mat-toolbar-row/span[1]/mat-paginator/div/div/div[2]/button[2]";
    String nextPage = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-run-request-list/div/app-scrollable-table-template/mat-dialog-actions/mat-toolbar-row/span[1]/mat-paginator/div/div/div[2]/button[3]";
    String lastPage = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-run-request-list/div/app-scrollable-table-template/mat-dialog-actions/mat-toolbar-row/span[1]/mat-paginator/div/div/div[2]/button[4]";
    //    String excelDownload = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-run-request-list/div/app-scrollable-table-template/mat-dialog-actions/mat-toolbar-row/span[3]";
    String row = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-run-request-list/div/app-scrollable-table-template/mat-dialog-content/div/mat-table/mat-row[{0}]";


    public void verifyRunStatusPage() {
        waitForElement(title);
        textCheck(title, "Filter and Action section");
        waitForElement(fromDate);
        existCheck(fromDate);
        existCheck(toDate);
        existCheck(getOutputLogWorkspaceFile);
        existCheck(retrieve);
        existCheck(search);
        existCheck(table);
        existCheck(itemsPerPage);
        existCheck(itemsShownPerPage);
        existCheck(firstPage);
        existCheck(prevPage);
        existCheck(nextPage);
        existCheck(lastPage);


    }

    public void inputTest() {
        enterInWebElement(fromDate, "Test1111111111111111");
        System.out.println(getWebElementLength(fromDate));


    }

    public void verifyTableRows(List<HashMap> rowListStaging) {
        String[] tableByRows = getWebElementText(table).split("\n");
        for (int i = 1; i < tableByRows.length; i++) {
            //clickWebElement(getWebElementText(parseXpathWithRow(row,i)));

        }


    }
}

