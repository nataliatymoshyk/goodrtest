package com.goodreads;

import com.sun.tools.internal.jxc.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.json.JSONObject;

import java.util.Random;

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
    public int generateAlias(){
        int number;
        Random random = new Random();
        number = random.nextInt(5);
        return number;

    }



}
