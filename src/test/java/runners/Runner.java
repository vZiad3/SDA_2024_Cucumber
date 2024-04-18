package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepdefinitions",                   // the directory, we want to use
        features = "src/test/resources/features/testProblem.feature",        // the path of the feature we want to run
        plugin = {                          // for the report
                "html:cucumber-reports/html/report.html",
                "json:cucumber-reports/json/report.json"
                ,"pretty"                                       // this will change the look when there's errors
                ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        //tags = "@hw2",
        dryRun = false
)
public class Runner {

}
