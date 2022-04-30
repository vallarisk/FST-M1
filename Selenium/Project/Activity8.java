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

import java.time.Duration;
import java.util.List;

public class Activity8 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        wait = new WebDriverWait (driver, Duration.ofSeconds(10));

        driver.get("https://alchemy.hguy.co/crm");
        driver.manage().window().maximize();
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
    }

    @Test
    public void traversingTable() throws InterruptedException {
        driver.findElement(By.id("grouptab_0")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Accounts")));
        driver.findElement(By.linkText("Accounts")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='module-title-text']")));
        String pageName = driver.findElement(By.xpath("//h2[@class='module-title-text']")).getText();
        Assert.assertEquals(pageName, " ACCOUNTS");

        List<WebElement> names = driver.findElements(By.xpath("//*[@id='MassUpdate']/div[3]/table/tbody/tr[@class='oddListRowS1']/td[3]/b/a"));

        System.out.println("First 5 names in the Odd number rows of the table are - ");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(names.get(i).getText());
            }
        }
    }


    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}

