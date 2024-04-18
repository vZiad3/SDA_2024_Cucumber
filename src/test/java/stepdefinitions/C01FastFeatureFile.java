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

public class C01FastFeatureFile {
    WebDriver driver;

    @Given("user goes to goole page")
    public void user_goes_to_goole_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");

    }

    @When("user searches for {string}3")
    public void user_searches_for(String string) {
        driver.findElement(By.name("q")).sendKeys( string+ Keys.ENTER);
    }
    @Then("tests that the page titile contains the word {string}")
    public void tests_that_the_page_titile_contains_the_word(String string) {
        String titleOfSamsung = driver.getTitle();
        System.out.println("titleOfSamsung = " + titleOfSamsung);
        Assert.assertTrue(driver.getTitle().equals(titleOfSamsung));
        Assert.fail();

    }
    @Then("closes the page")
    public void closes_the_page() {
        driver.close();
        driver.quit();
    }

}
