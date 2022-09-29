package pages;

import java.awt.*;
import java.io.IOException;

public class viewWorkingTradesPages extends pagesMain {
    public viewWorkingTradesPages() throws AWTException, IOException {
    }

    String all = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-working-trades-list/div/mat-toolbar/mat-toolbar-row/div[1]";
    String reload = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-working-trades-list/div/mat-toolbar/mat-toolbar-row/div[2]";
    String tradingComplete = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-working-trades-list/div/mat-toolbar/mat-toolbar-row/div[3]";
    String filter = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-working-trades-list/div/mat-toolbar/mat-toolbar-row/div[4]/div/ng-multiselect-dropdown/div";
    String table = "/html/body/div[1]/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-working-trades-list/mat-dialog-content/div/table";


    public void verifyWorkingTradesPagesPage() {
        softAssertion.assertTrue(elementExists(all));
        softAssertion.assertTrue(elementExists(reload));
        softAssertion.assertTrue(elementExists(tradingComplete));
        softAssertion.assertTrue(elementExists(filter));
        softAssertion.assertTrue(elementExists(table));
    }
}

