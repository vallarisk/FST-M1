package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//importing the specific method in static manner
import static org.testng.Assert.assertEquals;

public class Activity1 {
    WebDriver driver;


    @BeforeClass
    //Initialise driver object
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "C://Windows/System32/geckodriver.exe");
        driver = new FirefoxDriver();
        //Open browser
        driver.get("https://www.training-support.net/");
    }

    @Test
    public void homepageTest(){
        //Get page title
        String homepageTitle = driver.getTitle();

        //Assertion for homepage title
        assertEquals(homepageTitle, "Training Support");

        //Find and click About Us
        driver.findElement(By.id("about-link")).click();

        //Find About Us page title
        String aboutUsPageTitle = driver.getTitle();
        assertEquals(aboutUsPageTitle, "About Training Support");
    }

    @AfterClass
    public void tearDown(){
        //Close the browser
        driver.close();
    }


}
