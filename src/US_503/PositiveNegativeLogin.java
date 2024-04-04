package US_503;

import US_501.Register;
import US_501.Register_Elements;
import US_502.Login_Elements;
import Utility.BaseDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveNegativeLogin extends BaseDriver {
    @Test(dataProvider = "NegativEmailAdress", groups = {"Smoke Test", "Login Test"})
    public void PositiveNegativeLoginTest(String email, String password) {
        Register_Elements re = new Register_Elements();
        Login_Elements le = new Login_Elements();

        le.login.click();

        if (email.equals("hasan@gmail.com") ||
                email.equals("ali@gmail.com") ||
                email.equals("mehmet@gmail.com") ||
                email.equals("şerafettin@gmail.com") ||
                email.equals("naciye@gmail.com") ||
                email.equals("saziye@gmail.com") && password.equals("pssst212"))
        {
            re.email.sendKeys(email);
            re.password.sendKeys(password);
            le.loginButton.click();
        }
    }

    @DataProvider
    public Object[][] NegativEmailAdress() {
        Object[][] emailList =
                {
                {"hasan@gmail.com", "psst212"},
                {"mehmet@gmail.com", "pssst212"},
                {"ali@gmail.com", "pssst212"},
                {"şerafettin@gmail.com", "pssst212"},
                {"naciye@gmail.com", "pssst212"},
                {"saziye@gmail.com", "pssst212"}
                };
        return emailList;
    }
}
