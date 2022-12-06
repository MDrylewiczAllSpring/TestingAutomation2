package allspring.ui;



import allspring.pages.allProposalsPage;
import allspring.pages.loginPage;
import org.testng.annotations.Test;
import ui.TestMain;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class loginLogOutTest extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public loginLogOutTest() throws AWTException, IOException {
    }

    @Test
    public void accountPageTest() throws AWTException, IOException {
        loginPage loginP = new loginPage();
        loginP.verifyLoginPage();
        loginP.logInto("michael.drylewicz@allspringglobal.com", "MikeTest1!");
        System.out.println("loginPageTest");
        allProposalsPage allProposalsPage = new allProposalsPage();
        driver.close();


    }



}
