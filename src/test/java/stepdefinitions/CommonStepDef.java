package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class CommonStepDef {
    WebDriver driver;

    @Given("i open the browser")
    public void i_open_the_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Then("i am on the google homepage")
    public void i_am_on_the_google_homepage() {
    driver.get("https://www.google.com");
    }
    @When("i search for amazon on google")
    public void i_search_for_amazon_on_google() {
    driver.findElement(By.name("q")).sendKeys("amazon", Keys.ENTER);
    }
    @Then("I should see amazon on the result")
    public void i_should_see_amazon_on_the_result() {

    //Assert.assertFalse(driver.findElement(By.xpath("//*[contains(text(),'amazon')")));
    }


    @When("i search for {string} on google")                    // dynamic from cucumber
    public void i_search_for_on_google(String string) {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("I should see {string} on the result")
    public void i_should_see_on_the_result(String string) {
    }


}
