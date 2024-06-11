package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class LoginPage extends BasePage {

    // Locators
    private By emailOrPhoneField = By.id("identifierId");
    private By toolsMenu = By.xpath("//*[text()='Tools']");
    private By WebTableSection = By.xpath("//label[text()='Webtable']");
    private By CreateAcc = By.xpath("//span[text() ='Create account']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void CreateAccount(){
        click(CreateAcc);
    }
    // Page specific methods
    public void emailOrPhone(String username) {
        enterText(emailOrPhoneField, username);
    }

    public void toolsMenu() {
        acceptAlert();
        click(toolsMenu);
    }

    public void WebTableSection() {
        click(WebTableSection);
    }

    public void alert(){
        acceptAlert();
    }



}