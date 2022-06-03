package SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;
    @Test
    public void verifyPageTitle(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "SuiteCRM");
        driver.close();
    }


}
