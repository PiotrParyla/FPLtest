package fpl.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import fpl.test.project.Pages.DashboardPage;
import fpl.test.project.Pages.LoginPage;

public class LoginTest extends AbstractTest {

    @Test
    public void successLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginForm("panparyla@gmail.com", "nachwile01");

        DashboardPage dashboardPage = loginPage.submitLoginForm();

        Assert.assertTrue(
                dashboardPage.isMoreButtonDisplayed()
        );
    }
}