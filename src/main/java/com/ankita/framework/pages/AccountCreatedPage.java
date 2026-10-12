
package com.ankita.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ankita.framework.base.BasePage;

public class AccountCreatedPage extends BasePage {

    private final By continueButton =
        By.xpath("//a[@data-qa='continue-button']");

    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    public void clickContinue() {
        click(continueButton);
    }
}
