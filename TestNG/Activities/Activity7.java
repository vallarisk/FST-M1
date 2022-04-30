package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
        driver.manage().window().maximize();
    }

    @DataProvider (name = "Authentication")
    public Object[][] credentials(){
        return new Object[][]{
        { "admin", "password" }
        };
    }

    @Test(dataProvider = "Authentication")
    public void loginTest(String username, String password){
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@onclick='signIn()']")).click();
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
