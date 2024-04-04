package US_505;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class ControlProductsTabMenu extends BaseDriver {


    @Test
    @Parameters("mesaj")
    public void ControlProductsTabMenuTest(String gelenMesaj) {
        ControlProductsTabMenu_Elements cptme = new ControlProductsTabMenu_Elements();

        List<List<String>> productNames = new ArrayList<>();

        Tools.ActionHover(cptme.computersTab);
        cptme.noteBooksTab.click();

        wait.until(ExpectedConditions.visibilityOfAllElements(cptme.productTitleList));
        cptme.viewMode2.click();

        List<WebElement> row1 = new ArrayList<>();
        for (int i = 0; i < cptme.productTitleList.size(); i++) {
            row1.add(cptme.productTitleList.get(i));
        }

        List<String> strList1 = new ArrayList<>();
        for (int i = 0; i < row1.size(); i++) {
            WebElement element = row1.get(i);
            strList1.add(element.getText());
        }

        Tools.JavaScriptClick(cptme.computersTab);
        Tools.ActionHover(cptme.computersTab);
        cptme.deskTopsTab.click();

        wait.until(ExpectedConditions.visibilityOfAllElements(cptme.productTitleList));
        cptme.viewMode2.click();

        List<WebElement> row2 = new ArrayList<>();
        for (int i = 0; i < cptme.productTitleList.size(); i++) {
            row2.add(cptme.productTitleList.get(i));
        }

        List<String> strList2 = new ArrayList<>();
        for (int i = 0; i < row2.size(); i++) {
            WebElement element = row2.get(i);
            strList2.add(element.getText());
        }

        Tools.JavaScriptClick(cptme.computersTab);
        Tools.ActionHover(cptme.computersTab);
        cptme.softwareTab.click();

        wait.until(ExpectedConditions.visibilityOfAllElements(cptme.productTitleList));
        cptme.viewMode2.click();

        List<WebElement> row3 = new ArrayList<>();
        for (int i = 0; i < cptme.productTitleList.size(); i++) {
            row3.add(cptme.productTitleList.get(i));
        }

        List<String> strList3 = new ArrayList<>();
        for (int i = 0; i < row3.size(); i++) {
            WebElement element = row3.get(i);
            strList3.add(element.getText());
        }

        Tools.JavaScriptClick(cptme.electonicsTab);
        Tools.ActionHover(cptme.electonicsTab);
        cptme.cameraAndPhotoTab.click();

        wait.until(ExpectedConditions.visibilityOfAllElements(cptme.productTitleList));
        cptme.viewMode2.click();

        List<WebElement> row4 = new ArrayList<>();
        for (int i = 0; i < cptme.productTitleList.size(); i++) {
            row4.add(cptme.productTitleList.get(i));
        }

        List<String> strList4 = new ArrayList<>();
        for (int i = 0; i < row4.size(); i++) {
            WebElement element = row4.get(i);
            strList4.add(element.getText());
        }

        Tools.JavaScriptClick(cptme.electonicsTab);
        Tools.ActionHover(cptme.electonicsTab);
        cptme.cellPhonesTab.click();

        wait.until(ExpectedConditions.visibilityOfAllElements(cptme.productTitleList));
        cptme.viewMode2.click();

        List<WebElement> row5 = new ArrayList<>();
        for (int i = 0; i < cptme.productTitleList.size(); i++) {
            row5.add(cptme.productTitleList.get(i));
        }

        List<String> strList5 = new ArrayList<>();
        for (int i = 0; i < row5.size(); i++) {
            WebElement element = row5.get(i);
            strList5.add(element.getText());
        }

        Tools.JavaScriptClick(cptme.electonicsTab);
        Tools.ActionHover(cptme.electonicsTab);
        cptme.othersTab.click();

        List<WebElement> row6 = new ArrayList<>();
        for (int i = 0; i < cptme.productTitleList.size(); i++) {
            row6.add(cptme.productTitleList.get(i));
        }

        List<String> strList6 = new ArrayList<>();
        for (int i = 0; i < row6.size(); i++) {
            WebElement element = row6.get(i);
            strList6.add(element.getText());
        }

        Tools.JavaScriptClick(cptme.apparelTab);
        Tools.ActionHover(cptme.apparelTab);
        cptme.shoesTab.click();

        List<WebElement> row7 = new ArrayList<>();
        for (int i = 0; i < cptme.productTitleList.size(); i++) {
            row7.add(cptme.productTitleList.get(i));
        }

        List<String> strList7 = new ArrayList<>();
        for (int i = 0; i < row7.size(); i++) {
            WebElement element = row7.get(i);
            strList7.add(element.getText());
        }

        Tools.JavaScriptClick(cptme.apparelTab);
        Tools.ActionHover(cptme.apparelTab);
        cptme.clothingTab.click();

        List<WebElement> row8 = new ArrayList<>();
        for (int i = 0; i < cptme.productTitleList.size(); i++) {
            row8.add(cptme.productTitleList.get(i));
        }

        List<String> strList8 = new ArrayList<>();
        for (int i = 0; i < row8.size(); i++) {
            WebElement element = row8.get(i);
            strList8.add(element.getText());
        }

        Tools.JavaScriptClick(cptme.apparelTab);
        Tools.ActionHover(cptme.apparelTab);
        cptme.accessoriesTab.click();

        List<WebElement> row9 = new ArrayList<>();
        for (int i = 0; i < cptme.productTitleList.size(); i++) {
            row9.add(cptme.productTitleList.get(i));
        }

        List<String> strList9 = new ArrayList<>();
        for (int i = 0; i < row9.size(); i++) {
            WebElement element = row9.get(i);
            strList9.add(element.getText());
        }

        Tools.JavaScriptClick(cptme.digitalDownloadsTab);

        List<WebElement> row10 = new ArrayList<>();
        for (int i = 0; i < cptme.productTitleList.size(); i++) {
            row10.add(cptme.productTitleList.get(i));
        }

        List<String> strList10 = new ArrayList<>();
        for (int i = 0; i < row10.size(); i++) {
            WebElement element = row10.get(i);
            strList10.add(element.getText());
        }

        Tools.JavaScriptClick(cptme.booksTab);

        List<WebElement> row11 = new ArrayList<>();
        for (int i = 0; i < cptme.productTitleList.size(); i++) {
            row11.add(cptme.productTitleList.get(i));
        }

        List<String> strList11 = new ArrayList<>();
        for (int i = 0; i < row11.size(); i++) {
            WebElement element = row11.get(i);
            strList11.add(element.getText());
        }

        Tools.JavaScriptClick(cptme.jewelryTab);

        List<WebElement> row12 = new ArrayList<>();
        for (int i = 0; i < cptme.productTitleList.size(); i++) {
            row12.add(cptme.productTitleList.get(i));
        }

        List<String> strList12 = new ArrayList<>();
        for (int i = 0; i < row12.size(); i++) {
            WebElement element = row12.get(i);
            strList12.add(element.getText());
        }

        Tools.JavaScriptClick(cptme.giftCardsTab);

        List<WebElement> row13 = new ArrayList<>();
        for (int i = 0; i < cptme.productTitleList.size(); i++) {
            row13.add(cptme.productTitleList.get(i));
        }

        List<String> strList13 = new ArrayList<>();
        for (int i = 0; i < row13.size(); i++) {
            WebElement element = row13.get(i);
            strList13.add(element.getText());
        }

        productNames.add(strList1);
        productNames.add(strList2);
        productNames.add(strList3);
        productNames.add(strList4);
        productNames.add(strList5);
        productNames.add(strList6);
        productNames.add(strList7);
        productNames.add(strList8);
        productNames.add(strList9);
        productNames.add(strList10);
        productNames.add(strList11);
        productNames.add(strList12);
        productNames.add(strList13);

        for (int i = 0; i < productNames.size(); i++) {
            for (int j = 0; j < productNames.get(i).size(); j++) {
                System.out.println(productNames.get(i).get(j).toString());
            }
        }

        cptme.searchInput.sendKeys(gelenMesaj);
        cptme.searchButton.click();

        wait.until(ExpectedConditions.visibilityOf(cptme.soughtAfterProduct));
        Tools.ActionHover(cptme.soughtAfterProduct);
        String productName = cptme.soughtAfterProduct.getText();

        Assert.assertEquals(productName, gelenMesaj, "The product sent is not the same as the products formed");

        boolean foundIn = false;
        for (int i = 0; i < productNames.size(); i++) {
            for (int j = 0; j < productNames.get(i).size(); j++) {
                if (productName.equals(productNames.get(i).get(j).toString())) {
                    foundIn = true;
                }
            }
        }

        Assert.assertTrue(foundIn,"Wrong product found in");

    }
}


