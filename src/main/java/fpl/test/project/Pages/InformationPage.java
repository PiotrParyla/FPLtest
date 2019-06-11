package fpl.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InformationPage extends AbstractPage {

    @FindBy(xpath = "//html/body/main/div[4]/div/div[3]/div/div[3]/p")
    private WebElement alertInfo;

    public InformationPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAlertInfoDisplayed() {
        return alertInfo.isDisplayed();
    }
}
