package US_508;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParameterizedSearch_Elements {
    public ParameterizedSearch_Elements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(linkText = "Adobe Photoshop CS4")
    public WebElement Adobe;
}
