package US_502;

import US_501.Register;
import US_501.Register_Elements;
import Utility.BaseDriver;
import Utility.Tools;
import org.testng.annotations.Test;

public class Login extends BaseDriver {

    @Test(groups = {"Smoke Test", "Login Test"})
    public void LoginTest() {

        Register_Elements re = new Register_Elements();
        Login_Elements le = new Login_Elements();

        le.login.click();

        re.email.sendKeys(Register.eMailChange);
        re.password.sendKeys(Register.passwordChange);
        Tools.ActionClick(le.loginButton);

    }
}
