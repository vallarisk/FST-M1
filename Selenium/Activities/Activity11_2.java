package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity11_2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        driver.manage().window().maximize();

        System.out.println("Title of the page is -->" + driver.getTitle());
        WebElement confirmButton = driver.findElement(By.id("confirm"));
        confirmButton.click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Text on the alert is -->"+alertText);
        alert.accept();

        confirmButton.click();
        alert = driver.switchTo().alert();
        alertText = alert.getText();
        System.out.println("Text on the alert is -->"+alertText);
        alert.dismiss();

        driver.close();




    }
}
