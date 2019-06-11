package fpl.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeaguesPage extends AbstractPage {

    @FindBy(xpath = "//html/body/main/div[4]/div/div[3]/div/div[3]/div[1]/a")
    private WebElement createLeagueLink;

    public LeaguesPage(WebDriver driver) {
        super(driver);
    }

    public InformationPage goToInformationPage() {
        clickElement(createLeagueLink);
        return new InformationPage(driver);
    }

   // public boolean isCreateLeagueLinkDisplayed() {
     //   return createLeagueLink.isDisplayed();
    //}


}