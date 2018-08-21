package com.goodreads.pages;

import com.codeborne.selenide.*;
import com.goodreads.BaseTest;
import org.jsoup.Connection;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Configuration.browser;

/**
 * Created by natalia on 8/20/18.
 */
public class ReviewPopupPage {

    public static ReviewPopupPage page() {return Selenide.page(ReviewPopupPage.class);}
    public static ReviewPopupPage open() {return Selenide.open("/",ReviewPopupPage.class);}


    @FindBy(id = "box")
    private SelenideElement reviewPopupWindow;

    @FindBy(xpath = "//div[@class = 'formItem']/div[@class='stars']/a[@title='did not like it']")
    private SelenideElement oneStarButton;

    @FindBy(xpath = "//div[@class = 'formItem']/div[@class='stars']/a[@title = 'it was ok']")
    private SelenideElement twoStarsButton;

    @FindBy(xpath = "//div[@class = 'formItem']/div[@class='stars']/a[@title = 'liked it']")
    private SelenideElement threeStarsButton;

    @FindBy(id = "review_review_usertext")
    private SelenideElement reviewTextField;

    @FindBy(xpath = "//select[@class='rereadDatePicker smallPicker endYear']")
    private SelenideElement finishedYearDropdown;

    @FindBy(xpath = "//select[@class='rereadDatePicker largePicker endMonth']")
    private SelenideElement finishedMonthDropdown;

    @FindBy(xpath = "//select[@class='rereadDatePicker smallPicker endDay']")
    private SelenideElement finishedDayDropdown;

    @FindBy(xpath = "//input[@class = 'gr-button' and @value ='Save']")
    private SelenideElement saveReviewButton;


    public void enterReview(String review){
        this.reviewPopupWindow.should(Condition.appear);
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
        twoStarsButton.should(Condition.appear);
        twoStarsButton.click();
        System.out.println("Two stars were clicked as rating");
    }

    public void setThreeStarMark(){
        threeStarsButton.should(Condition.appear);
        threeStarsButton.click();
        System.out.println("Three stars were clicked as rating");
    }

    public void setFinishReadingDate(String year, String month, String day){
    finishedDayDropdown.should(Condition.appear);
    finishedYearDropdown.selectOption(year);
    finishedMonthDropdown.selectOption(month);
    finishedDayDropdown.selectOption(day);
    System.out.println("Finish reading date was set up");
    }
    public void clickSaveReviewButton(){
        saveReviewButton.should(Condition.appear);
        saveReviewButton.click();

    }

}
