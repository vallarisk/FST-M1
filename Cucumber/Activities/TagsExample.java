package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDefinitions_example.BaseClass;

public class TagsExample extends BaseClass {
//    @Before
//    public void beforeScenario(){System.out.println("This will run before all scenarios");}

    @Before("@first")
    public void beforeFirstScenario(){System.out.println("This will run before first scenario");}

    @Given("^User opens a page$")
    public void userOpensPage(){
        System.out.println("Page is opened");
    }

    @When("^User performs an action$")
    public void userPerformsAction(){
        System.out.println("Action is performed");
    }

    @Then("^Do action for first scenario$")
    public void firstScenarioAction(){
        System.out.println("First scenario is completed");
    }

    @Then("^Do action for second scenario$")
    public void secondScenarioAction(){
        System.out.println("Second scenario is completed");
    }

    @Then("^Do action for third scenario$")
    public void thirdScenarioAction(){
        System.out.println("Third scenario is completed");
    }

    @Then("^Do action for fourth scenario$")
    public void fourthScenarioAction(){
        System.out.println("Fourth scenario is completed");
    }

    @After("@first")
    public void afterFirstScenario(){ System.out.println("This will run after first scenario");}

//    @After
//    public void afterScenario(){System.out.println("Closing Down");}
//

}
