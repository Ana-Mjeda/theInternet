package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{
    LoginPage loginPage;
    String username = "tomsmith";
    String password = "SuperSecretPassword!";

    String fakeUsername = "test";
    String fakePassword = "1234";
    @BeforeClass
    @Override
    public void beforeClass() {
        super.beforeClass();
        loginPage = new LoginPage(driver, driverWait);
    }
    @BeforeMethod
    @Override
    public void beforeMethod() {
        driver.navigate().to(baseURL +  "/login");
    }

    @Test
    public void loginAuthentication(){
        loginPage.login(username, password);
        Assert.assertTrue(loginPage.getFlashMessage().getText().startsWith("You logged into a secure area!"));

        loginPage.clickLogoutButton();
        Assert.assertTrue(loginPage.getFlashMessage().getText().startsWith("You logged out of the secure area!"));

        loginPage.login(username, fakePassword);
        Assert.assertTrue(loginPage.getFlashMessage().getText().startsWith("Your password is invalid!"));

        loginPage.login(fakeUsername,password);
        Assert.assertTrue(loginPage.getFlashMessage().getText().startsWith("Your username is invalid!"));
    }
}
