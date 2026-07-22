package com.ankita.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ankita.framework.base.BasePage;

public class LoginPage extends BasePage {

    private final By loginHeader =
            By.xpath("//h2[text()='Login to your account']");
    private final By signupName =
        By.xpath("//input[@data-qa='signup-name']");

    private final By signupEmail =
        By.xpath("//input[@data-qa='signup-email']");

    private final By signupButton =
        By.xpath("//button[@data-qa='signup-button']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoginPageDisplayed() {
        return isDisplayed(loginHeader);
    }
    public void enterSignupName(String name) {
    type(signupName, name);
}

public void enterSignupEmail(String email) {
    type(signupEmail, email);
}
public RegistrationPage clickSignup() {
    click(signupButton);
    return new RegistrationPage(driver);
}
}