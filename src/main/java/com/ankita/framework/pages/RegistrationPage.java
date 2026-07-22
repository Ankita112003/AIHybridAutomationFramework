package com.ankita.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ankita.framework.base.BasePage;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    private final By accountInformationHeader =
        By.xpath("//b[text()='Enter Account Information']");
    public boolean isRegistrationPageDisplayed() {
    return isDisplayed(accountInformationHeader);
}
}
