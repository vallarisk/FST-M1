package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "C://Windows/System32/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/");

    }

    @Test
    public void firstTest(){
       String title = driver.getTitle();
        Assert.assertEquals(title, "Training Support");
    }

    @Test
    public void secondTest(){
         String s = driver.findElement(By.xpath("//a[contains(@class, 'button')]")).getCssValue("color");
         Assert.assertEquals(s,"rgb(46, 204, 64)");
         //rgb(46, 204, 64)
    }
    @Test (enabled = false)
    public void thirdTest(){

    }
    @Test
    public void fourthTest() throws SkipException {
        String condition = "Skip Test";
        throw new SkipException("Skipping - This is not ready for testing ");
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
