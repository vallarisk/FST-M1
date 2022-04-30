package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestSteps {
    WebDriver driver;
    WebDriverWait wait;
    @Given("^User is on Login page$")
    public void launchLoginForm() throws Throwable{
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
        driver.manage().window().maximize();

    }

    @When("^User enters username and password$")
    public void enterCredentials() throws  Throwable{
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//*[@onclick='signIn()']")).click();
    }

    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void enterCredentialsWithData(String username, String password) throws  Throwable{
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@onclick='signIn()']")).click();
    }

    @Then("^Read the page title and confirmation message$")
    public void getTitleConfirmation() throws Throwable{
        String pageTitle = driver.getTitle();
        String confMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Page title is-->"+pageTitle);
        System.out.println("Confirmation message is-->"+confMessage);

    }

    @And("^Close the Browser$")
    public void closeBrowser() throws Throwable{
        driver.quit();
    }
}
