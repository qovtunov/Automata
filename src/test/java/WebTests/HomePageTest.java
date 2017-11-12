package WebTests;

import Pages.HomePage;
import Setup.SetupTestWeb;
import org.testng.annotations.Test;

/**
 * Created by Olga Cherniak on 12/22/2016.
 */
public class HomePageTest extends SetupTestWeb {

    public HomePage homePage;

    @Test(priority = 1, groups = "smokeTest")
    public void closePopup() throws InterruptedException {
        homePage = new HomePage(driver);

    }
}
