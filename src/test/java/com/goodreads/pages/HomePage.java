package com.goodreads.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.WebDriverRunner.url;


/**
 * Created by natalia on 8/18/18.
 */
public class HomePage {

    @FindBy(id = "user_first_name")
    private SelenideElement signUpUserNameField;

    @FindBy(id = "user_email")
    private SelenideElement signUpUserEmailField;

    @FindBy(id = "user_password_signup")
    private SelenideElement signUpPasswordField;

    @FindBy(xpath = "//input[@type='submit' and @value='Sign up']")
    private SelenideElement signUpButton;

    @FindBy(id = "userSignInFormEmail")
    private SelenideElement signInEmailField;

    @FindBy(id = "user_password")
    private SelenideElement signInPasswordField;

    @FindBy(xpath = "//input[@type='submit' and @value='Sign in']")
    private SelenideElement signInButton;


    public static HomePage open() {
        return Selenide.open("https://www.goodreads.com/", HomePage.class);
    }

    public static HomePage page() {
        return Selenide.page(HomePage.class);
    }

    public void enterSignUpName(String name) {
        signUpUserNameField.should(Condition.appear);
        signUpUserNameField.setValue(name);
        System.out.println(name + " entered into Sign up name field");
    }

    public void enterSignUpEmail(String email) {
        signUpUserEmailField.should(Condition.appear);
        signUpUserEmailField.setValue(email);
        System.out.println(email + " entered into Sign up email field");


    }

    public void enterSignUpPassword(String password) {
        signUpPasswordField.should(Condition.appear);
        signUpPasswordField.setValue(password);
        System.out.println(password + " entered into Sign up password field");

    }

    public GettingStartedPage clickSignUpButton() {
        signUpButton.should(Condition.appear);
        signUpButton.click();
        System.out.println("Sign up button clicked");
        return new GettingStartedPage();

    }

    public void enterSignInEmail(String email) {
        signInEmailField.should(Condition.appear);
        signInEmailField.setValue(email);
        System.out.println(email + " entered into Sign in email field");


    }

    public void enterSignInPassword(String email) {
        signInPasswordField.should(Condition.appear);
        signInPasswordField.setValue(email);
        System.out.println(email + " entered into Sign in password field");

    }

    public <T> T clickSignInButton(T expectedPage) {
        signInButton.should(Condition.appear);
        signInButton.click();
        if (url() == "https://www.goodreads.com/user/sign_in?source=home") {
            return expectedPage;
        }
        System.out.println("Sign in button clicked");
        return expectedPage;

    }

}
