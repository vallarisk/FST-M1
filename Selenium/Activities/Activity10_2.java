package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Activity10_2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        driver.manage().window().maximize();
        System.out.println("Page title is" + driver.getTitle() );

        WebElement keyPressed = driver.findElement(By.id("keyPressed"));

        Actions action = new Actions(driver);
        action.sendKeys("V").build().perform();
        System.out.println(keyPressed.getText());

        action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
        action.keyUp(Keys.CONTROL).build().perform();
        System.out.println(keyPressed.getText());

        driver.close();
    }
}
