package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(xpath = "//a[@id=\"createAccountSubmit\"]")
    public WebElement createAccountButton;
}
