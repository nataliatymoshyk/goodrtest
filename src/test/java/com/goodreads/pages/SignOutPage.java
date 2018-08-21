package com.goodreads.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by natalia on 8/19/18.
 */
public class SignOutPage {

public static SignOutPage open(){return Selenide.open("https://www.goodreads.com/user/sign_out", SignOutPage.class);}
public static SignOutPage page() {return Selenide.page(SignOutPage.class);}

    @FindBy(xpath = "//a[text() ='Goodreads Home']")
    private SelenideElement homeLink;

    public HomePage clickHomeLink(){
        homeLink.should(Condition.appear);
        homeLink.click();
        System.out.println("Goodreads Home link is clicked");
        return new HomePage();
    }
}
