package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;


public class Activity10 {
    WebDriver driver;
    Actions actions;
    WebElement slider;
    WebElement volLevel;

    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
        Reporter.log("Starting the test");
        driver.get("https://www.training-support.net/selenium/sliders");
        driver.manage().window().maximize();
        actions = new Actions(driver);
        slider = driver.findElement(By.id("slider"));
        volLevel = driver.findElement(By.id("value"));
        Reporter.log("Initialised driver & actions");
        Reporter.log("Located the required webElements for the tests");
    }
    @Test
    public void middleValue(){
        slider.click();
//        actions.clickAndHold(slider).moveByOffset(10,0).build().perform();
        Assert.assertEquals(volLevel.getText(),"50");
        Reporter.log("Slider is on 50%");
    }
    @Test
    public void maxValue(){
        slider.click();
        actions.clickAndHold(slider).moveByOffset(75,0).build().perform();
        Assert.assertEquals(volLevel.getText(),"100");
        Reporter.log("Slider is on 100%");
    }
    @Test
    public void minValue(){
        slider.click();
        actions.clickAndHold(slider).moveByOffset(-75,0).build().perform();
        Assert.assertEquals(volLevel.getText(),"0");
        Reporter.log("Slider is on 0%");
    }
    @Test
    public void thirtyPerValue(){
        slider.click();
        actions.clickAndHold(slider).moveByOffset(-23,0).build().perform();
        Assert.assertEquals(volLevel.getText(),"30");
        Reporter.log("Slider is on 30%");
    }
    @Test
    public void eightyPerValue(){
        slider.click();
        actions.clickAndHold(slider).moveByOffset(34,0).build().perform();
        Assert.assertEquals(volLevel.getText(),"80");
        Reporter.log("Slider is on 80%");

    }
    @AfterTest
    public void tearDown(){
        Reporter.log("tearing down the test");
        driver.close();
    }
}
