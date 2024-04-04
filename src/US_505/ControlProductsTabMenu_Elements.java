package US_505;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ControlProductsTabMenu_Elements {
    public ControlProductsTabMenu_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a")
    public List<WebElement> tabMenuList;

    @FindBy(xpath = "(//ul[@class='sublist first-level'])[1]//a")
    public List<WebElement> computersList;

    @FindBy(xpath = "(//ul[@class='sublist first-level'])[2]//a")
    public List<WebElement> electronicsList;

    @FindBy(xpath = "(//ul[@class='sublist first-level'])[3]//a")
    public List<WebElement> apparelList;

    @FindBy(xpath = "//input[@id='small-searchterms']")
    public WebElement searchInput;

    @FindBy(xpath = "//button[@class='button-1 search-box-button']")
    public WebElement searchButton;

    @FindBy(xpath = "(//a[text()='Computers '])[1]")
    public WebElement computersTab;

    @FindBy(xpath = "(//a[text()='Notebooks '])[1]")
    public WebElement noteBooksTab;

    @FindBy(xpath = "(//a[text()='Desktops '])[1]")
    public WebElement deskTopsTab;

    @FindBy(xpath = "(//a[text()='Software '])[1]")
    public WebElement softwareTab;

    @FindBy(xpath = "(//a[text()='Electronics '])[1]")
    public WebElement electonicsTab;

    @FindBy(xpath = "(//a[text()='Camera & photo '])[1]")
    public WebElement cameraAndPhotoTab;

    @FindBy(xpath = "(//a[text()='Cell phones '])[1]")
    public WebElement cellPhonesTab;

    @FindBy(xpath = "(//a[text()='Others '])[1]")
    public WebElement othersTab;


    @FindBy(xpath = "(//a[text()='Apparel '])[1]")
    public WebElement apparelTab;

    @FindBy(xpath = "(//a[text()='Shoes '])[1]")
    public WebElement shoesTab;

    @FindBy(xpath = "(//a[text()='Clothing '])[1]")
    public WebElement clothingTab;

    @FindBy(xpath = "(//a[text()='Accessories '])[1]")
    public WebElement accessoriesTab;

    @FindBy(xpath = "(//a[text()='Digital downloads '])[1]")
    public WebElement digitalDownloadsTab;

    @FindBy(xpath = "(//a[text()='Books '])[1]")
    public WebElement booksTab;

    @FindBy(xpath = "(//a[text()='Jewelry '])[1]")
    public WebElement jewelryTab;

    @FindBy(xpath = "(//a[text()='Gift Cards '])[1]")
    public WebElement giftCardsTab;

    @FindBy(xpath = "//a[@class='viewmode-icon grid']")
    public WebElement viewMode1;

    @FindBy(xpath = "(//div[@class='product-viewmode']/a)[2]")
    public WebElement viewMode2;

    @FindBy(xpath = "//h2[@class='product-title']/a")
    public List<WebElement> productTitleList;

    @FindBy(xpath = "//h2[@class='product-title']/a")
    public WebElement soughtAfterProduct;

}
