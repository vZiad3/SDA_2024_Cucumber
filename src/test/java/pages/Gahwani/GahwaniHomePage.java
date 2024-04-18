package pages.Gahwani;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GahwaniHomePage {

    public GahwaniHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='text-gray-800 dark:text-gray-200']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[contains(text(),' التسجيل ')][1]")
    public WebElement rejesterButton;
    @FindBy(xpath = "//*[contains(text(),' Register ')][1]")
    public WebElement rejesterButtonEnglish;}
