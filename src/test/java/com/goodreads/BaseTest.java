package com.goodreads;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverProvider;
import com.goodreads.pages.HomePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.codeborne.selenide.WebDriverRunner;

import java.util.Random;

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
        Selenide.close();
    }


}
