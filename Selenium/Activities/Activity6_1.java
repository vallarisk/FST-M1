package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        driver.manage().window().maximize();
        System.out.println("Title of the page is "+ driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.id("toggleCheckbox")).click();

        WebElement element = driver.findElement(By.xpath("//*[@type='checkbox']"));
        wait.until(ExpectedConditions.invisibilityOf(element));
        System.out.println("checkbox is now disappeared");
        driver.findElement(By.id("toggleCheckbox")).click();
        wait.until(ExpectedConditions.visibilityOf(element));
        System.out.println("checkbox is now visible");
        driver.close();
    }
}
