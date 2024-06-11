package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWindowHandling {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "E:\\USER PROFILE - C MYMOON\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qafeast.com/demo");
        driver.manage().window().maximize();
        WebElement WindowsSection = driver.findElement(By.xpath("//label[text()='Windows']"));
        WindowsSection.click();
        WebElement ClickHere = driver.findElement(By.xpath("//a[text()='Click here']"));
        ClickHere.click();
        Thread.sleep(2000);
        String parentHandle = driver.getWindowHandle(); // get the current window handle

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
            // Print the new window url
            System.out.println(driver.getCurrentUrl());
        }
// Close the current window that is newly opened window in focus.
        driver.close();
// Switch to Parent window
        driver.switchTo().window(parentHandle);
// print the parent window url
        System.out.println(driver.getCurrentUrl());

}}
