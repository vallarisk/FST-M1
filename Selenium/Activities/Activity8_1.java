package Activities;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Activity8_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/tables");
        driver.manage().window().maximize();

        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'striped table')]/tbody/tr"));
        System.out.println("Number of rows are- "+ rows.size());


        List<WebElement> cols = driver.findElements(By.xpath(" //table[contains(@class,'striped table')]/tbody/tr[1]/td"));
        System.out.println("Number of cols are- "+ cols.size());


        List<WebElement> thirdRowCellValues = driver.findElements(By.xpath("//table[contains(@class,'striped table')]/tbody/tr[3]/td"));
        System.out.println("Third row cell values are - ");
        for (WebElement cellvalue: thirdRowCellValues) {
            System.out.println(cellvalue.getText());
        }

        WebElement secondRowSecondCol = driver.findElement(By.xpath("//table[contains(@class,'striped table')]/tbody/tr[2]/td[2]"));
        System.out.println("Cell value of Second row and second col is - "+ secondRowSecondCol.getText());

        driver.close();

    }
}
