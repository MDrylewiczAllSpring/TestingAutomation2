package allspring.ui;



import allspring.pages.allProposalsPage;
import allspring.pages.loginPage;
import allspring.pages.newProposalsPage;
import org.testng.annotations.Test;
import ui.TestMain;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class createProposalTest extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public createProposalTest() throws AWTException, IOException {
    }

    @Test
    public void accountPageTest() throws AWTException, IOException {
        loginPage loginP = new loginPage();
        loginP.verifyLoginPage();
        loginP.logInto("--", "--");
        System.out.println("createProposalsPageTest");
        allProposalsPage allProposalsPage = new allProposalsPage();
        allProposalsPage.createNewProposal();
        newProposalsPage newProposalPage = new newProposalsPage();
        newProposalPage.verifyAllProposalsPage();
        driver.close();


    }



}
