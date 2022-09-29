package pages;

import java.awt.*;
import java.io.IOException;

public class dashboardPage extends pagesMain {
    public dashboardPage() throws AWTException, IOException {
    }

    String chooseFile = "//*[@id='cdk-accordion-child-1']/div/div/div/span[1]/input";
    String fileChosen = "//*[@id='cdk-accordion-child-1']/div/div/div/span[1]/input";
    String importTemplate = "//*[@id='cdk-accordion-child-1']/div/div/div/span[2]/button/span";
    String validateAndSave = "//*[@id='cdk-accordion-child-1']/div/div/div/span[3]/button/span";
    String submit = "//*[@id='cdk-accordion-child-1']/div/div/div/span[4]/button";
    String accountInformationHeader = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[1]/figure";
    String client = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[5]/figure/mat-label";
    String account = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[9]/figure/mat-label";
    String fundingSource = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[13]/figure/mat-label";
    String totalMVCash = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[17]/figure/mat-label";
    String sponsorFirm = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[21]/figure/mat-label";
    String grpTmName = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[25]/figure/mat-label";
    String advisorName = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[29]/figure/mat-label";
    String advisorEmail = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[33]/figure/mat-label";
    String strategyHeader = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[2]/figure/mat-label";
    String strategy = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[6]/figure/mat-label";
    String specialInstructionsHeader = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[14]/figure/mat-label";
    String statePrefOpt = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[18]/figure/mat-label";
    String maturity = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[22]/figure/mat-label";
    String creditQuality = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[26]/figure/mat-label";
    String sector = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[34]/figure/mat-label";
    String esgPreferance = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[38]/figure/mat-label";
    String taxInformationHeader = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[3]/figure/mat-label";
    String taxSate = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[7]/figure/mat-label";
    String shortTermTaxRate = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[11]/figure/mat-label";
    String longTermTaxRate = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[15]/figure/mat-label";
    String taxRate = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[19]/figure/mat-label";
    String yrsToTrans = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[23]/figure/mat-label";
    String realized1 = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[27]/figure/mat-label";
    String realized2 = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[31]/figure/mat-label";
    String realized3 = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[35]/figure/mat-label";
    String realized4 = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[39]/figure/mat-label";
    String forward = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[43]/figure/mat-label";
    String fileName = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[47]/figure/mat-label";
    String nameImport = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[8]/figure/mat-label";
    String dateImported = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[12]/figure/mat-label";
    String by = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[16]/figure";
    String accountCode = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[16]/figure/mat-label";
    String code = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[20]/figure/mat-label";
    String status = "//*[@id='cdk-accordion-child-2']/div/mat-dialog-content/form/mat-grid-list/div/mat-grid-tile[24]/figure/mat-label";
    String taxLotAndSecurityRestrictionsSectionsHeader = "//*[@id='mat-expansion-panel-header-3']/span[1]/mat-panel-title";
    String cashTaxLotPositions = "//*[@id='mat-tab-label-0-0']/div";
    String accountSecurityRestrictions = "//*[@id='mat-tab-label-0-1']/div";
    String table = "//*[@id='mat-tab-content-0-0']/div/div/app-tables-template/mat-dialog-content/div";


    public void verifyDashboardPage() {
        softAssertion.assertTrue(elementExists(chooseFile));
        softAssertion.assertTrue(elementExists(fileChosen));
        softAssertion.assertTrue(elementExists(importTemplate));
        softAssertion.assertTrue(elementExists(validateAndSave));
        softAssertion.assertTrue(elementExists(submit));
        softAssertion.assertTrue(elementExists(accountInformationHeader));
        softAssertion.assertTrue(elementExists(client));
        softAssertion.assertTrue(elementExists(account));
        softAssertion.assertTrue(elementExists(fundingSource));
        softAssertion.assertTrue(elementExists(totalMVCash));
        softAssertion.assertTrue(elementExists(sponsorFirm));
        softAssertion.assertTrue(elementExists(grpTmName));
        softAssertion.assertTrue(elementExists(advisorName));
        softAssertion.assertTrue(elementExists(advisorEmail));
        softAssertion.assertTrue(elementExists(strategyHeader));

        softAssertion.assertTrue(elementExists(strategy));
        softAssertion.assertTrue(elementExists(specialInstructionsHeader));
        softAssertion.assertTrue(elementExists(statePrefOpt));
        softAssertion.assertTrue(elementExists(maturity));
        softAssertion.assertTrue(elementExists(creditQuality));
        softAssertion.assertTrue(elementExists(sector));
        softAssertion.assertTrue(elementExists(esgPreferance));
        softAssertion.assertTrue(elementExists(taxInformationHeader));
        softAssertion.assertTrue(elementExists(taxSate));
        softAssertion.assertTrue(elementExists(shortTermTaxRate));
        softAssertion.assertTrue(elementExists(longTermTaxRate));
        softAssertion.assertTrue(elementExists(taxRate));
        softAssertion.assertTrue(elementExists(yrsToTrans));
        softAssertion.assertTrue(elementExists(realized1));
        softAssertion.assertTrue(elementExists(realized2));
        softAssertion.assertTrue(elementExists(realized3));
        softAssertion.assertTrue(elementExists(realized4));
        softAssertion.assertTrue(elementExists(forward));
        softAssertion.assertTrue(elementExists(fileName));
        softAssertion.assertTrue(elementExists(nameImport));
        softAssertion.assertTrue(elementExists(dateImported));
        softAssertion.assertTrue(elementExists(by));
        softAssertion.assertTrue(elementExists(fileName));
        softAssertion.assertTrue(elementExists(fileName));


    }


}

