package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        driver.manage().window().maximize();

        System.out.println("Title of the page is - " + driver.getTitle());
        driver.findElement(By.id("simple")).click();

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Text on the alert is "+ alertText);
        alert.accept();
        driver.close();
    }
}
