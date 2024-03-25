package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class HwC03ClickPage {
    WebDriver driver;
    By button = By.id("button00");

    @Given("Go to website")
    public void go_to_website() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
    }

    @Then("click on the button {int} times to see the message")
    public void click_on_the_button_times_to_see_the_message(Integer int1) {
        WebElement buttonField = driver.findElement(button);
        for(int i = 0; i < int1 ; i++ ){
            buttonField.click();
        }

    }

//   for(int i = 0; i <4 ; i++ ){
//       driver.findElement(By.id("button00")).click();
//   }
//   WebElement message = driver.findElement()
//   Assert.assertTrue()
}


//@When("you locate the button")
//public void you_locate_the_button() {
//    WebElement buttonField = driver.findElement(button);
//}