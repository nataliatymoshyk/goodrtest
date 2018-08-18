package com.goodreads;

import com.goodreads.pages.GettingStartedPage;
import com.goodreads.pages.HomePage;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by natalia on 8/18/18.
 */

public class GoodReadTest extends BaseTest{

    @Before
    public void registerNewUser(){
        openGoodReadsSite();
        HomePage homePage = new HomePage();
        homePage.enterSignUpName();
        homePage.enterSignUpEmail();
        GettingStartedPage gettingStartedPage = homePage.clickSignUpButton();

    }

   @Test
    public void loginWithInvalidCredentials(){

   }

   public void loginWithValidCredentials(){

   }

}
