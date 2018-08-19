package com.goodreads.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by natalia on 8/18/18.
 */
public class RecentUpdatesPage  {

    public static RecentUpdatesPage open(){return Selenide.open("https://www.goodreads.com/", RecentUpdatesPage.class);}
    public static RecentUpdatesPage page() {return Selenide.page(RecentUpdatesPage.class);}

    @FindBy(xpath = "//div[@class = 'modal__content']")
    private SelenideElement genresModalWindow;

    @FindBy(xpath = "//button[@type='button' and @class = 'gr-iconButton']")
    private SelenideElement closeGenresWindow;

    @FindBy(xpath = "//li[@class='personalNav__listItem']/div[@class='dropdown dropdown--profileMenu']")
    private SelenideElement profileDropDown;

    @FindBy(xpath = "//li[@role='menuitem']/a[@href='/user/sign_out']")
    private SelenideElement signOutProfileMenuItem;

    public boolean isGenresWindowOpen(){
        genresModalWindow.should(Condition.appear);
        if (genresModalWindow.isDisplayed() == false)
        {
            return false;
        }
        return true;

    }

    public void closeGenresWindow(){
        if(isGenresWindowOpen()){
            closeGenresWindow.should(Condition.appear);
            closeGenresWindow.click();
            System.out.println("Genres selection modal window closed");

        }

    }

    public SignOutPage signOut(){
        profileDropDown.should(Condition.appear);
        profileDropDown.click();
        signOutProfileMenuItem.should(Condition.appear);
        signOutProfileMenuItem.click();
        System.out.println("Sign out button was clicked");
        return new SignOutPage();


    }
}
