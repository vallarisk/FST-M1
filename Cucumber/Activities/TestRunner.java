package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},
        tags = "@activity1 or @activity2 or @activity3 or @activity4 or @activity5",
        plugin = {"pretty", "html: test-reports"},
        monochrome = true
)

public class TestRunner {
    //Nothing is written here
}