package US_506;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GiftOrdering_Elements {
    public GiftOrdering_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//*[text()='Gift Cards ']")
    public WebElement giftCards;


    @FindBy(linkText = "//a[text()='$25 Virtual Gift Card']")
    public WebElement randomGift;

    @FindBy(className = "[class='recipient-name valid']")
    public WebElement recipentName;

    @FindBy(xpath = "//*[text()='Enter valid sender email']")
    public WebElement invalidTyping;

    @FindBy(className = "[class='recipient-email valid']")
    public WebElement recipentEmail;

    @FindBy(className = "[class='sender-name']")
    public  WebElement yourName;

    @FindBy(className = "[class='sender-email']")
    public WebElement yourEmail;

    @FindBy(className = "[class='message']")
    public WebElement messageBox;

    @FindBy(id = "[id='add-to-cart-button-43']")
    public WebElement addcartButton;


    @FindBy(xpath = "//div[@class='bar-notification success']/p")
    public WebElement assertShoppingCart;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a")
    public List<WebElement> tabMenu;

    @FindBy(xpath = "//*[text()='The product has been added to your ']")
    public WebElement lastAssertion;






}
