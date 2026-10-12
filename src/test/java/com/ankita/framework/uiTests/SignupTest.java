
package com.ankita.framework.uiTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ankita.framework.base.BaseTest;
import com.ankita.framework.pages.AccountCreatedPage;
import com.ankita.framework.pages.HomePage;
import com.ankita.framework.pages.LoginPage;
import com.ankita.framework.pages.RegistrationPage;
import com.ankita.framework.utils.TestDataGenerator;
public class SignupTest extends BaseTest {

    @Test
    public void shouldRegisterNewUserSuccessfully() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickSignupLogin();

        // Enter signup details
        loginPage.enterSignupName("Ankita");

        String email = TestDataGenerator.generateRandomEmail();
        String password = "Test@12345";

        loginPage.enterSignupEmail(email);

        // Navigate to registration form
        RegistrationPage registrationPage = loginPage.clickSignup();

        Assert.assertTrue(
            registrationPage.isRegistrationPageDisplayed(),
            "Registration page is not displayed."
        );

        // Fill account information
        registrationPage.selectMrTitle();
        registrationPage.enterPassword(password);
        registrationPage.selectDay("10");
        registrationPage.selectMonth("May");
        registrationPage.selectYear("1998");

        // Fill address information
        registrationPage.enterFirstName("Ankita");
        registrationPage.enterLastName("Agarwal");
        registrationPage.enterCompany("Test Company");
        registrationPage.enterAddress("123 Test Street");
        registrationPage.selectCountry("India");
        registrationPage.enterState("Bihar");
        registrationPage.enterCity("Patna");
        registrationPage.enterZipcode("800001");
        registrationPage.enterMobileNumber("9876543210");

        // Submit the form
        registrationPage.clickCreateAccount();

        // Verify account creation
        Assert.assertTrue(
            registrationPage.isAccountCreatedDisplayed(),
            "Account creation failed."
        );
        // Continue after successful account creation
AccountCreatedPage accountCreatedPage =
    new AccountCreatedPage(driver);

accountCreatedPage.clickContinue();

// Verify that the user is logged in
HomePage homePageAfterRegistration = new HomePage(driver);

Assert.assertTrue(
    homePageAfterRegistration.isLoggedInAsDisplayed(),
    "User is not logged in after account creation."
);

System.out.println("User is logged in successfully.");
        System.out.println("Account created successfully!");
        System.out.println("Registered email: " + email);
        System.out.println("Registered password: " + password);
    }
}
