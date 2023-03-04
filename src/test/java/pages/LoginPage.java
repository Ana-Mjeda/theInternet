package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    @FindBy (id = "username")
    private WebElement username;

    @FindBy (id = "password")
    private WebElement password;

    @FindBy (className = "radius")
    private WebElement loginButton;

    @FindBy (id = "flash")
    private WebElement flashMessage;

    @FindBy(className = "secondary")
    private WebElement logoutButton;

    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void login(String username, String pass) {
        this.username.sendKeys(username);
        this.password.sendKeys(pass);
        loginButton.click();
    }

    public WebElement getFlashMessage() {
        return flashMessage;
    }


    public void clickLogoutButton(){
        logoutButton.click();
    }
}
