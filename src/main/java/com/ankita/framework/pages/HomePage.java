package com.ankita.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
    public boolean isHomePageVisible() {
    return driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
    }
    public void clickSignupLogin() {
    driver.findElement(By.linkText("Signup / Login")).click();
    }
}
