package com.goodreads.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by natalia on 8/18/18.
 */
public class SignInPage {
    @FindBy(id = "user_email")
    private SelenideElement emailAddressField;

    @FindBy(id ="user_password")
    private SelenideElement passwordField;

    @FindBy(xpath = "//input[@type='sumbit' and @value='Sign in']")
    private SelenideElement signInButton;

    @FindBy(xpath = "//p[@class='flash error']")
    private SelenideElement errorLabel;
}
