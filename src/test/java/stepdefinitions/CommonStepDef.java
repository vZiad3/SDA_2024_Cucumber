package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CommonStepDef {

    @Given("print something")
    public void print_something() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
    }
    @Then("Assert it")
    public void assert_it() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(true);
    }

}
