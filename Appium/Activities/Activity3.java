package Activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "MyEmulator");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage","com.android.calculator2");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);

        URL serverURL = new URL("http://0.0.0.0:4723/wd/hub");

        driver = new AndroidDriver<MobileElement>(serverURL, caps);
    }

    @Test
    public void addition(){
        driver.findElementById("digit_5").click();
        driver.findElementById("op_add").click();
        driver.findElementById("digit_9").click();
        driver.findElementById("eq").click();
        String additionRes = driver.findElementById("result").getText();
        System.out.println("Addition Result is "+ additionRes);
    }

    @Test
    public void subtraction(){
        driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("op_sub").click();
        driver.findElementById("digit_5").click();
        driver.findElementById("eq").click();
        String subtractionRes = driver.findElementById("result").getText();
        System.out.println("Subtraction Result is "+ subtractionRes);

    }

    @Test
    public void multiplication(){
        driver.findElementById("digit_5").click();
        driver.findElementById("op_mul").click();
        driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("eq").click();
        String multiplicationRes = driver.findElementById("result").getText();
        System.out.println("Multiplication Result is "+ multiplicationRes);
    }
    @Test
    public void division(){
        driver.findElementById("digit_5").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("op_div").click();
        driver.findElementById("digit_2").click();
        driver.findElementById("eq").click();
        String divisionRes = driver.findElementById("result").getText();
        System.out.println("Division Result is "+ divisionRes);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
