package US_504;

import Utility.BaseDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static Utility.BaseDriver.driver;

public class TabMenuControl extends BaseDriver {
  @Test
    public void TC504(){  // TabMenu
        TabMenuControl_Elements elements = new TabMenuControl_Elements();

        Actions actions = new Actions(driver);

        List<String> menuElements = Arrays.asList("Computers","Electronics","Apparel","Digital downloads",
                "Books","Jewelry","Gift Cards");

        for (int i = 0; i < menuElements.size(); i++)
            Assert.assertTrue(elements.tabMenus.get(i).getText().equals(menuElements.get(i)));

        Action action = actions.moveToElement(elements.computers).build();
        action.perform();
        actions.moveToElement(elements.desktops).click().build().perform();
        Assert.assertTrue(elements.title.getText().equals("Desktops"));
        action.perform();
        actions.moveToElement(elements.notebooks).click().build().perform();
        Assert.assertTrue(elements.title.getText().equals("Notebooks"));
        action.perform();
        actions.moveToElement(elements.software).click().build().perform();
        Assert.assertTrue(elements.title.getText().equals("Software"));

        action = actions.moveToElement(elements.electronics).build();
        action.perform();
        actions.moveToElement(elements.camera).click().build().perform();
        Assert.assertTrue(elements.title.getText().equals("Camera & photo"));
        action.perform();
        actions.moveToElement(elements.cellPhone).click().build().perform();
        Assert.assertTrue(elements.title.getText().equals("Cell phones"));
        action.perform();
        actions.moveToElement(elements.others).click().build().perform();
        Assert.assertTrue(elements.title.getText().equals("Others"));

        action = actions.moveToElement(elements.apparel).build();
        action.perform();
        actions.moveToElement(elements.shoes).click().build().perform();
        Assert.assertTrue(elements.title.getText().equals("Shoes"));
        action.perform();
        actions.moveToElement(elements.clothing).click().build().perform();
        Assert.assertTrue(elements.title.getText().equals("Clothing"));
        action.perform();
        actions.moveToElement(elements.accessories).click().build().perform();
        Assert.assertTrue(elements.title.getText().equals("Accessories"));

        actions.moveToElement(elements.downloads).click().build().perform();
        Assert.assertTrue(elements.title.getText().equals("Digital downloads"));

        actions.moveToElement(elements.books).click().build().perform();
        Assert.assertTrue(elements.title.getText().equals("Books"));

        actions.moveToElement(elements.jewelry).click().build().perform();
        Assert.assertTrue(elements.title.getText().equals("Jewelry"));

        actions.moveToElement(elements.giftCards).click().build().perform();
        Assert.assertTrue(elements.title.getText().equals("Gift Cards"));
    }
}
