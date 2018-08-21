package com.goodreads;

import com.goodreads.pages.HomePage;
import com.goodreads.pages.RecentUpdatesPage;
import com.goodreads.pages.SignInPage;
import com.goodreads.pages.SignOutPage;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by natalia on 8/21/18.
 */
public class LoginTest extends BaseTest{

    String basicUserName = "azolka+test@gmail.com";
    String basicPassword = "test1234";
    HomePage homePage;

    @Before
    public void openSite(){
        homePage = HomePage.open();
    }

    @Test
    public void loginWithInvalidCredentials() {
        homePage.enterSignInEmail(basicUserName);
        homePage.enterSignInPassword("wrongPass");
        SignInPage page = homePage.clickSignInButton(new SignInPage().page());
        page.assertWrongCredentialsMessageShown();

    }

    @Test
    public void loginWithValidCredentials() {
        homePage.enterSignInEmail(basicUserName);
        homePage.enterSignInPassword(basicPassword);
        RecentUpdatesPage page = homePage.clickSignInButton(new RecentUpdatesPage().page());
        page.assertRecentUpdatesPageIsOpen();

    }
    @Test
    public void signOut() {
        homePage.enterSignInEmail(basicUserName);
        homePage.enterSignInPassword(basicPassword);
        RecentUpdatesPage page = homePage.clickSignInButton(new RecentUpdatesPage().page());
        SignOutPage signOutPage = page.signOut();
        signOutPage.assertSignOutPageIsOpen();
    }
}
