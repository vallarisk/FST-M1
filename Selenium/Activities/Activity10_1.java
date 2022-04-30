package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class Activity10_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        driver.manage().window().maximize();
        WebElement cube = driver.findElement(By.xpath("//*[@id='wrapD3Cube']"));
        Actions action = new Actions(driver);

        action.click(cube);
        WebElement cubeVal = driver.findElement(By.className("active"));
        System.out.println("Left click value :"+cubeVal.getText());

        action.doubleClick(cube).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Double click value :"+cubeVal.getText());

        action.contextClick(cube).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Right click value :" + cubeVal.getText());

        driver.close();


    }
}
