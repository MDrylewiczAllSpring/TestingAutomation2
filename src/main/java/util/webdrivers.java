package util;

import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Environment;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.nio.file.Path;


public class webdrivers {
    public static WebDriver loadWebdriver(String userName, String password) throws AWTException {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver3.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver driver = new ChromeDriver(options);
        //comment the above 2 lines and uncomment below 2 lines to use Chrome

        //WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "https://allspring-uat.codeandtheory.net";

        // launch Fire fox and direct it to the Base URL

        driver.get(baseUrl);
        System.out.println(JFrame.getWindows().toString());


        // press Escape programatically - the print dialog must have focus, obviously
//        Robot r = new Robot();
//        driver.switchTo().activeElement();
////        r.mouseMove();
////        r.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
//        for (int i = 0; i < userName.length(); i++) {
//            char c = userName.charAt(i);
//            if (Character.isUpperCase(c)) {
//                r.keyPress(KeyEvent.VK_SHIFT);
//            }
//            r.keyPress(Character.toUpperCase(c));
//            r.keyRelease(Character.toUpperCase(c));
//            if (Character.isUpperCase(c)) {
//                r.keyRelease(KeyEvent.VK_SHIFT);
//            }
//        }
////            r.delay(delay);
//
//
//            r.keyPress(KeyEvent.VK_TAB);
//        r.keyRelease(KeyEvent.VK_TAB);
//
//        for (int i = 0; i < password.length(); i++) {
//            char c = password.charAt(i);
//            if (Character.isUpperCase(c)) {
//                r.keyPress(KeyEvent.VK_SHIFT);
//            }
//            if (Character.toUpperCase(c) == '@') {
//                r.keyPress(KeyEvent.VK_SHIFT);
//                r.keyPress(KeyEvent.VK_2);
//                r.keyRelease(KeyEvent.VK_2);
//                r.keyRelease(KeyEvent.VK_SHIFT);
//            } else {
//                r.keyPress(Character.toUpperCase(c));
//                r.keyRelease(Character.toUpperCase(c));
//            }
//            if (Character.isUpperCase(c)) {
//                r.keyRelease(KeyEvent.VK_SHIFT);
//            }
//        }
//
//        r.keyPress(KeyEvent.VK_ENTER);
//        r.keyRelease(KeyEvent.VK_ENTER);


        return driver;
    }


}
