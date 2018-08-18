package com.goodreads.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.nio.channels.SelectableChannel;

/**
 * Created by natalia on 8/18/18.
 */
public class RecentUpdatesPage {


    @FindBy(xpath = "//div[@class = 'modal__content']")
    private SelenideElement genresModalWindow;

    @FindBy(xpath = "//button[@type='button' and @class = 'gr-iconButton']")
    private SelenideElement closeGenresWindow;
}
