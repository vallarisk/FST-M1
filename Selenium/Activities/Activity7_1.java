package Activities;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        driver.manage().window().maximize();
        System.out.println("Title of the page is- "+driver.getTitle());

        driver.findElement(By.xpath("//*[starts-with(@class, 'username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[starts-with(@class, 'password')]")).sendKeys("password");

        driver.findElement(By.xpath("//button[@onclick ='signIn()']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class ,'massive green')]")));
        System.out.println(driver.findElement(By.xpath("//*[contains(@class ,'massive green')]")).getText());

        driver.close();


    }
}
