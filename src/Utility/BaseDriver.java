package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.time.temporal.WeekFields;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;

    public static WebDriverWait wait;

    @BeforeClass(groups = {"Smoke Test", "Registiration Test", "Login Test", "Logout Test",
            "UI Test", "TABMenu Test", "Search Test", "Order Test"})
    public void startUpOperations() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));

        driver.get("https://demo.nopcommerce.com/");

    }



    @AfterClass(groups = {"Smoke Test", "Registiration Test", "Login Test", "Logout Test"
            , "UI Test", "TABMenu Test", "Search Test", "Order Test"})
    public void closingOperations() {
        Tools.wait(3);

        driver.quit();

    }
}
