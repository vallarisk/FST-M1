package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

public class Activity9 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://alchemy.hguy.co/crm");
        driver.manage().window().maximize();
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

    }
    @Test
    public void traversingTable2() throws InterruptedException {
        driver.findElement(By.id("grouptab_0")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Leads")));
        driver.findElement(By.linkText("Leads")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='module-title-text']")));
        String pageName = driver.findElement(By.xpath("//h2[@class='module-title-text']")).getText();
        Assert.assertEquals(pageName, " LEADS");


        List<WebElement> tableNames = driver.findElements(By.xpath("//*[@id='MassUpdate']/div[3]/table/tbody/tr/td[3]/b/a"));

        for(int i = 0; i<=19; i++) {
            if(i<10) {
                System.out.println("First 10 Names in the table are - "+ tableNames.get(i).getText());
            }
        }

        List<WebElement> tableUsers = driver.findElements(By.xpath("//*[@id='MassUpdate']/div[3]/table/tbody/tr/td[8]/a"));

        for(int i = 0; i<=19; i++) {
            if(i<10) {
                System.out.println("First 10 Users in the table are - " + tableUsers.get(i).getText());
            }
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}

