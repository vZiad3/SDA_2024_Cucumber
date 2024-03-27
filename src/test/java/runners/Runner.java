package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepdefinitions",                   // the directory, we want to use
        features = "src/test/resources/features/hws.feature",        // the path of the feature we want to run
        plugin = {                          // for the report
                "html:cucumber-reports/html/report.html",
                "json:cucumber-reports/json/report.json"
        },
        //tags = "@hw2",
        dryRun = false
)
public class Runner {




}
