package Activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {
    AndroidDriver<MobileElement> driver;

    @BeforeMethod
    public void seUp() throws MalformedURLException {

        //Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
//        caps.setCapability("deviceId", "f78c2648");
        caps.setCapability("deviceName", "MyEmulator");
//        caps.setCapability("appPackage", "com.oneplus.calculator");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);

        //Server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(serverURL, caps);
    }

    @Test
    public void multiplicationTest(){
        MobileElement digit5 = driver.findElementById("digit_5");
        digit5.click();
        MobileElement multiplySign = driver.findElementById("op_mul");
        multiplySign.click();
        MobileElement digit2 = driver.findElementById("digit_2");
        digit2.click();
        MobileElement equalToSign = driver.findElementByAccessibilityId("equals");
        equalToSign.click();
        String multiplicationResult = driver.findElementById("result").getText();
        Assert.assertEquals(multiplicationResult, "10");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
