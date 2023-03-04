package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ChallengingDomPage;
import pages.CheckboxPage;

public class CheckboxTest extends BaseTest{
    CheckboxPage checkboxPage;
    @BeforeClass
    @Override
    public void beforeClass() {
        super.beforeClass();
        checkboxPage = new CheckboxPage(driver, driverWait);
    }

    @BeforeMethod
    @Override
    public void beforeMethod() {
        driver.navigate().to(baseURL +  "/checkboxes");
    }

    @Test
    public void checkbox(){
        checkboxPage.checkCheckbox1();
        Assert.assertFalse(checkboxPage.getCheckbox1().isSelected());

        checkboxPage.checkCheckbox2();
        Assert.assertTrue(checkboxPage.getCheckbox2().isSelected());

        checkboxPage.clickChecbox1();
        Assert.assertTrue(checkboxPage.getCheckbox1().isSelected());

        checkboxPage.clickChecbox2();
        Assert.assertFalse(checkboxPage.getCheckbox2().isSelected());

    }
}
