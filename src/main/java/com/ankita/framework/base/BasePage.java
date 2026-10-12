package com.ankita.framework.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected final WebDriverWait wait;
    public BasePage(WebDriver driver) {
    this.driver = driver;
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
}

    protected void click(By locator) {
    wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
}

    protected void type(By locator, String text) {
    wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
        .sendKeys(text);
}

    protected boolean isDisplayed(By locator) {
    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
               .isDisplayed();
}

    protected String getText(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }
    protected void selectByVisibleText(By locator, String text) {

    WebElement element = wait.until(
            ExpectedConditions.visibilityOfElementLocated(locator));

    Select select = new Select(element);

    select.selectByVisibleText(text);
}
    protected String getTitle() {
        return driver.getTitle();
    }
}