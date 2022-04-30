package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity5 {
    WebDriver driver;
    @BeforeTest(alwaysRun = true)
    public void setUp(){
//        System.setProperty("webdriver.gecko.driver", "C://Windows/System32/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void getPageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Target Practice");
    }
    @Test (dependsOnMethods = {"getPageTitle"} ,groups = { "HeaderTests" })
    public void headerTest1() {
        String text = driver.findElement(By.id("third-header")).getText();
        Assert.assertEquals(text, "Third header");
    }
    @Test (dependsOnMethods = {"getPageTitle"} ,groups = { "HeaderTests" })
    public void headerTest2(){
        String color = driver.findElement(By.xpath("//h5[contains(@class, 'green')]")).getCssValue("color");
        Assert.assertEquals(color, "rgb(33, 186, 69)");
    }

    @Test (dependsOnMethods = {"getPageTitle"} ,groups = { "ButtonTests" })
    public void buttonTests1() {
        String btnText = driver.findElement(By.xpath("//button[contains(@class, 'olive')]")).getText();
        Assert.assertEquals(btnText, "Olive");
    }

    @Test (dependsOnMethods = {"getPageTitle"} ,groups = { "ButtonTests" })
    public void buttonTests2(){
        String btn3rdRow = driver.findElement(By.xpath("//button[contains(@class, 'teal')]")).getCssValue("background-color");
        Assert.assertEquals(btn3rdRow, "rgb(0, 181, 173)");
    }
    @AfterTest(alwaysRun = true)
    public void tearDown(){
        driver.close();
    }
}
