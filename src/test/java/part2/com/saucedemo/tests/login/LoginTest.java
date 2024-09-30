package part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void assertLoginErrorMessage() {
        loginPage.logIntoApplication("standard_user","xyz123");
        String actualMessage = loginPage.getErrorMessage();
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}