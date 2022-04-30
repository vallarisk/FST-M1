package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity8_2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/tables");
        driver.manage().window().maximize();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']//tbody//tr"));
        System.out.println("Number of rows are- "+ rows.size());


        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
        System.out.println("Number of cols are- "+ cols.size());

        String secondRowSecondColValue1 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText();
        System.out.println("Initial cell value of second row second column is - " + secondRowSecondColValue1);

        System.out.println("Sort the table by Names");
        driver.findElement(By.xpath("//*[@id='sortableTable']//thead//th[1]")).click();

        String secondRowSecondColValue2 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText();
        System.out.println("Cell value of second row second column after sorting is - " + secondRowSecondColValue2);

        List<WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot"));
        System.out.println("Footer cell vlaues are: ");
        for (WebElement footercellValue: footer){
            System.out.println(footercellValue.getText());
        }
        driver.close();

    }
}
