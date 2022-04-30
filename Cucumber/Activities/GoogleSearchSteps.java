package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearchSteps {
    WebDriver driver;

    @Given("^User is on Google Home Page$")
    public void launchGoogle() throws Throwable {
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    @When("^User types in Cheese and hit ENTER$")
    public void searchCheese() throws Throwable {
        driver.findElement(By.name("q")).sendKeys("Cheese",Keys.ENTER);
    }

    @Then("^Show how many search results were shown$")
    public void verifyResults() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));
        System.out.println("Search Results are - " + driver.findElement(By.id("result-stats")).getText());
    }

    @And("^Close the browser$")
    public void closeBrowser() throws Throwable{
        driver.quit();
    }
}
