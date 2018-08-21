package com.goodreads;

import com.goodreads.pages.*;
import org.junit.After;
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
        homePage = HomePage.open(); //open the site
    }

   @Test
    public void loginWithInvalidCredentials(){
        homePage.enterSignInEmail(basicUserName);
        homePage.enterSignInPassword("wrongPass");
        SignInPage page = homePage.clickSignInButton(new SignInPage().page());
        page.assertWrongCredentialsMessageShown();


   }
  @Test
   public void loginWithValidCredentials(){
       homePage.enterSignInEmail(basicUserName);
       homePage.enterSignInPassword(basicPassword);
       RecentUpdatesPage page = homePage.clickSignInButton(new RecentUpdatesPage().page());
       page.assertRecentUpdatesPageIsOpen();

   }


   @Test
    public void searchForThreeBestCrimeBooks(){
       homePage.enterSignInEmail(basicUserName);
       homePage.enterSignInPassword(basicPassword);
       RecentUpdatesPage page = homePage.clickSignInButton(new RecentUpdatesPage().page());
       SearchResultPage search = page.searchBookByQuery("Best crime and mystery books");
       search.clickWantToReadButtonForBook("1");
       search.clickWantToReadButtonForBook("2");
       search.clickWantToReadButtonForBook("3");
   }

   @Test
    public void markBooksAsReadAndAddReview(){
       homePage.enterSignInEmail(basicUserName);
       homePage.enterSignInPassword(basicPassword);
       RecentUpdatesPage page = homePage.clickSignInButton(new RecentUpdatesPage().page());
       SearchResultPage search = page.searchBookByQuery("Best crime and mystery books");
       ReviewPopupPage review = search.clickMarkBookAsReadButtonForBook("1");

       review.setOneStarMark();
       review.enterReview("I didn't like");
       review.setFinishReadingDate("2018", "January", "1");
       review.clickSaveReviewButton();
       ReviewPopupPage review2 = search.clickMarkBookAsReadButtonForBook("2");
       review2.setTwoStarMark();
       review2.enterReview("It was ok");
       review2.setFinishReadingDate("2017", "May", "8");
       review2.clickSaveReviewButton();
       ReviewPopupPage review3 = search.clickMarkBookAsReadButtonForBook("3");
       review3.setThreeStarMark();
       review3.enterReview("It was nice");
       review3.setFinishReadingDate("2016", "June", "10");
       review3.clickSaveReviewButton();

   }



}