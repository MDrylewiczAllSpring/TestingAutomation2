package allspring.ui;



import allspring.pages.loginPage;
import org.testng.annotations.Test;
import pages.accountPage;
import pages.homePage;
import ui.TestMain;

import java.awt.*;
import java.io.IOException;
import java.sql.Statement;
//

public class loginTest extends TestMain {
    //    WebDriver driver = loadDriverConfig();
    Statement devConnection;

    public loginTest() throws AWTException, IOException {
    }

    @Test
    public void accountPageTest() throws AWTException, IOException {
        loginPage loginP = new loginPage();
        loginP.verifyLoginPage();
        loginP.logInto("michael.drylewicz@allspringglobal.com", "MikeTest1!");
        System.out.println("loginPageTest");
        driver.close();


    }



}
