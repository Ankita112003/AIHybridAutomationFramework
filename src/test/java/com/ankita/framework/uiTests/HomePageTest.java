package com.ankita.framework.uiTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ankita.framework.base.BaseTest;
import com.ankita.framework.pages.HomePage;
import com.ankita.framework.pages.LoginPage;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageTitle() {

        HomePage homePage = new HomePage(driver);

        String title = homePage.getPageTitle();

        Assert.assertEquals(title, "Automation Exercise", "Homepage title mismatch.");
         
    }
    @Test
public void verifyHomePageLogo() {

    HomePage homePage = new HomePage(driver);

    boolean status = homePage.isHomePageVisible();

    Assert.assertTrue(status, "Homepage logo is not visible.");
}

    @Test
public void verifyNavigationToLoginPage() {

     HomePage homePage = new HomePage(driver);

    LoginPage loginPage = homePage.clickSignupLogin();

    boolean status = loginPage.isLoginPageDisplayed();

    Assert.assertTrue(status, "Login page is not displayed.");
}
}