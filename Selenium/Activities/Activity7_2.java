package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        driver.manage().window().maximize();

        System.out.println("Title of the page is- "+driver.getTitle());

        driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("vallari");
        driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("test123");
        driver.findElement(By.xpath("//*[@id='dynamic-attributes-form']/div/div[3]/input")).sendKeys("test123");
        driver.findElement(By.xpath("//*[starts-with(@class, 'email')]")).sendKeys("test@test.com");

        driver.findElement(By.xpath("//button[@onclick ='signUp()']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='action-confirmation']")));
        System.out.println(driver.findElement(By.xpath("//*[@id='action-confirmation']")).getText());

        driver.close();


    }
}
