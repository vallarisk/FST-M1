package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        driver.manage().window().maximize();

        System.out.println("Title of the page is " + driver.getTitle());

        driver.findElement(By.id("firstName")).sendKeys("test");
        driver.findElement(By.id("lastName")).sendKeys("user");
        driver.findElement(By.id("email")).sendKeys("test@user.com");
        driver.findElement(By.id("number")).sendKeys("1234567890");
        driver.findElement(By.cssSelector(".green")).click();
        driver.close();

    }
}
