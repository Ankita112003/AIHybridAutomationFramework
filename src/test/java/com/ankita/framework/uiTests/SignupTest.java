package com.ankita.framework.uiTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ankita.framework.base.BaseTest;
import com.ankita.framework.pages.HomePage;
import com.ankita.framework.pages.LoginPage;
import com.ankita.framework.pages.RegistrationPage;
import com.ankita.framework.utils.TestDataGenerator;

public class SignupTest extends BaseTest {

    @Test
    public void shouldNavigateToRegistrationPageWhenValidSignupDetailsAreEntered() {

        // Create page objects
        HomePage homePage = new HomePage(driver);

        // Navigate to Login Page
        LoginPage loginPage = homePage.clickSignupLogin();

        // Enter signup details
        loginPage.enterSignupName("Ankita");

        String email = TestDataGenerator.generateRandomEmail();
        loginPage.enterSignupEmail(email);

        // Click Signup
        RegistrationPage registrationPage = loginPage.clickSignup();

        // Verify navigation
        Assert.assertTrue(
        registrationPage.isRegistrationPageDisplayed(),
        "Registration page is not displayed."
);

        System.out.println("Generated Email: " + email);
        System.out.println("Successfully navigated to Registration Page.");
    }
}