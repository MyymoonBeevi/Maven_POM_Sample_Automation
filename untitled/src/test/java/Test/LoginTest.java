
package Test;

import Page.LoginPage;
import Utils.Hooks;
import org.testng.annotations.Test;

import java.awt.*;

public class LoginTest extends Hooks  {
    @Test
    public void successfulLoginTest() throws InterruptedException, AWTException {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.CreateAccount();
        Thread.sleep(2000);
        loginPage.scrolldown();
        loginPage.scrolldown();
    }}