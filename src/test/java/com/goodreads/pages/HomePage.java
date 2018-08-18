package com.goodreads.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.*;


/**
 * Created by natalia on 8/18/18.
 */
public class HomePage {
    @FindBy(id = "user_first_name")
    private SelenideElement signUpUserNameField;

    @FindBy(id = "user_email")
    private SelenideElement signUpUserEmailField;

    @FindBy(id ="user_password_signup")
    private SelenideElement signUpPasswordField;

    @FindBy(xpath = "//input[@type='submit and @value='Sign up']" )
    private SelenideElement signUpButton;

    @FindBy(id = "userSignInFormEmail")
    private SelenideElement signInEmailField;

    @FindBy(id = "user_password")
    private SelenideElement signInPasswordField;

    @FindBy(xpath ="//input[@type='submit' and @value='Sign in']")
    private SelenideElement signInButton;

    public void enterSignUpName(String name){
        signUpUserNameField.should(Condition.appear);
        signUpUserNameField.setValue(name);
        System.out.println(name + " entered into Sign Up Name field");
    }

    public void enterSignUpEmail(String email){
        signUpUserEmailField.should(Condition.appear);
        signUpUserEmailField.setValue(email);
        System.out.println(email + " entered into Sign Up Email field");


    }
    public void enterSignUpPassword(String password){
        signUpPasswordField.should(Condition.appear);
        signUpPasswordField.setValue(password);
        System.out.println(password + " entered into Sign Up Password field");

    }

    public void clickSignUpButton(){

    }

    public void enterSignInEmail(String email){

    }
    public void enterSignInPassword(String email){

    }

    public void clickSignInButton(){

    }



}
