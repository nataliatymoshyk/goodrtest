package com.goodreads.pages;

import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.*;


/**
 * Created by natalia on 8/18/18.
 */
public class HomePage {
    @FindBy(id = "user_first_name")
    private String signUpUserNameField;

    @FindBy(id = "user_email")
    private String signUpUserEmail;

    @FindBy(id ="user_password_signup")
    private String signUpPasswordField;

    @FindBy(xpath = "//input[@type='submit and @value='Sign up']" )
    private String signUpButton;

    @FindBy(id = "userSignInFormEmail")
    private String signInEmailField;

    @FindBy(id = "user_password")
    private String signInPasswordField;

    @FindBy(xpath ="//input[@type='submit' and @value='Sign in']")
    private String signInButton;

    public void enterSignUpName(String name){

    }

    public void enterSignUpEmail(String email){

    }
    public void enterSignUpPassword(String password){

    }
    


}
