package AppiumProject;

import io.appium.java_client.MobileBy;
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

public class Activity1 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "android");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("deviceName", "MyEmulator");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("noReset", true);

        URL serverURL = new URL("http://0.0.0.0:4723/wd/hub");

        driver = new AndroidDriver<MobileElement>(serverURL, caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void googleTasksCreator(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Create new task")));
        driver.findElementByAccessibilityId("Create new task").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add_task_title")));
        driver.findElementById("add_task_title").sendKeys("Test Task");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("add_task_done")));
        driver.findElementById("add_task_done").click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("My Tasks")));
        String taskName = driver.findElementById("task_name").getText();
        Assert.assertEquals(taskName, "Test Task");

        driver.findElementByAccessibilityId("Mark as complete").click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("completed_count")));
        driver.findElementById("completed_count").click();
        String completedtaskName = driver.findElementById("task_name").getText();
        Assert.assertEquals(completedtaskName, "Test Task");
    }



    @AfterMethod
    public void tearDown(){ driver.quit(); }

}
