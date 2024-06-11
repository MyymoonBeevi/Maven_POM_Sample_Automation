package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SampleWebTableCode {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "E:\\USER PROFILE - C MYMOON\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qafeast.com/demo");
        driver.manage().window().maximize();
        WebElement WebTableSection = driver.findElement(By.xpath("//label[text()='Webtable']"));
        WebTableSection.click();
        WebElement table =  driver.findElement(By.xpath("//table[@id='webtable-table']/tbody"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));
        int rowCount = rows.size();
        System.out.println("Number of rows in the table: " + rowCount);

        List<WebElement> columns = table.findElements(By.tagName("td"));
        int columnCount = columns.size();
        System.out.println("Number of columns in the table: " + columnCount);

//        WebElement cell = rows.get(3).findElements(By.tagName("td")).get(2);
//        String cellValue = cell.getText();
//        System.out.println("Cell value: " + cellValue);

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell1 : cells) {
                String cellValue1 = cell1.getText();
                System.out.println("Cell value: " + cellValue1);
            }
        }

    }}



//        WebElement Loginbutton = driver.findElement(By.xpath("//label[text()='Button']"));
//        Loginbutton.click();
//        WebElement Login = driver.findElement(By.id("button-1"));
//        Login.click();




