package US_501;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Elements {
    public Register_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[@class='ico-register']")
    public WebElement register;

    @FindBy(xpath = "//input[@id='gender-female']")
    public WebElement radioButton;

    @FindBy(xpath = "//input[@id='FirstName']")
    public WebElement firstName;

    @FindBy(css = "input[id='LastName']")
    public WebElement lastName;

    @FindBy(xpath = "//select[contains(@name,'Day')]")
    public WebElement dateOfBirthDay;

    @FindBy(css = "[name*='Month']")
    public WebElement dateOfBirthMonth;

    @FindBy(xpath = "//*[@name='DateOfBirthYear']")
    public WebElement dateOfBirthYear;

    @FindBy(css = "[id='Email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='Company']")
    public WebElement companyName;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    public WebElement confirmPassword;

    @FindBy(css = "[id='register-button']")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@class='result']")
    public WebElement resultText;

    @FindBy(xpath = "//a[@class='button-1 register-continue-button']")
    public WebElement registerContinueButton;


}
