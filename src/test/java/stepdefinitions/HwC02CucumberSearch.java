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

public class HwC02CucumberSearch {
    WebDriver driver;

    @Given("user goes to goole page")
    public void user_goes_to_goole_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");

    }

    @When("user searches for {string}")
    public void user_searches_for_cucumber(String string) {
        driver.findElement(By.name("q")).sendKeys( string+ Keys.ENTER);

    }
    @Then("tests that the page title contains the word cucumber")
    public void tests_that_the_page_title_contains_the_word_cucumber() {
        String titleOfSamsung = driver.getTitle();
        System.out.println("titleOfCucumber = " + titleOfSamsung);
        Assert.assertTrue(driver.getTitle().equals(titleOfSamsung));
    }
    @Then("closes the page")
    public void closes_the_page() {
        driver.close();
        driver.quit();
    }

}
