package WebTests;

import Pages.SignInPage;
import Setup.SetupTestWeb;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignInPageTest extends SetupTestWeb {

    SignInPage signInPage;

    @Test(groups = {"signIn"})
    public void signIn () throws InterruptedException, IOException {
        signInPage = new SignInPage(driver);
        signInPage.signInInput(getProperty("login"), getProperty("password"));
        signInPage.clickSignInButton();

       try {
           waitForElementStaleness(signInPage.signInButton);

       } catch (Exception e){}

    }


    @Test
    public void signInRemember () throws InterruptedException {
        signInPage = new SignInPage(driver);
        signInPage.signInInput(getProperty("login"), getProperty("password"));
        clickElement(signInPage.rememberMeCheckbox);
        signInPage.clickSignInButton();
    }

    @Test
    public void signInError () throws InterruptedException {
        signInPage = new SignInPage(driver);
        signInPage.signInInput(getProperty("login") + "m", getProperty("password") + "1");
        signInPage.clickSignInButton();
    }
}

