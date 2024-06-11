package Page;

import Utils.Driver;
import org.openqa.selenium.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BasePage extends Driver {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void enterText(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }
    public void isVisible(By locator) {
        WebElement element = driver.findElement(locator);
        element.isDisplayed();
    }

    public void scrolldown() throws InterruptedException, AWTException
    {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    }

    public void switchToWindow(int index) {

            Set<String> allWindowHandles = driver.getWindowHandles();
        List<String> allHandles = new ArrayList<>(allWindowHandles);
            driver.switchTo().window(allHandles.get(index));

    }
    public String getAlertText() {
        String text = "";
            Alert alert = driver.switchTo().alert();
            text = alert.getText();
        return text;
    }
    public void acceptAlert() {
        // Switch to the alert
        Alert alert = driver.switchTo().alert();


        // Accept the alert (equivalent to clicking "OK" or "Yes")
        alert.accept();
    }
    public void dismissAlert() {
        String text = "";
        try {
            Alert alert = driver.switchTo().alert();
            text = alert.getText();
            alert.dismiss();

        } catch (WebDriverException e) {
         System.out.println("WebDriverException : FAIL");

        }

    }
}
