package com.goodreads.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by natalia on 8/20/18.
 */
public class ReviewPopupPage {
    public static RecentUpdatesPage page() {return Selenide.page(RecentUpdatesPage.class);}

    @FindBy(id = "box")
    private SelenideElement reviewPopupWindow;

    @FindBy(xpath = "//a[@title = 'did not like it']")
    private SelenideElement oneStarButton;

    @FindBy(xpath = "//a[@title = 'it was ok']")
    private SelenideElement twoStarsButton;

    @FindBy(xpath = "//a[@title = 'liked it']")
    private SelenideElement threeStarsButton;

    @FindBy(id = "review_review_usertext")
    private SelenideElement reviewTextField;

    public void enterReview(String review){
        reviewPopupWindow.should(Condition.appear);
        reviewTextField.should(Condition.appear);
        reviewTextField.setValue(review);
        System.out.println("The review was entered into Review field");
    }

    public void setOneStarMark(){
        oneStarButton.should(Condition.appear);
        oneStarButton.click();
        System.out.println("One star was clicked as rating");
    }

    public void setTwoStarMark(){
        oneStarButton.should(Condition.appear);
        oneStarButton.click();
        System.out.println("Two stars were clicked as rating");
    }

    public void setThreeStarMark(){
        oneStarButton.should(Condition.appear);
        oneStarButton.click();
        System.out.println("Three stars were clicked as rating");
    }

}
