package US_501;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Register extends BaseDriver {

    public static String eMailChange = "bugfighters" + ((int) (Math.random() * 1000)) + "@gmail.com";
    public static String passwordChange = "123456";

    @Test(groups = {"Smoke Test", "Registiration Test"})
    public void Register() {

        SoftAssert softAssert = new SoftAssert();

        Register_Elements re = new Register_Elements();

        re.register.click();

        wait.until(ExpectedConditions.urlContains("register"));

        re.radioButton.click();

        re.firstName.sendKeys("bug");

        re.lastName.sendKeys("fighters");

        Tools.SelectMenu(re.dateOfBirthDay, "27");
        Tools.SelectMenu(re.dateOfBirthMonth, "7");
        Tools.SelectMenu(re.dateOfBirthYear, "1995");

        re.email.sendKeys(eMailChange);

        re.companyName.sendKeys("Los Pollos Hermanos");

        re.password.sendKeys(passwordChange);
        re.confirmPassword.sendKeys(passwordChange);

        re.registerButton.click();

        wait.until(ExpectedConditions.urlContains("register"));

        softAssert.assertTrue(re.resultText.getText().contains("completed"), "Unable to Login");
        softAssert.assertAll();

        re.registerContinueButton.click();

    }
}
