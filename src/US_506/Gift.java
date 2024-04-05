package US_506;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gift extends BaseDriver {
    @Test
    public void GiftOrderingTest() {
        GiftOrdering_Elements go = new GiftOrdering_Elements();

        Assert.assertTrue(go.tabMenu.get(0).getText().contains("Computers"), "Tab menu did not display");
        go.giftCards.click();
        wait.until(ExpectedConditions.visibilityOf(go.randomGift));
        go.randomGift.click();
        wait.until(ExpectedConditions.visibilityOf(go.recipentName));
        String product = go.product1.getText();

        Tools.ActionHover(go.recipentName);
        go.recipentName.sendKeys("demet");
        go.recipentEmail.sendKeys("ucar@gmail.com");
        go.yourName.sendKeys("ayse");
        go.yourEmail.sendKeys("ayse@gmail.com");
        go.messageBox.sendKeys("Sevgilerle");
        Tools.ActionHover(go.addcartButton);

        go.addcartButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(go.greenShoppingCart));
        go.greenShoppingCart.click();
        wait.until(ExpectedConditions.visibilityOf(go.product2));
        String product3 = go.product2.getText();

        Assert.assertEquals(product3, product, "products are different");


    }
}
