package com.ankita.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ankita.framework.base.BasePage;

public class LoginPage extends BasePage {

    private final By loginHeader =
            By.xpath("//h2[text()='Login to your account']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoginPageDisplayed() {
        return isDisplayed(loginHeader);
    }
}