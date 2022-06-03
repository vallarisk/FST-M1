package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    @Test
    public void printURLofHeaderImage(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
        String imageURL = driver.findElement(By.xpath("//img[@alt='SuiteCRM']")).getDomProperty("src");
        System.out.println("The output URL is "+imageURL);
        driver.close();
    }
}
