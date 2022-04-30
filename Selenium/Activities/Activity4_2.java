package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        driver.manage().window().maximize();

        System.out.println("Title of the page is " + driver.getTitle());

        driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("user");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("test@user.com");
        driver.findElement(By.xpath("//*[@id='number']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//textarea")).sendKeys("This is just for test");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.close();

    }
}
