package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage {

    @FindBy(xpath = "//input[@id=\"ap_customer_name\"]")
    public WebElement customerNameField;


    @FindBy(xpath = "//input[@id=\"ap_email\"]")
    public WebElement emailField;

    @FindBy(xpath = "//input[@id=\"ap_password\"]")
    public WebElement passwordField;

    @FindBy(xpath = "//input[@id=\"ap_password_check\"]")
    public WebElement rePasswordField;

}
