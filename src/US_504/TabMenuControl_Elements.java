package US_504;

public class TabMenuControl_Elements {
      public TabMenuControl_Elements(){
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(linkText = "Register")
    public WebElement registerButton;
    @FindBy(linkText = "Log in")
    public WebElement loginButton;
    @FindBy(linkText = "My account")
    public WebElement myAccount;
    @FindBy(id = "gender-male")
    public WebElement genderMale;
    @FindBy(id = "FirstName")
    public WebElement firstName;
    @FindBy(id = "LastName")
    public WebElement lastName;
    @FindBy(name = "DateOfBirthDay")
    public WebElement dateOfBirthDay;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement dateOfBirthMonth;
    @FindBy(name = "DateOfBirthYear")
    public WebElement dateOfBirthYear;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(id = "ConfirmPassword")
    public WebElement passwordConfirm;
    @FindBy(id = "register-button")
    public WebElement registerSubmitButton;
    @FindBy(xpath = "//div[@class='result']")
    public WebElement registerConfirmText;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']/ul/li")
    public WebElement registerNotConfirmText;
    @FindBy(linkText = "Log out")
    public WebElement logout;
    @FindBy(xpath = "//button[@class='button-1 login-button']")
    public WebElement loginSubmitButton;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    public WebElement loginNotConfirmText;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li")
    public List<WebElement> tabMenus;
    @FindBy(xpath = "(//ul[@class='sublist first-level']/li)[position()<=3]/a")
    public List<WebElement> subTabMenusComputers;
    @FindBy(xpath = "(//ul[@class='sublist first-level']/li)[position()>3 and position()<=6]/a")
    public List<WebElement> subTabMenusElectronics;
    @FindBy(xpath = "(//ul[@class='sublist first-level']/li)[position()>6 and position()<=9]/a")
    public List<WebElement> subTabMenusApparel;
    @FindBy(linkText = "Computers")
    public WebElement computers;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/ul/li/a")
    public WebElement desktops;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/ul/li[2]/a")
    public WebElement notebooks;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/ul/li[3]/a")
    public WebElement software;
    @FindBy(linkText = "Electronics")
    public WebElement electronics;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]/ul/li/a")
    public WebElement camera;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]/ul/li[2]/a")
    public WebElement cellPhone;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]/ul/li[3]/a")
    public WebElement others;
    @FindBy(linkText = "Apparel")
    public WebElement apparel;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/ul/li/a")
    public WebElement shoes;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/ul/li[2]/a")
    public WebElement clothing;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/ul/li[3]/a")
    public WebElement accessories;
    @FindBy(linkText = "Digital downloads")
    public WebElement downloads;
    @FindBy(linkText = "Books")
    public WebElement books;
    @FindBy(linkText = "Jewelry")
    public WebElement jewelry;
    @FindBy(linkText = "Gift Cards")
    public WebElement giftCards;
    @FindBy(xpath = "//div[@class='page-title']")
    public WebElement title;
    @FindBy(xpath = "//h2[@class='product-title']/a")
    public List<WebElement> items;
    @FindBy(id="small-searchterms")
    public WebElement searchBox;
    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchButton;
}
