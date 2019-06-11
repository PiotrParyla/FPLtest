package fpl.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import fpl.test.project.Pages.InformationPage;
import fpl.test.project.Pages.DashboardPage;
import fpl.test.project.Pages.LeaguesPage;

public class CreateLeagueTest extends AbstractTest {

    @Test
    public void successCreateLeagueTest() {

        DashboardPage dashboardPage = new DashboardPage(driver);

        LeaguesPage leaguesPage =
                dashboardPage.goToLeaguesPage();

        InformationPage informationPage =
                leaguesPage.goToInformationPage();


        Assert.assertTrue(informationPage.isAlertInfoDisplayed());
    }
}
