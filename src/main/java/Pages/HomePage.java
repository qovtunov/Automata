package Pages;

import Driver.MainMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Olga Cherniak on 11/3/2016.
 */
public class HomePage extends MainMethods{

    public WebElement signUpButton;

    public WebElement signInButton;

    public HomePage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public SignUpPage clickSignUpButton(WebDriver driver){
        clickElement(signUpButton);
        return PageFactory.initElements(driver, SignUpPage.class);
    }

    public SignInPage clickSignInButton(WebDriver driver){
        clickElement(signInButton);
        return PageFactory.initElements(driver, SignInPage.class);
    }
}
