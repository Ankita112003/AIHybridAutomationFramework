package com.ankita.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ankita.framework.base.BasePage;

public class HomePage extends BasePage  {
private final By homePageLogo =
        By.xpath("//img[@alt='Website for automation practice']");
 private final By signupLoginButton = By.linkText("Signup / Login");
   public HomePage(WebDriver driver) {
    super(driver);
}

    public String getPageTitle() {
    return getTitle();
}
    public boolean isHomePageVisible() {
    return isDisplayed(homePageLogo);
}
   
   public LoginPage clickSignupLogin() {
    click(signupLoginButton);
    return new LoginPage(driver);
}
}
