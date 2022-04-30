package SeleniumProject;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/crm");
        driver.manage().window().maximize();
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
    }
    @Test
    public void loginToCRM(){
        String homepageText = driver.findElement(By.id("moduleTab_Home")).getText();
        Assert.assertEquals(homepageText, "HOME");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
