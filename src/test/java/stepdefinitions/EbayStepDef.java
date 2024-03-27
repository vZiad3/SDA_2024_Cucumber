package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class EbayStepDef {

//    You can implement these steps using the snippet(s) below:
    WebDriver driver;
    @Given("the user navigates to the Ebay homepage")
    public void the_user_navigates_to_the_ebay_homepage() {
        Driver.getDriver().get("https://www.ebay.com");

    }
    @When("the user searches for {string}")
    public void the_user_searches_for(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user verifies that the search results contain {string}")
    public void the_user_verifies_that_the_search_results_contain(String string) {
        //List<WebElement> searchResults = Driver.getDriver().findElements(B)
    }
    @Then("I close the browser")
    public void i_close_the_browser() {
    Driver.getDriver().close();
    }
}
