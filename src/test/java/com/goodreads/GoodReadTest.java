package com.goodreads;

import com.goodreads.pages.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by natalia on 8/18/18.
 */

public class GoodReadTest extends BaseTest{

    String basicUserName = "azolka+test@gmail.com";
    String basicPassword = "test1234";
    GettingStartedPage gettingStartedPage;
    HomePage homePage;
   // String alias;

    @Before
    public void registerNewUser(){
       // alias = generateAlias();//generate random numbers to make names unique
        homePage = HomePage.open(); //open the site
      /*  homePage.enterSignUpName(basicUserName+alias);
        homePage.enterSignUpEmail(basicUserName+"@gmail.com");
        homePage.enterSignUpPassword(basicPassword);
        gettingStartedPage = homePage.clickSignUpButton(); //sign up using unique credentilas.
        System.out.println("User was signed up");

        RecentUpdatesPage recentUpdatesPage = gettingStartedPage.clickLogo(); //back to home page
        recentUpdatesPage.closeGenresWindow(); //close genres selection pop up window
        SignOutPage signOutPage = recentUpdatesPage.signOut(); //sign out and back to home screen
        homePage =  signOutPage.clickHomeLink();*/

    }

   @Test
    public void loginWithInvalidCredentials(){
        homePage.enterSignInEmail(basicUserName);
        homePage.enterSignInPassword("wrongPass");
        SignInPage page = homePage.clickSignInButton(new SignInPage().page());
        page.assertWrongCredentialsMessageShown();


   }

   public void loginWithValidCredentials(){

   }

}
