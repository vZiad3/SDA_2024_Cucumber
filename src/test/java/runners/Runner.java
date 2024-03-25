package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepdefinitions",                   // the directory, we want to use
        features = "src/test/resources/features",        // the path of the directory we want to run
        tags = "@samsung",
        dryRun = true
)
public class Runner {




}
