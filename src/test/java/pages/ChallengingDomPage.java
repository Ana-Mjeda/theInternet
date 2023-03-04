package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ChallengingDomPage extends BasePage{

    public ChallengingDomPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public String tableText() {

        List<WebElement> tableElements = driver.findElements(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[6]"));
        String elementText = "";

        for (int i = 0; i < tableElements.size(); i++) {
            elementText = tableElements.get(i).getText();
            System.out.println(elementText);
        }
        return elementText;
    }
}
