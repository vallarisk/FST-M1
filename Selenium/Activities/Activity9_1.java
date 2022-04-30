package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class Activity9_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://training-support.net/selenium/selects");
        driver.manage().window().maximize();

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-select']"));
        Select select = new Select(dropdown);
        WebElement chosen = driver.findElement(By.xpath("//*[@id='single-value']"));
        select.selectByVisibleText("Option 2");
        System.out.println(chosen.getText());
        select.selectByIndex(3);
        System.out.println(chosen.getText());
        select.selectByValue("4");
        System.out.println(chosen.getText());

        List<WebElement> options = driver.findElements(By.xpath("//select[@id='single-select']/option"));
        for(WebElement option : options){
            System.out.println(option.getText());
        }

        driver.close();

    }
}
