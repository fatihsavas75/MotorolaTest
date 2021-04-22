package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"a-autoid-8-announce\"]")
    public WebElement kindleEdition;

    @FindBy(xpath = "//input[@id=\"buy-now-button\"]")
    public WebElement buyNowButton;

    public boolean hasKindleEdition() {
        if (kindleEdition.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
}
