package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://www.training-support.net/selenium/ajax");
        driver.manage().window().maximize();
        System.out.println("Title of the page is " + driver.getTitle());

        driver.findElement(By.xpath("//*[@class = 'ui violet button']")).click();


        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='ajax-content']/h1"),"HELLO!"));
        System.out.println("First message is- " + driver.findElement(By.xpath("//*[@id='ajax-content']/h1")).getText());

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='ajax-content']/h3"), "I'm late!"));
        System.out.println("Second message is- " + driver.findElement(By.xpath("//*[@id='ajax-content']/h3")).getText());

        driver.close();

    }
}
