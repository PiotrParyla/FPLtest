package fpl.test.project.Tests;

import fpl.test.project.Utils.CustomPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    protected static WebDriver driver;

    @BeforeSuite
    public void setUpSuite() {
        // Wskazanie zewnętrznego pliku drivera dla przeglądarki CHROME
        System.setProperty(
                "webdriver.chrome.driver",
                new CustomPath().getResourcesPath("chromedriver.exe")
        );
        //Stworzenie i zainicjalizowanie obiektu DRIVER przeglądarką CHROME
        driver = new ChromeDriver();
        // Ustawienie globalnego timeouta na 5 sekund
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        // Ustawienie zmaksymalizowanego okna
        driver.manage().window().maximize();
        // przejście na wskazaną stronę
        driver.get("https://fantasy.premierleague.com");
    }

     @AfterSuite
    public void tearDownSuite() {
        //Zamknięcie przeglądarki
        driver.quit();
    }
}
