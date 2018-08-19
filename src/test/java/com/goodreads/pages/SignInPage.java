package com.goodreads.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by natalia on 8/18/18.
 */

public class SignInPage {

    public static SignInPage open(){return Selenide.open("https://www.goodreads.com/user/sign_in", SignInPage.class);}
    public static SignInPage page() {return  Selenide.page(SignInPage.class);}

    @FindBy(id = "user_email")
    private SelenideElement emailAddressField;

    @FindBy(id ="user_password")
    private SelenideElement passwordField;

    @FindBy(xpath = "//input[@type='sumbit' and @value='Sign in']")
    private SelenideElement signInButton;

    @FindBy(xpath = "//p[@class='flash error']")
    private SelenideElement errorLabel;

    public void assertWrongCredentialsMessageShown(){
        errorLabel.should(Condition.appear);
        Assert.assertEquals(errorLabel.isDisplayed(),true);
        Assert.assertEquals(errorLabel.text(),"Sorry, we didn’t recognize that email/password combination. Please try again.");
        System.out.println("The error message about incorrect credentials are shown");
    }
}
