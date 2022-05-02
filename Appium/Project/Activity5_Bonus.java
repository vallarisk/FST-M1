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

public class Activity5_Bonus {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "MyEmulator");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
        URL serverURL = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(serverURL,caps);
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.training-support.net/selenium");

    }
    @Test
    public void successfulLogin(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator("text(\"Login\")")));
        MobileElement loginButton = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Login\")"));
        loginButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[contains(@resource-id, 'loginOverlay')]")));
        driver.findElementByXPath("//android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.widget.EditText[1]").sendKeys("admin");
        driver.findElementByXPath("//android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.widget.EditText[2]").sendKeys("password");
        driver.findElementByXPath("//android.widget.Button[contains(@text, 'Login')]").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]")));
        MobileElement msgBOX = driver.findElement(By.xpath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2][contains (@text, 'Something went wrong.')]"));
        Assert.assertEquals(msgBOX.getText(),"Something went wrong.");
    }
    @Test
    public void failureLogin(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator("text(\"Login\")")));
        MobileElement loginButton = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Login\")"));
        loginButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[contains(@resource-id, 'loginOverlay')]")));
        driver.findElementByXPath("//android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.widget.EditText[1]").sendKeys("admin");
        driver.findElementByXPath("//android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.widget.EditText[2]").sendKeys("password");
        driver.findElementByXPath("//android.widget.Button[contains(@text, 'Login')]").click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]")));
        MobileElement msgBOX = driver.findElement(By.xpath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2][contains (@text, 'Something went wrong.')]"));
        Assert.assertEquals(msgBOX.getText(),"Something went wrong.");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
