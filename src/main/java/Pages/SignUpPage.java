package Pages;

import Driver.MainMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Olga Cherniak on 8/11/2016.
 */
public class SignUpPage extends MainMethods{

    ///
    ///Create account page locators
    ///

    public WebElement email;

    public WebElement emailConf;

    public WebElement username;

    public WebElement password;

    public WebElement passwordVerify;

    public WebElement acceptBox;


    public WebElement createAccountButton;

    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
