package allspring.pages;

import pages.pagesMain;

import java.awt.*;

public class newProposalsPage extends pagesMain {
    public newProposalsPage() throws AWTException {
    }

    String remiLogo = "//*[@id=\"root\"]/div/div/div/div/div/header/button";
    String backButton = "//*[@id=\"root\"]/div/div/div/div/div/nav/button[1]";
    String clientNameTMV = "//*[@id=\"root\"]/div/div/div/div/div/nav/div[1]";
    String addNewProposalButton = "//*[@id=\"root\"]/div/div/div/div/div/nav/button[4]";
    String profile = "//*[@id=\"root\"]/div/div/div/div/div/aside/div";
    String signOutButton = "//*[@id=\"root\"]/div/div/div/div/div/aside/button";
    String basicInformationHeader = "//*[@id=\"root\"]/div/div/div/main/div/div/div/form/div[1]/div[1]/div";
    String selectStrategyHeader = "//*[@id=\"root\"]/div/div/div/main/div/div/div/form/div[1]/div[2]/div";
    String specialInstructionsHeader = "//*[@id=\"root\"]/div/div/div/main/div/div/div/form/div[1]/div[3]/div";
    String clientTaxInformationHeader = "//*[@id=\"root\"]/div/div/div/main/div/div/div/form/div[1]/div[4]/div";
    String cashTaxLotAndSecurityRestrictionInformationHeader = "//*[@id=\"root\"]/div/div/div/main/div/div/div/form/div[1]/div[5]/div";

    String clientName = "//*[@id=\"client\"]";
    String totalMarketValue = "//*[@id=\"totalMarketValue\"]";
    String accountName = "//*[@id=\"account\"]";
    String fundingType = "//*[@id=\"fundingSrc-button\"]";
    String selectAssetStyle = "//*[@id=\"selectCategory-button\"]";
    String selectOneStrategy = "//*[@id=\"selectStrategy-button\"]";

    String creditQualityColumnHeader = "//*[@id=\":r1:-intakeFormCard-3-panel\"]/div/div[1]/div/table/thead/tr/th[1]";
    String minColumnHeader = "//*[@id=\":r1:-intakeFormCard-3-panel\"]/div/div[1]/div/table/thead/tr/th[2]";
    String maxColumnHeader = "//*[@id=\":r1:-intakeFormCard-3-panel\"]/div/div[1]/div/table/thead/tr/th[3]";
    String aaa = "//*[@id=\":r1:-intakeFormCard-3-panel\"]/div/div[1]/div/table/tbody/tr[1]/th";
    String aa = "//*[@id=\":r1:-intakeFormCard-3-panel\"]/div/div[1]/div/table/tbody/tr[2]/th";
    String a = "//*[@id=\":r1:-intakeFormCard-3-panel\"]/div/div[1]/div/table/tbody/tr[3]/th";
    String bbb = "//*[@id=\":r1:-intakeFormCard-3-panel\"]/div/div[1]/div/table/tbody/tr[4]/th";
    String minAAA = "//*[@id=\":r1:-intakeFormCard-3-panel\"]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/input";
    String minAA = "//*[@id=\":r1:-intakeFormCard-3-panel\"]/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div/input";
    String minA = "//*[@id=\":r1:-intakeFormCard-3-panel\"]/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div/input";
    String minBBB = "//*[@id=\":r1:-intakeFormCard-3-panel\"]/div/div[1]/div/table/tbody/tr[4]/td[1]/div/div/input";
    String maxAAA = "//*[@id=\":r1:-intakeFormCard-3-panel\"]/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/input";
    String maxAA = "//*[@id=\":r1:-intakeFormCard-3-panel\"]/div/div[1]/div/table/tbody/tr[2]/td[2]/div/div/input";
    String maxA = "//*[@id=\":r1:-intakeFormCard-3-panel\"]/div/div[1]/div/table/tbody/tr[3]/td[2]/div/div/input";
    String maxBBB = "//*[@id=\":r1:-intakeFormCard-3-panel\"]/div/div[1]/div/table/tbody/tr[4]/td[2]/div/div/input";
    String maturity = "//*[@id=\"maturityPreference\"]";
    String sector = "//*[@id=\"sectorPreference\"]";
    String selectState = "//*[@id=\"statePreference-button\"]";
    String yield = "//*[@id=\"yieldPreference\"]";
    String selectESG = "//*[@id=\"esgPreference-button\"]";

