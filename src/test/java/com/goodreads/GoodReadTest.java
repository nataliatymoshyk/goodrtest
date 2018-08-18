package com.goodreads;

import com.goodreads.pages.GettingStartedPage;
import com.goodreads.pages.HomePage;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by natalia on 8/18/18.
 */

public class GoodReadTest extends BaseTest{

    String basicUserName = "azolka";
    String basicPassword = "test1234";

    @Before
    public void registerNewUser(){
        int alias = generateAlias();
        openGoodReadsSite();
        HomePage homePage = new HomePage();
        homePage.enterSignUpName(basicUserName+alias);
        homePage.enterSignUpEmail(basicUserName+"+"+alias+"gmail.com");
        homePage.enterSignUpPassword(basicPassword);
        GettingStartedPage gettingStartedPage = homePage.clickSignUpButton();
        System.out.println("User was signed up");

    }

   @Test
    public void loginWithInvalidCredentials(){

   }

   public void loginWithValidCredentials(){

   }

}
