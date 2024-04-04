package US_508;

import US_504.TabMenuControl_Elements;
import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedSearch extends BaseDriver {
    @Test(groups = {"UI Test","Search Test","Smoke Test" ,"Registiration Test"})
    @Parameters("message")
    public void TC508(String searchValue){
        TabMenuControl_Elements element=new TabMenuControl_Elements();
        ParameterizedSearch_Elements elements=new ParameterizedSearch_Elements();

        element.searchBox.sendKeys(searchValue);
        element.searchButton.click();


        wait.until(ExpectedConditions.visibilityOf(elements.Adobe));
        Assert.assertTrue(elements.Adobe.getText().contains("Adobe Photoshop CS4"),"unsuccessful search result");

    }
}
