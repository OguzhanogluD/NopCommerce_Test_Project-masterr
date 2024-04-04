package US_507;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ComputerOrder extends BaseDriver {


    @Test(groups = {"UI Test", "TABMenu Test", "Order Test"})
    public void TC_507() {

        ComputerOrder_Elements coe = new ComputerOrder_Elements();

        Assert.assertTrue(coe.tabMenu.get(0).getText().contains("Computers"), "Tab menu did not display");
        Assert.assertTrue(coe.tabMenu.get(1).getText().trim().equals("Electronics"), "Tab menu did not display");
        Assert.assertEquals(coe.tabMenu.get(2).getText().trim(), "Apparel", "Tab menu did not display");
        Tools.ActionHover(coe.computers);
        Assert.assertTrue(coe.computersSubList.get(0).getText().trim().equals("Desktops"), "Desktops did not display");
        coe.computersSubList.get(0).click();
        wait.until(ExpectedConditions.urlContains("desktops"));
        Assert.assertTrue(coe.productList.get(0).getText().contains("Build"), "Desktop did not display");
        coe.productList.get(0).click();
        wait.until(ExpectedConditions.urlContains("build-your-own-computer"));

        int random = Tools.randomGenerator(coe.ramChoice.size());
        coe.ramChoice.get(random).click();

        int random1 = Tools.randomGenerator(coe.harddiscChoice.size());
        Tools.JavaScriptClick(coe.harddiscChoice.get(random1));

        wait.until(ExpectedConditions.elementToBeClickable(coe.addCart));
        Tools.JavaScriptClick(coe.addCart);

        coe.greenAddCart.click();

        wait.until(ExpectedConditions.visibilityOf(coe.priceValue2));
       // Assert.assertEquals(coe.priceValue1.getText(), coe.priceValue2.getText(), "The price is not same.");
        //String price1="";


    }
}