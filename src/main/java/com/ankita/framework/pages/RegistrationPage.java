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
    private final By mrRadioButton = By.id("id_gender1");
    private final By passwordTextBox = By.id("password");
    private final By dayDropdown = By.id("days");

private final By monthDropdown = By.id("months");

private final By yearDropdown = By.id("years");
private final By newsletterCheckbox = By.id("newsletter");

private final By specialOffersCheckbox = By.id("optin");
private final By firstNameField = By.id("first_name");
private final By lastNameField = By.id("last_name");
private final By companyField = By.id("company");
private final By addressField = By.id("address1");
private final By address2Field = By.id("address2");
private final By countryDropdown = By.id("country");
private final By stateField = By.id("state");
private final By cityField = By.id("city");
private final By zipcodeField = By.id("zipcode");
private final By mobileNumberField = By.id("mobile_number");
private final By createAccountButton = By.xpath("//button[@data-qa='create-account']");
private final By accountCreatedHeader =
    By.xpath("//h2[@data-qa='account-created']");
    public boolean isRegistrationPageDisplayed() {
    return isDisplayed(accountInformationHeader);
    }
    public void selectMrTitle() {
    click(mrRadioButton);
    }
    public void enterPassword(String password) {
    type(passwordTextBox, password);
}
public void selectDay(String day) {
    selectByVisibleText(dayDropdown, day);
}

public void selectMonth(String month) {
    selectByVisibleText(monthDropdown, month);
}

public void selectYear(String year) {
    selectByVisibleText(yearDropdown, year);
}
public void subscribeToNewsletter() {
    click(newsletterCheckbox);
}

public void receiveSpecialOffers() {
    click(specialOffersCheckbox);
}

public void enterFirstName(String firstName) {
    type(firstNameField, firstName);
}

public void enterLastName(String lastName) {
    type(lastNameField, lastName);
}

public void enterCompany(String company) {
    type(companyField, company);
}

public void enterAddress(String address) {
    type(addressField, address);
}

public void enterAddress2(String address2) {
    type(address2Field, address2);
}

public void selectCountry(String country) {
    selectByVisibleText(countryDropdown, country);
}

public void enterState(String state) {
    type(stateField, state);
}

public void enterCity(String city) {
    type(cityField, city);
}

public void enterZipcode(String zipcode) {
    type(zipcodeField, zipcode);
}

public void enterMobileNumber(String mobileNumber) {
    type(mobileNumberField, mobileNumber);
}
public void clickCreateAccount() {
    click(createAccountButton);
}
public boolean isAccountCreatedDisplayed() {
    return isDisplayed(accountCreatedHeader);
}
}

