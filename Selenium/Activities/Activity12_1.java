package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity12_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/iframes");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);
        String frame1Heading = driver.findElement(By.xpath("/html/body/div[1]/div/div")).getText();
        System.out.println(frame1Heading);
        WebElement frame1Button = driver.findElement(By.id("actionButton"));
        System.out.println("Text on the frame 1 button before clicking--> "+ frame1Button.getText());
        System.out.println("Color of the frame 1 button before clicking--> "+ frame1Button.getCssValue("color"));
        frame1Button.click();
        frame1Button = driver.findElement(By.id("actionButton"));
        System.out.println("Text on the frame 1 button after clicking--> " + frame1Button.getText());
        System.out.println("Color of the frame 1 button after clicking--> " + frame1Button.getCssValue("color"));

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        String frame2Heading = driver.findElement(By.xpath("/html/body/div[1]/div/div")).getText();
        System.out.println(frame1Heading);
        WebElement frame2Button = driver.findElement(By.id("actionButton"));
        System.out.println("Text on the frame 2 button before clicking--> "+ frame2Button.getText());
        System.out.println("Color of the frame 2 button before clicking--> "+ frame2Button.getCssValue("color"));
        frame2Button.click();
        frame2Button = driver.findElement(By.id("actionButton"));
        System.out.println("Text on the frame 2 button after clicking--> " + frame2Button.getText());
        System.out.println("Color of the frame 2 button after clicking--> " + frame2Button.getCssValue("color"));

        driver.close();
    }

}
