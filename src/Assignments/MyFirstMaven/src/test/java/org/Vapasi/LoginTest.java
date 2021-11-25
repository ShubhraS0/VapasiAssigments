package org.Vapasi;

import org.Vapasi.pom.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginSuccessfulTest(){
        LoginPage lp = new LoginPage();
        lp.login(driver,"Shubh@12.com","Pass@123");
        //assert login success message or next screen
    }
}
