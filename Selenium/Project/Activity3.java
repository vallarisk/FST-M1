package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;
    @Test
    public void getCopyRightText(){
        driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/crm");
        String footerElementText= driver.findElement(By.id("admin_options")).getText();
        System.out.println("The Footer text is "+ footerElementText);
        driver.close();

    }
}
