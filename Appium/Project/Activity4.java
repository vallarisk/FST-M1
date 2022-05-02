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

public class Activity4 {

    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() throws MalformedURLException{
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("plaformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "MyEmulator");
        caps.setCapability("appActivity","com.google.android.apps.chrome.Main");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("noReset", true);

        URL serverURL = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(serverURL,caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testToDoList(){
        driver.get("https://www.training-support.net/selenium");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("compositor_view_holder")));
        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(new UiSelector().scrollable(true)).scrollForward(3)"));
        driver.findElementByXPath("//android.view.View[contains(@text, 'To-Do List')]").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[contains(@resource-id, 'taskInput')]")));

        //Create Tasks list
        //Add first task
        driver.findElementByXPath("//android.widget.EditText[contains(@resource-id, 'taskInput')]").sendKeys("task1");
        driver.findElementByXPath("//android.widget.Button[contains(@text, 'Add Task')]").click();
        //Add second task
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[contains(@resource-id, 'taskInput')]")));
        driver.findElementByXPath("//android.widget.EditText[contains(@resource-id, 'taskInput')]").sendKeys("task2");
        driver.findElementByXPath("//android.widget.Button[contains(@text, 'Add Task')]").click();
        //Add third task
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[contains(@resource-id, 'taskInput')]")));
        driver.findElementByXPath("//android.widget.EditText[contains(@resource-id, 'taskInput')]").sendKeys("task3");
        driver.findElementByXPath("//android.widget.Button[contains(@text, 'Add Task')]").click();
        //Assert task list is created
        MobileElement tasklist = driver.findElementByXPath("//android.view.View[contains(@resource-id, 'tasksList')]");
        Assert.assertTrue(tasklist.isDisplayed());
        //Complete Tasks List
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[contains(@resource-id, 'tasksList')]/android.view.View[2]/android.view.View")));
        driver.findElementByXPath("//android.view.View[contains(@resource-id, 'tasksList')]/android.view.View[2]/android.view.View").click();
        driver.findElementByXPath("//android.view.View[contains(@resource-id, 'tasksList')]/android.view.View[3]/android.view.View").click();
        driver.findElementByXPath("//android.view.View[contains(@resource-id, 'tasksList')]/android.view.View[4]/android.view.View").click();

        //Clear the list
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[contains(@resource-id, 'tasksCard')]/android.view.View[3]/android.view.View")));
        driver.findElementByXPath("//android.view.View[contains(@resource-id, 'tasksCard')]/android.view.View[3]/android.view.View").click();
        //Assert the removal of list
        Assert.assertFalse(tasklist.isDisplayed());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
