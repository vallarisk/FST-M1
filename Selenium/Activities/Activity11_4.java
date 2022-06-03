package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity11_4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.get("https://www.training-support.net/selenium/tab-opener");
        driver.manage().window().maximize();

        String parentHandle = driver.getWindowHandle();
        String pageTitle = driver.getTitle();
        String heading = driver.findElement(By.xpath("//*[@class='content']")).getText();
        System.out.println("Handle of the main page is -->"+parentHandle);
        System.out.println(" Title of the main page is -->"+pageTitle);
        System.out.println("Heading of the main page is -->" + heading);
        driver.findElement(By.id("launcher")).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> allWindows = driver.getWindowHandles();
        for(String window:allWindows){
            driver.switchTo().window(window);
        }

        System.out.println("First new window handle is--> "+driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println("Title of the first new tab is-->" +driver.getTitle());
        heading = driver.findElement(By.xpath("//*[@class='content']")).getText();
        System.out.println("Heading of the main page is -->" + heading);

        driver.findElement(By.id("actionButton")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        allWindows = driver.getWindowHandles();
        for(String window: allWindows){
            driver.switchTo().window(window);
        }

        System.out.println("Second new window handle is--> "+driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println("Title of the second new tab is-->" +driver.getTitle());
        heading = driver.findElement(By.xpath("//*[@class='content']")).getText();
        System.out.println("Heading of the main page is -->" + heading);

        driver.quit();
    }
}
