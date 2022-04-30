package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        driver.manage().window().maximize();
        System.out.println("Title of the page is "+ driver.getTitle());

        boolean result = driver.findElement(By.xpath("//*[@type = 'checkbox']")).isSelected();
        System.out.println("Checkbox isDisplayed = " + result);

        driver.findElement(By.id("toggleCheckbox")).click();
        result = driver.findElement(By.xpath("//*[@type = 'checkbox']")).isSelected();
        System.out.println("Checkbox isDisplayed = " + result);

        driver.close();
    }
}
