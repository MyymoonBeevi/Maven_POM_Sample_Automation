package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SampleRobotClass {
     public static  void main(String[] args) throws AWTException, InterruptedException {
         WebDriver driver = new ChromeDriver();
         //implicit wait - One time
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

         driver.get("https://www.gmail.com/");
         driver.manage().window().maximize();
         driver.findElement(By.xpath("//span[text()= 'Create account']")).click();
         Robot robot = new Robot();
         robot.keyPress(KeyEvent.VK_DOWN);
         robot.keyRelease(KeyEvent.VK_DOWN);
         robot.keyPress(KeyEvent.VK_DOWN);
         robot.keyRelease(KeyEvent.VK_DOWN);
         driver.findElement(By.xpath("//span[text()='For my child']")).click();

         Thread.sleep(2000);

         driver.findElement(By.xpath("//span[text()='Yes, continue']")).click();
         Thread.sleep(2000);
         WebElement FirstName =  driver.findElement(By.xpath("(//div[@class='Xb9hP'])[1]"));
         FirstName.sendKeys("Mymoon"+ Keys.ENTER);
         WebElement LastName = driver.findElement(By.xpath("(//div[@class='Xb9hP'])[2]"));
         LastName.sendKeys("Beevi"+ Keys.ENTER);

     }
}
