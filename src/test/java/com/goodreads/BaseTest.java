package com.goodreads;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/**
 * Created by natalia on 8/18/18.
 */
public class BaseTest {
    String baseURL = "https://www.goodreads.com/";

    private static WebDriver driver;

    public WebDriver getDriver(){
        driver = new ChromeDriver();
        return driver;
    }

    public void openGoodReadsSite(){
        getDriver().get(baseURL);

    }

}
