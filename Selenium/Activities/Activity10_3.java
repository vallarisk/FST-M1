package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Activity10_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/drag-drop");
        driver.manage().window().maximize();

        System.out.println("Page title is" + driver.getTitle() );

        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement dropZone1 = driver.findElement(By.id("droppable"));
        WebElement dropZone2 = driver.findElement(By.id("dropzone2"));
        Actions action = new Actions(driver);
        action.clickAndHold(ball).dragAndDrop(ball, dropZone1).build().perform();

        String dropZone1Color = dropZone1.getCssValue("background-color");
        Assert.assertEquals(dropZone1Color, "rgba(33, 186, 69, 1)");

        action.clickAndHold(ball).dragAndDrop(ball, dropZone2).build().perform();
        String dropZone2color = dropZone2.getCssValue("background-color");
        Assert.assertEquals(dropZone2color, "rgba(33, 186, 69, 1)");
        driver.close();
    }
}
