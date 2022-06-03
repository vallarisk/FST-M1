package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Activity7 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait (driver, Duration.ofSeconds(10));

        driver.get("https://alchemy.hguy.co/crm");
        driver.manage().window().maximize();
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
    }

    @Test
    public void readAdditionalInfo() throws InterruptedException {
        driver.findElement(By.id("grouptab_0")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Leads")));
        driver.findElement(By.linkText("Leads")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='module-title-text']")));
        String pageName = driver.findElement(By.xpath("//h2[@class='module-title-text']")).getText();
        Assert.assertEquals(pageName, " LEADS");

        wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='MassUpdate']/div[3]/table/tbody/tr[1]/td[10]"))));
        driver.findElement(By.xpath("//*[@id='MassUpdate']/div[3]/table/tbody/tr[1]/td[10]")).click();
        wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ui-id-5']/span"))));

        String phoneNo = driver.findElement(By.xpath("//*[@id='ui-id-5']/span")).getText();
        System.out.println("Phone number is " + phoneNo);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
