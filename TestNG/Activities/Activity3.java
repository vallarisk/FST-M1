package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "C://Windows/System32/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");

    }

    @Test
    public void loginAsAdmin(){
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();
        String S = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(S,"Welcome Back, admin");
    }


    @AfterClass
    public void closeDown(){
        driver.close();
    }
}
