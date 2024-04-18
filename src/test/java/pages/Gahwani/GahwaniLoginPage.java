package pages.Gahwani;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class GahwaniLoginPage {
    public GahwaniLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "password")
    public WebElement password;

@FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//*[@class='h-24 w-auto']")
    public WebElement iconOnThePage;




}
