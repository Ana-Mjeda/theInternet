package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;

public class CheckboxPage extends BasePage {

    @FindBy (xpath = "//*[@id=\"checkboxes\"]/input[1]")
    private WebElement checkbox1;

    @FindBy (xpath = "//*[@id=\"checkboxes\"]/input[2]")
    private WebElement checkbox2;

    public CheckboxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void checkCheckbox1() {
        WebElement checkBoxElement1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        System.out.println("The checkbox 1 is: " + checkBoxElement1.isSelected());

    }

    public void checkCheckbox2() {
        WebElement checkBoxElement2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
        System.out.println("The checkbox 2 is: " + checkBoxElement2.isSelected());

    }

    public WebElement getCheckbox1() {
        return checkbox1;
    }

    public WebElement getCheckbox2() {
        return checkbox2;
    }

    public void clickChecbox1(){
        checkbox1.click();
    }
    public void clickChecbox2(){
        checkbox2.click();
    }
}