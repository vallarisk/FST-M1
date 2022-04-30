package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net");
        driver.manage().window().maximize();

        System.out.println("Title of the page is " + driver.getTitle());
        WebElement element;
        element = driver.findElement(By.id("about-link"));
        System.out.println("Text on the element located with ID is " + element.getText());
        element = driver.findElement(By.className("green"));
        System.out.println("Text on the element located with className is " + element.getText());
        element = driver.findElement(By.linkText("About Us"));
        System.out.println("Text on the element located with linkText is " + element.getText());
        element = driver.findElement(By.cssSelector("#about-link"));
        System.out.println("Text on the element is located with cssSelector " + element.getText());

        driver.close();


    }
}
