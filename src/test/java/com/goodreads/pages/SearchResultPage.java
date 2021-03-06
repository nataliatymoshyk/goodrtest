package com.goodreads.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by natalia on 8/20/18.
 */
public class SearchResultPage {

    public static SearchResultPage open() {
        return Selenide.open("https://www.goodreads.com/search?q=", SearchResultPage.class);
    }

    public static SearchResultPage page() {
        return Selenide.page(SearchResultPage.class);
    }


    public SelenideElement buildWantToReadButtonPath(String bookId) {
        String path = String.format("//div[contains(@id,'%s_book')]", bookId);
        SelenideElement wantToReadButton = $(By.xpath(path+"/div/form/button"));
        return wantToReadButton;
    }


    public void clickWantToReadButtonForBook(String bookId) {
        SelenideElement wantToReadButton = buildWantToReadButtonPath(bookId);
        wantToReadButton.should(Condition.appear);
       // wantToReadButton.click();//activate div
        wantToReadButton.click();//click the button
        System.out.println("Book number # %s was marked as want to read");

    }

    public ReviewPopupPage clickMarkBookAsReadButtonForBook(String bookId) {
        String menuString = String.format("//div[contains(@id,'%s_book')]/div[contains(@class,'wtrRight')]", bookId);
        SelenideElement menuPath = $(By.xpath(menuString));
        SelenideElement readButtonPath = menuPath.find(By.xpath("//div[@class='wtrShelfMenu']/div/ul/li[@data-shelf-name='read']"));
        menuPath.should(Condition.appear);
        menuPath.click();
        readButtonPath.should(Condition.appear);
        readButtonPath.click();
        return ReviewPopupPage.page();

    }


}
