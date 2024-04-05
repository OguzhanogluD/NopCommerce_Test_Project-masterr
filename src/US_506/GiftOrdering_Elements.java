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


    @FindBy(xpath = "//a[text()='$25 Virtual Gift Card']")
    public WebElement randomGift;

    @FindBy(xpath = "//input[@id='giftcard_43_RecipientName']")
    public WebElement recipentName;

    @FindBy(xpath = "//*[text()='Enter valid sender email']")
    public WebElement invalidTyping;

    @FindBy(xpath = "//input[@id='giftcard_43_RecipientEmail']")
    public WebElement recipentEmail;

    @FindBy(xpath = "//input[@id='giftcard_43_SenderName']")
    public WebElement yourName;

    @FindBy(xpath = "//input[@id='giftcard_43_SenderEmail']")
    public WebElement yourEmail;

    @FindBy(xpath = "//textarea[@id='giftcard_43_Message']")
    public WebElement messageBox;

    @FindBy(xpath = "//button[@id='add-to-cart-button-43']")
    public WebElement addcartButton;


    @FindBy(xpath = "//div[@class='bar-notification success']/p")
    public WebElement assertShoppingCart;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a")
    public List<WebElement> tabMenu;

    @FindBy(xpath = "//p[@class='content']/a")
    public WebElement greenShoppingCart;


    @FindBy(xpath = "//div[@class='product-name']/h1")
    public WebElement product1;

    @FindBy(xpath = "//a[@class='product-name']")
    public WebElement product2;

}
