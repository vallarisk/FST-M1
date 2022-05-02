package AppiumProject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3_Bonus {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp ()throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "MyEmulator");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("noRest", true);

        URL serverURL = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(serverURL, caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void googleKeepsCreator(){
        wait.until(ExpectedConditions.elementToBeClickable(By.id("new_note_button")));
        driver.findElementById("new_note_button").click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("editable_title")));
        driver.findElementById("editable_title").sendKeys("Test Title");
        driver.findElementById("edit_note_text").sendKeys("This is a test note");
        driver.findElementById("menu_reminder").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bs_list_view")));
        driver.findElementById("menu_text").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("reminder_chip")));
        Assert.assertEquals(driver.findElementById("reminder_chip").getText(), "Today, 6:00 PM");
        driver.findElementByAccessibilityId("Open navigation drawer").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("browse_note_interior_content")));
        String noteText = driver.findElementById("index_note_text_description").getText();
        Assert.assertEquals(noteText, "This is a test note");
    }

    @AfterMethod
    public void tearDown(){driver.quit();}
}

