package fpl.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy (id = "ismjs-username")
    private WebElement emailField;

    @FindBy (id = "ismjs-password")
    private WebElement passwordField;

    @FindBy (xpath = "//html/body/main/div[4]/div/div[3]/div[1]/form/div[3]/div/button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //wpisanie loginu i hasła
    public LoginPage fillLoginForm(String email, String password) {
        fillField(emailField, email);
        fillField(passwordField, password);
        return this;
    }


    public DashboardPage submitLoginForm() {
        clickElement(loginButton);
        return new DashboardPage(driver);
    }
}
