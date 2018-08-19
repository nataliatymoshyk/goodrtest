package com.goodreads.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by natalia on 8/18/18.
 */
public class GettingStartedPage {

    public static GettingStartedPage open() {return Selenide.open("https://www.goodreads.com/", GettingStartedPage.class);}
    public static GettingStartedPage page() {return Selenide.page( GettingStartedPage.class);}

    @FindBy(id = "logo")
    private SelenideElement logo;

    public RecentUpdatesPage clickLogo(){
        logo.should(Condition.appear);
        logo.click();
        System.out.println("Logo clicked to back to main page");
        return new  RecentUpdatesPage();
    }
}
