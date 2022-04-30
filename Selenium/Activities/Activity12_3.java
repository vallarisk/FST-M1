package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity12_3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/popups");
        driver.manage().window().maximize();
        driver.findElement(By.className("orange")).click();

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");

        driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();

        String welcomeMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(welcomeMessage);
        driver.close();
    }
}
