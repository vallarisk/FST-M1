package SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;
    @Test
    public void verifyPageTitle(){
        driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/crm/");
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "SuiteCRM");
        driver.close();
    }


}
