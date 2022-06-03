package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Activity11_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Title of the page is -->" + driver.getTitle());

        WebElement prompt = driver.findElement(By.id("prompt"));
        prompt.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Yes, you are!");
        alert.accept();
        driver.close();
    }
}
