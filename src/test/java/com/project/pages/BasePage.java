package com.project.pages;

import com.project.utilities.BrowserUtils;
import com.project.utilities.ConfigurationReader;
import com.project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    public BasePage(){ PageFactory.initElements(Driver.get(),this); }

    @FindBy(xpath = "//*[@id=\"searchDropdownBox\"]")
    public WebElement dropDown;

    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@name=\"accept\"]")
    public WebElement acceptCookiesButton;

    public void acceptCookies(){
        acceptCookiesButton.click();
    }

    public void selectFromDropDown(String category){
        Select select=new Select(dropDown);
        select.selectByVisibleText(category);
    }

}
