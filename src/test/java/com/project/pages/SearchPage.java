package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Amazon Charts')]")
    public WebElement bestSellerChart;

    @FindBy(xpath = "//span[contains(text(),'Best Seller')]")
    public WebElement bestSeller;

    @FindBy(xpath = "(//a[@class='a-size-base a-link-normal'])[1]")
    public WebElement authorName;

    @FindBy(xpath = "(//span[@class='a-size-base a-color-secondary a-text-normal'])[1]")
    public WebElement publishDate;

    @FindBy(xpath = "//span[@class=\"a-size-medium a-color-base a-text-normal\"]")
    public WebElement firstProduct;


    public boolean isBestSeller(){
        if(bestSeller.isDisplayed() || bestSellerChart.isDisplayed()){
            return true;
        }else{
            return false;
        }
    }
}