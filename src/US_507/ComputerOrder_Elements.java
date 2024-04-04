package US_507;

import org.openqa.selenium.WebElement;
import Utility.BaseDriver;
import org.openqa.selenium.support.*;

import java.util.List;

public class ComputerOrder_Elements {
    public ComputerOrder_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "[class^='sender-name']")
    public WebElement yourName;

    @FindBy(css = ".sender-email")
    public WebElement yourEmail;

    @FindBy(xpath = "//div[@class='header-links']/ul/li[1]/a")
    public WebElement myAccount;

    @FindBy(id = "small-searchterms")
    public WebElement searchBox;

    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='product-item']/div[2]/h2/a")
    public WebElement productTitle;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a")
    public List<WebElement> tabMenu;

    // public WebElement ortakTab;

    @FindBy(css = "[class='top-menu notmobile'] [href='/computers']")
    //(//ul[@class='top-menu notmobile']/li/a)[1]  diger yöntem xpath
    public WebElement computers;

    @FindBy(css = "[class='title'] [href='/desktops']")
    public WebElement desktops;

    @FindBy(css = "[class='product-item'][data-productid='1']")
    public WebElement buildOwnComputer;

    //  @FindBy(id = "product_attribute_2")
    // public WebElement ramChoice;

    @FindBy(xpath = "//select[@id='product_attribute_2']/option[@data-attr-value]")
    public List<WebElement> ramChoice;

    @FindBy(css = "[id*='product_attribute_3_']")
    public List<WebElement> harddiscChoice;

    @FindBy(css = "[class='bar-notification success']")
    public WebElement addToCartWarning;

    @FindBy(css = "[class='product-viewmode'] a:nth-child(3)")
    public WebElement viewMode;

    @FindBy(xpath = "(//ul[@class='sublist first-level'])[1]//a")
    public List<WebElement> computersSubList;


    @FindBy(css = "[class='product-title'] a")
    public List<WebElement> productList;

    @FindBy(id = "add-to-cart-button-1")
    public WebElement addCart;

    @FindBy(xpath = "//li[@id='topcartlink']/a")
    public WebElement gotoCart;

    @FindBy(xpath = "//p[@class='content']/a")
    public WebElement greenAddCart;

    @FindBy(xpath ="//span[@id='price-value-1']" )
    public WebElement priceValue1;
//id = "price-value-1"
    @FindBy(xpath = "//span[@class='product-unit-price']")
    public WebElement priceValue2;


}
