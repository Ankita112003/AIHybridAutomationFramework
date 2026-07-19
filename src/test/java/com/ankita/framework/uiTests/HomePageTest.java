package com.ankita.framework.uiTests;

import org.testng.annotations.Test;

import com.ankita.framework.base.BaseTest;
import com.ankita.framework.pages.HomePage;
import com.ankita.framework.pages.LoginPage;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageTitle() {

        HomePage homePage = new HomePage(driver);

        String title = homePage.getPageTitle();

        System.out.println("Page Title: " + title);
         
    }
    @Test
public void verifyHomePageLogo() {

    HomePage homePage = new HomePage(driver);

    boolean status = homePage.isHomePageVisible();

    System.out.println("Logo Visible: " + status);
}

    @Test
public void verifyNavigationToLoginPage() {

    HomePage homePage = new HomePage(driver);

    homePage.clickSignupLogin();

    LoginPage loginPage = new LoginPage(driver);

    System.out.println("Login Page Title: "
            + loginPage.getPageTitle());
}
}