package Utility;


import US_501.Register_Elements;
import US_502.Login_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

import static US_501.Register.eMailChange;
import static US_501.Register.passwordChange;

public class BaseDriver {

    public static WebDriver driver;

    public static WebDriverWait wait;

    @BeforeClass(groups = {"Smoke Test", "Registiration Test", "Login Test", "Logout Test",
            "UI Test", "TABMenu Test", "Search Test", "Order Test","Regression Test"})
    public void startUpOperations() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));

        driver.get("https://demo.nopcommerce.com/");
        Login();


    }

    public void Login(){
        Tools.wait(2);
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

        Login_Elements le = new Login_Elements();

        le.login.click();

        re.email.sendKeys(eMailChange);
        re.password.sendKeys(passwordChange);
        Tools.ActionClick(le.loginButton);
    }

    @AfterClass(groups = {"Smoke Test", "Registiration Test", "Login Test", "Logout Test"
            , "UI Test", "TABMenu Test", "Search Test", "Order Test","Regression Test"})
    public void closingOperations() {
        Tools.wait(3);

        driver.quit();

    }
}