    String selectStateTax = "//*[@id=\"taxState-button\"]";
    String yearsToTransition = "//*[@id=\"yearsToTransition-button\"]";
    String shortTermTaxRate = "//*[@id=\"stTaxRate\"]";
    String longTermTaxRate = "//*[@id=\"ltTaxRate\"]";
    String stYTDRealizedGain = "//*[@id=\"stYtdRealizedG\"]";
    String stYTDRealizedLoss = "//*[@id=\"stYtdRealizedL\"]";
    String ltYTDRealizedGain = "//*[@id=\"ltYtdRealizedG\"]";
    String ltYTDRealizedLoss = "//*[@id=\"ltYtdRealizedL\"]";
    String carryForwardLosses = "//*[@id=\"carryFwdLosses\"]";
    String maxRealizedShortTermGains = "//*[@id=\"maxRealizedGain\"]";
    String cashToRaise = "//*[@id=\"cashToRaise\"]";


    String collapse = "//*[@id=\":r1:-intakeFormCard-5-header\"]";
    String cashTaxLotInfoTab = "//*[@id=\":r1:-intakeFormCard-5-panel\"]/div/div/div[1]/button[1]";
    String securityRestrictionsTab = "//*[@id=\":r1:-intakeFormCard-5-panel\"]/div/div/div[1]/button[2]";
    String ifFundingincludesCashHeader = "//*[@id=\":r1:-intakeFormCard-5-panel\"]/div/div/div[2]/div[1]/div/div[1]/div[1]";
    String ifFundingIncludesCashInput = "//*[@id=\"cashAmount\"]";
    String disclosureText = "//*[@id=\":r1:-intakeFormCard-5-panel\"]/div/div/div[2]/div[1]/div/div[2]";
    String formSectionHeader = "//*[@id=\":r1:-intakeFormCard-5-panel\"]/div/div/div[2]/div[1]/div/div[3]/div[1]/h3";
    String addNewRow = "//*[@id=\":r1:-intakeFormCard-5-panel\"]/div/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/button[1]";
    String deleteAll = "//*[@id=\":r1:-intakeFormCard-5-panel\"]/div/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/button[2]";
    String cusipHeader = "//*[@id=\"taxLotData[{0}].cusip\"]";
    String purchaseDateHeader = "//*[@id=\"taxLotData[{0}].purchaseDate\"]";
    String costBasisHeader = "//*[@id=\"taxLotData[{0}].costBasis\"]";
    String quanityUnitsHeader = "//*[@id=\"taxLotData[{0}].qty\"]";
    String uploadFromCSV = "//*[@id=\":r1:-intakeFormCard-5-panel\"]/div/div/div[2]/div[1]/div/div[3]/div[3]/div/div/label/span/div[1]/span";
    String guideToUploading = "//*[@id=\":r1:-intakeFormCard-5-panel\"]/div/div/div[2]/div[1]/div/div[3]/div[3]/button";
    String disclosureBottomText = "//*[@id=\"Disclosures\"]";

