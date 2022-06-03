package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        driver.manage().window().maximize();

        WebElement dropdown = driver.findElement(By.xpath("//*[@id='multi-select']"));
        Select select = new Select(dropdown);
        WebElement selectedValue = driver.findElement(By.xpath("//*[@id='multi-value']"));

        if(select.isMultiple()) {

            //Select 'JavaScript' by Visible text
            select.selectByVisibleText("Javascript");
            System.out.println(selectedValue.getText());

            //Select 'NodeJS' by value
            select.selectByValue("node");
            System.out.println(selectedValue.getText());

            //Select 4,5, and 6 options by index
            for(int i=4; i<=6; i++) {
                select.selectByIndex(i);
                }
            System.out.println(selectedValue.getText());

            //Deselect 'NodeJS' by value
            select.deselectByValue("node");
            System.out.println(selectedValue.getText());

            //Deselect 7th opttion by index
            select.deselectByIndex(7);
            System.out.println(selectedValue.getText());

            //Get all selected options
            List<WebElement> selectedOptions = select.getAllSelectedOptions();
            //Print all selected options
            for(WebElement selectedOption : selectedOptions) {
            System.out.println("Selected option: " + selectedOption.getText());
            }

            //Deselect all options
            select.deselectAll();
            System.out.println(selectedValue.getText());
        }
    driver.close();
    }
}


