package com.goodreads.pages;

import com.codeborne.selenide.*;
import com.codeborne.selenide.impl.WebElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

/**
 * Created by natalia on 8/21/18.
 */
public class MyBooksPage {

    public static MyBooksPage open() {
        return Selenide.open("https://www.goodreads.com/review/list", MyBooksPage.class);
    }
    public static MyBooksPage page() { return Selenide.page(MyBooksPage.class);}

    @FindBy (xpath = "//a[@class = 'selectedShelf' and contains(text(),'All')]")
    private SelenideElement allBooksShelf;

    @FindBy(xpath = "//a[@class='actionLinkLite smallText deleteLink']")
    private WebElementsCollection listCloseButtons;



    public void clickAllBooksSlelf(){
        allBooksShelf.should(Condition.appear);
        allBooksShelf.click();
    }

    public void deleteAllBooks(){

        ElementsCollection listCloseButtons = $$x("//a[@class='actionLinkLite smallText deleteLink']");
       if (listCloseButtons.size()!=0){
        do {
            if (listCloseButtons.first().exists()) {
                listCloseButtons.first().click();
                WebDriverRunner.getWebDriver().switchTo().alert().accept();
            }
        }
            while (listCloseButtons.first().exists());
       }
        System.out.println("The collection is empty");

        }
    }
