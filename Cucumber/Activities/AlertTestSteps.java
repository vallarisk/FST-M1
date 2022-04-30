package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTestSteps {

    WebDriver driver = new FirefoxDriver();
    Alert alert;

    @Given("^User is on the page$")
    public void launchAlertPage(){
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        driver.manage().window().maximize();
    }

    @When("^User clicks the Simple Alert button$")
    public void simpleAlert(){
        driver.findElement(By.id("simple")).click();
    }

    @When("^User clicks the Confirm Alert button$")
    public void confirmAlert(){
        driver.findElement(By.id("confirm")).click();
    }

    @When("^User clicks the Prompt Alert button$")
    public void promptAlert(){
        driver.findElement(By.id("prompt")).click();
    }

    @Then("^Alert opens$")
    public void switchToAlert(){
        alert = driver.switchTo().alert();
    }

    @And("^Read the text from it and print it$")
    public void readTextFromAlert(){
        alert = driver.switchTo().alert();
        System.out.println("alert text is "+ alert.getText());
    }

    @And("^Close the alert$")
    public void closeAlert(){
        alert = driver.switchTo().alert();
        alert.accept();
    }

    @And("^Close the alert with Cancel$")
    public void closeAlertWithCancel(){
        alert = driver.switchTo().alert();
        alert.dismiss();
    }

    @And("^Write a custom message in it$")
    public void write(){
        alert = driver.switchTo().alert();
        alert.sendKeys("This is custom message on Prompt Alert");
    }


    @And("^Close Browser")
    public void closeBrowser(){
        driver.quit();
    }
}
