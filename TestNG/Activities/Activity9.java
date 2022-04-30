package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class Activity9 {
    WebDriver driver;
    Alert alert;

    @BeforeTest
    public void setUp(){
        Reporter.log("Test Set up started");
        driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void backToDefault(){
        Reporter.log("Switching to default content after testing the alert");
        driver.switchTo().defaultContent();
    }

    @Test
    public void simpleAlertTestCase(){
        Reporter.log("Testing Simple Alert");
        driver.findElement(By.id("simple")).click();
        alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "This is a JavaScript Alert!");
        alert.accept();
        Reporter.log("Simple Alert accepted");
    }
    @Test
    public void confirmAlertTestCase(){
        Reporter.log("Testing Confirmation Alert");
        driver.findElement(By.id("confirm")).click();
        alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"This is a JavaScript Confirmation!");
        alert.dismiss();
        Reporter.log("Dismissed Confirmation Alert");
    }
    @Test
    public void promptAlertTestCase(){
        Reporter.log("Testing Prompt Alert");
        driver.findElement(By.id("prompt")).click();
        alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"This is a JavaScript Prompt!");
        alert.sendKeys("Okay, thanks!");
        alert.accept();
        Reporter.log("Typed 'Okay! thanks' in Prompt Alert");
    }

    @AfterTest
    public void tearDown(){
        Reporter.log("Tearing down the test");
        driver.close();
    }
}
