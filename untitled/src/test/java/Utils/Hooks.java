package Utils;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Hooks extends Driver {
@BeforeClass
public void setUp(){
    driver = this.setDriver();
    driver.get("https://www.gmail.com/");
    driver.manage().window().maximize();
    }

    @AfterClass
    public void close(){
//    driver.quit();
    }
}
