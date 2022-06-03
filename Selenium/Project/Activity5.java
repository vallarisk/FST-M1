package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm");
        driver.manage().window().maximize();
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
    }
    @Test
    public void gettingColors(){
        String S = driver.findElement(By.id("toolbar")).getCssValue("color");
        Assert.assertEquals(S, "rgba(83, 77, 100, 1)");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