    public void verifyAllProposalsPage() {

        waitForElement(remiLogo);softAssertion.assertTrue(elementExists(remiLogo));
        waitForElement(backButton);softAssertion.assertTrue(elementExists(backButton));
        waitForElement(clientNameTMV);softAssertion.assertTrue(elementExists(clientNameTMV));
        waitForElement(addNewProposalButton);softAssertion.assertTrue(elementExists(addNewProposalButton));
        waitForElement(profile);softAssertion.assertTrue(elementExists(profile));
        waitForElement(signOutButton);softAssertion.assertTrue(elementExists(signOutButton));
        waitForElement(basicInformationHeader);softAssertion.assertTrue(elementExists(basicInformationHeader));
        waitForElement(selectStrategyHeader);softAssertion.assertTrue(elementExists(selectStrategyHeader));
        waitForElement(specialInstructionsHeader);softAssertion.assertTrue(elementExists(specialInstructionsHeader));
        waitForElement(clientTaxInformationHeader);softAssertion.assertTrue(elementExists(clientTaxInformationHeader));
        waitForElement(cashTaxLotAndSecurityRestrictionInformationHeader);softAssertion.assertTrue(elementExists(cashTaxLotAndSecurityRestrictionInformationHeader));
        waitForElement(clientName);softAssertion.assertTrue(elementExists(clientName));
        waitForElement(totalMarketValue);softAssertion.assertTrue(elementExists(totalMarketValue));
        waitForElement(accountName);softAssertion.assertTrue(elementExists(accountName));
        waitForElement(fundingType);softAssertion.assertTrue(elementExists(fundingType));
        waitForElement(selectAssetStyle);softAssertion.assertTrue(elementExists(selectAssetStyle));
        waitForElement(selectOneStrategy);softAssertion.assertTrue(elementExists(selectOneStrategy));
        waitForElement(creditQualityColumnHeader);softAssertion.assertTrue(elementExists(creditQualityColumnHeader));
        waitForElement(minColumnHeader);softAssertion.assertTrue(elementExists(minColumnHeader));
        waitForElement(maxColumnHeader);softAssertion.assertTrue(elementExists(maxColumnHeader));
        waitForElement(aaa);softAssertion.assertTrue(elementExists(aaa));
        waitForElement(aa);softAssertion.assertTrue(elementExists(aa));
        waitForElement(a);softAssertion.assertTrue(elementExists(a));
        waitForElement(bbb);softAssertion.assertTrue(elementExists(bbb));
        waitForElement(minAAA);softAssertion.assertTrue(elementExists(minAAA));
        waitForElement(minAA);softAssertion.assertTrue(elementExists(minAA));
        waitForElement(minA);softAssertion.assertTrue(elementExists(minA));
        waitForElement(minBBB);softAssertion.assertTrue(elementExists(minBBB));
        waitForElement(maxAAA);softAssertion.assertTrue(elementExists(maxAAA));
        waitForElement(maxAA);softAssertion.assertTrue(elementExists(maxAA));
        waitForElement(maxA);softAssertion.assertTrue(elementExists(maxA));
        waitForElement(maxBBB);softAssertion.assertTrue(elementExists(maxBBB));
        waitForElement(maturity);softAssertion.assertTrue(elementExists(maturity));
        waitForElement(sector);softAssertion.assertTrue(elementExists(sector));
        waitForElement(selectState);softAssertion.assertTrue(elementExists(selectState));
        waitForElement(yield);softAssertion.assertTrue(elementExists(yield));
        waitForElement(selectESG);softAssertion.assertTrue(elementExists(selectESG));
        waitForElement(selectStateTax);softAssertion.assertTrue(elementExists(selectStateTax));
        waitForElement(yearsToTransition);softAssertion.assertTrue(elementExists(yearsToTransition));
        waitForElement(shortTermTaxRate);softAssertion.assertTrue(elementExists(shortTermTaxRate));
        waitForElement(longTermTaxRate);softAssertion.assertTrue(elementExists(longTermTaxRate));
        waitForElement(stYTDRealizedGain);softAssertion.assertTrue(elementExists(stYTDRealizedGain));
        waitForElement(stYTDRealizedLoss);softAssertion.assertTrue(elementExists(stYTDRealizedLoss));
        waitForElement(ltYTDRealizedGain);softAssertion.assertTrue(elementExists(ltYTDRealizedGain));
        waitForElement(ltYTDRealizedLoss);softAssertion.assertTrue(elementExists(ltYTDRealizedLoss));
        waitForElement(carryForwardLosses);softAssertion.assertTrue(elementExists(carryForwardLosses));
        waitForElement(maxRealizedShortTermGains);softAssertion.assertTrue(elementExists(maxRealizedShortTermGains));
        waitForElement(cashToRaise);softAssertion.assertTrue(elementExists(cashToRaise));
        waitForElement(collapse);softAssertion.assertTrue(elementExists(collapse));
        waitForElement(cashTaxLotInfoTab);softAssertion.assertTrue(elementExists(cashTaxLotInfoTab));
        waitForElement(securityRestrictionsTab);softAssertion.assertTrue(elementExists(securityRestrictionsTab));
        waitForElement(ifFundingincludesCashHeader);softAssertion.assertTrue(elementExists(ifFundingincludesCashHeader));
        waitForElement(ifFundingIncludesCashInput);softAssertion.assertTrue(elementExists(ifFundingIncludesCashInput));
        waitForElement(disclosureText);softAssertion.assertTrue(elementExists(disclosureText));
        waitForElement(formSectionHeader);softAssertion.assertTrue(elementExists(formSectionHeader));
        waitForElement(addNewRow);softAssertion.assertTrue(elementExists(addNewRow));
        waitForElement(deleteAll);softAssertion.assertTrue(elementExists(deleteAll));
//        waitForElement(cusipHeader);softAssertion.assertTrue(elementExists(cusipHeader));
//        waitForElement(purchaseDateHeader);softAssertion.assertTrue(elementExists(purchaseDateHeader));
//        waitForElement(costBasisHeader);softAssertion.assertTrue(elementExists(costBasisHeader));
//        waitForElement(quanityUnitsHeader);softAssertion.assertTrue(elementExists(quanityUnitsHeader));
        waitForElement(uploadFromCSV);softAssertion.assertTrue(elementExists(uploadFromCSV));
        waitForElement(guideToUploading);softAssertion.assertTrue(elementExists(guideToUploading));
        waitForElement(disclosureBottomText);softAssertion.assertTrue(elementExists(disclosureBottomText));

    }
    public void signOut() {
////        String xOutSignOut = "//*[@id=\"modal-root\"]/div/div[2]/div/button";
////        String signOutHeader = "//*[@id=\"modal-dialog-heading\"]";
////        String signOutSubHeader = "//*[@id=\"modal-root\"]/div/div[2]/div/p";
////        String cancelSignOut = "//*[@id=\"modal-root\"]/div/div[2]/div/div/button[1]";
////        String signOut = "//*[@id=\"modal-root\"]/div/div[2]/div/div/button[2]";
//        waitForElement(signOutButton);
//        softAssertion.assertTrue(elementExists(signOutButton));
//        System.out.println(getWebElementText(signOutButton));
//        clickWebElement(signOutButton);
//        waitForElement(signOut);
//        softAssertion.assertTrue(elementExists(xOutSignOut));
//        System.out.println(getWebElementText(xOutSignOut));
//        softAssertion.assertTrue(elementExists(signOutHeader));
//        System.out.println(getWebElementText(signOutHeader));
//        softAssertion.assertTrue(elementExists(signOutSubHeader));
//        System.out.println(getWebElementText(signOutSubHeader));
//        softAssertion.assertTrue(elementExists(cancelSignOut));
//        System.out.println(getWebElementText(cancelSignOut));
//        softAssertion.assertTrue(elementExists(signOut));
//        System.out.println(getWebElementText(signOut));
//        //Test X Out
//        clickWebElement(xOutSignOut);
//        softAssertion.assertFalse(elementExists(signOut));
//        clickWebElement(signOutButton);
//        waitForElement(signOut);
//        //Test Cancel
//        clickWebElement(cancelSignOut);
//        softAssertion.assertFalse(elementExists(signOut));
//        clickWebElement(signOutButton);
//        waitForElement(signOut);
//        //Test signOut
//        clickWebElement(signOut);
//        softAssertion.assertFalse(elementExists(signOut));
////        enterInWebElement(emailInput, email);
////        enterInWebElement(passwordInput, password);
////        clickWebElement(signInButton);

    }
    public void createNewProposal() {
//        waitForElement(leftNavigation);
//        clickWebElement(createNewProposalButton);
    }
}
