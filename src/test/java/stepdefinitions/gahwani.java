package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.Gahwani.GahwaniHomePage;
import pages.Gahwani.GahwaniLoginPage;
import utilities.Driver;

public class gahwani {
    GahwaniHomePage gahwaniHomePage = new GahwaniHomePage();
    GahwaniLoginPage gahwaniLoginPage = new GahwaniLoginPage();

    @Given("i open the browser121")
    public void i_open_the_browser121() {
        Driver.getDriver().get("https://gahweni.com/");
    }
    @When("i click on the login button")
    public void i_click_on_the_login_button() {

        gahwaniHomePage.loginButton.click();
    }
    @Then("i should see the login page")
    public void i_should_see_the_login_page() {
       Assert.assertTrue(gahwaniLoginPage.iconOnThePage.isDisplayed());
    }
    @Then("i entered valid credentials")
    public void i_entered_valid_credentials() {

    }
    @Then("i am on my account page")
    public void i_am_on_my_account_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("i close the browser")
    public void i_close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
