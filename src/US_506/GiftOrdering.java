package US_506;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftOrdering extends BaseDriver {
    @Test
    public void giftOrdering (){
        GiftOrdering_Elements go=new GiftOrdering_Elements();

        //TAB menuyu gorme
        Assert.assertTrue(go.tabMenu.get(0).getText().contains("Computers"), "Tab menu did not display");
        //Tab menuden hediyeler secenegine tiklama
        go.giftCards.click();
        //random giftse click yapma
        wait.until(ExpectedConditions.visibilityOf(go.randomGift));
        go.randomGift.click();

        //Zorunlu alan doldurmadiginda hata mesaji alma
        go.recipentName.sendKeys(" ");
        go.recipentEmail.sendKeys("ucar@gmail.com");
        go.yourName.sendKeys("ayse");
        go.yourEmail.sendKeys("ayse@gmail.com");
        go.messageBox.sendKeys("Sevgilerle");
        Assert.assertTrue(go.assertShoppingCart.isDisplayed());


        /*Acilan sayfada recipent name sender name ve mesaj alanlarini doldurmaliyim
        go.recipentName.sendKeys("demet");
        go.recipentEmail.sendKeys("ucar@gmail.com");
        go.yourName.sendKeys("ayse");
        go.yourEmail.sendKeys("ayse@gmail.com");
        go.messageBox.sendKeys("Sevgilerle");*/

        //add to cart a click yapma
        go.addcartButton.click();
        //last assertion
        Assert.assertTrue(go.lastAssertion.isDisplayed());





    }
}
