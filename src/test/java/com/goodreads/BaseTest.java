package com.goodreads;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.goodreads.util.WebDriverFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.BeforeClass;

/**
 * Created by natalia on 8/18/18.
 */
public class BaseTest {

    @BeforeClass
    public static void init() {
        Configuration.baseUrl = "https://www.goodreads.com/";
        Configuration.timeout = 4000;
        Configuration.browser = WebDriverFactory.class.getName();

    }

    public String generateAlias() {
        return RandomStringUtils.randomAlphabetic(6);
    }


    @After
    public void finish() {
        Selenide.clearBrowserCookies();
        Selenide.close();
    }


}
