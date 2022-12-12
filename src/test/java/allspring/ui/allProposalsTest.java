package allspring.ui;



import allspring.pages.allProposalsPage;
import allspring.pages.loginPage;
import org.testng.annotations.Test;
import ui.TestMain;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class allProposalsTest extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public allProposalsTest() throws AWTException, IOException {
    }

    @Test
    public void accountPageTest() throws AWTException, IOException {
        loginPage loginP = new loginPage();
        loginP.verifyLoginPage();
        loginP.logInto("--", "--");
        System.out.println("allProposalsPageTest");
        allProposalsPage allProposalsPage = new allProposalsPage();
        allProposalsPage.verifyAllProposalsPage();
        allProposalsPage.signOut();
        driver.close();


    }



}
