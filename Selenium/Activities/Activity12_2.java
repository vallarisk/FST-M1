package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity12_2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        driver.manage().window().maximize();

        String titleOfPage = driver.getTitle();
        System.out.println("Title of the main Page is--> "+titleOfPage);

        driver.switchTo().frame(0);

        driver.switchTo().frame(0);

        String iframe1Heading= driver.findElement(By.xpath("/html/body/div[1]/div/div/div")).getText();
        System.out.println(iframe1Heading);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.switchTo().frame(1);
        String iframe2Heading= driver.findElement(By.xpath("/html/body/div[1]/div/div/div")).getText();
        System.out.println(iframe2Heading);

        driver.close();


    }
}
