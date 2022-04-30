package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_3 {

        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.training-support.net/selenium/target-practice");
            driver.manage().window().maximize();
            System.out.println("Page titel is "+driver.getTitle());

            String thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
            System.out.println("Third header text is: " + thirdHeader);

            //Find the fifth header and get it's colour
            String fifthHeaderColour = driver.findElement(By.xpath("//h5")).getCssValue("color");
            System.out.println("Fith header's colour is: " + fifthHeaderColour);

            //Find the violet button and print it's classes
            String violetButtonClasses = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
            System.out.println("Violet button's classes are: " + violetButtonClasses);

            //Find the grey button with Absolute XPath
            String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
            System.out.println("The grey button's text is: " + greyButton);

            //Close the browser
            driver.close();

        }

}
