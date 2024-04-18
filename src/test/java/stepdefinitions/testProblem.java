package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

public class testProblem {
    @Given("Go to website gah")
    public void go_to_website_gah() {
        .get("https://gahweni.com/");

    }
    @Then("click on the login button")
    public void click_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
