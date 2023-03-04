package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ChallengingDomPage;
import pages.LoginPage;

public class ChallengingDomTest extends BaseTest{

    ChallengingDomPage challengingDomPage;
    @BeforeClass
    @Override
    public void beforeClass() {
        super.beforeClass();
        challengingDomPage = new ChallengingDomPage(driver, driverWait);
    }

    @BeforeMethod
    @Override
    public void beforeMethod() {
        driver.navigate().to(baseURL +  "/challenging_dom");
    }


    @Test
    public void checkRow6(){
        String row6 = "Iuvaret5 Apeirian5 Adipisci5 Definiebas5 Consequuntur5 Phaedrum5 edit delete";
        Assert.assertEquals(challengingDomPage.tableText(), row6);
    }
}
