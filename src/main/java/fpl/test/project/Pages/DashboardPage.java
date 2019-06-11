package fpl.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends AbstractPage {

    @FindBy(xpath = "//html/body/main/div[3]/div/div/nav/span/button")
    private WebElement moreButton;

    @FindBy(xpath = "//html/body/main/div[3]/div/div/nav/ul/li[4]/a")
    private WebElement leaguesButton;

    //@FindBy(xpath = "//html/body/main/div[3]/div/div/nav/span/ul/li[5]/a")
    //private WebElement signOutButton;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isMoreButtonDisplayed() {
        return moreButton.isDisplayed();
    }

    //public DashboardPage clickMoreButton() {
    //clickElement(moreButton);
    //return this;
    //}

    public LeaguesPage goToLeaguesPage() {
    clickElement(leaguesButton);
    return new LeaguesPage(driver);
    }


    //public LoginPage clickSignOutButton() {
    //clickElement(signOutButton);
    //return new LoginPage(driver);
   //}
}
