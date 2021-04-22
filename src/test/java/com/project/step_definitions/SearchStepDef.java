package com.project.step_definitions;
import com.project.pages.CreateAccountPage;
import com.project.pages.ProductDetailPage;
import com.project.pages.SearchPage;
import com.project.pages.SignInPage;
import com.project.utilities.ConfigurationReader;
import com.project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.logging.Logger;

public class SearchStepDef {

    SearchPage searchPage=new SearchPage();
    ProductDetailPage productDetailPage=new ProductDetailPage();
    SignInPage signInPage=new SignInPage();
    CreateAccountPage createAccountPage=new CreateAccountPage();
    Logger logger=Logger.getLogger("Search Page");

    @Given("I open the amazon`s webpage")
    public void openWebPage() {
        Driver.get().get(ConfigurationReader.get("url"));
        //Accept Cookies
        searchPage.acceptCookies();

    }

    @When("I select {string} option from drop down")
    public void iSelectOptionFromDropDown(String category) {
        SearchPage searchPage=new SearchPage();
        searchPage.selectFromDropDown("Books");
    }

    @And("Search for the book named {string}")
    public void searchForTheBookNamed(String searchItem) {
        searchPage.searchBox.sendKeys(searchItem);
        searchPage.searchButton.click();
    }

    @Then("Check if Book is a Best Seller or Not")
    public void checkIfBookIsAOrNot() {
        Assert.assertTrue(searchPage.isBestSeller());
        logger.info("It is in Best Seller");
        
    }

    @Then("Verify that author name is {string} and published on {string}")
    public void verifyThatAuthorNameIsAndPublishedOn(String authorName, String publishDate) {
        Assert.assertEquals("Verify Author Name",authorName , searchPage.authorName.getText());
        Assert.assertEquals("Verify Publish Date",publishDate , searchPage.publishDate.getText());
    }


    @Then("Check if Book is available in the format of an Kindle Edition")
    public void checkIfBookIsAvailableInTheFormatOfAnKindleEdition() {
        searchPage.firstProduct.click();
        Assert.assertTrue(productDetailPage.hasKindleEdition());
        logger.info("Has Kindle Edition");
        
    }

    @Then("Select the book and proceed towards Check Out")
    public void selectTheBookAndProceedTowardsCheckOut() {
        productDetailPage.buyNowButton.click();
    }

    @Then("Select Create Your Amazon Account if user do not have an account")
    public void selectCreateYourAmazonAccountIfUserDoNotHaveAnAccount() {
        signInPage.createAccountButton.click();
    }

    @And("Verify all fields available on Create Your Amazon Account page")
    public void verifyAllFieldsAvailableOnCreateYourAmazonAccountPage() {
        Assert.assertTrue(createAccountPage.customerNameField.isDisplayed());
        Assert.assertTrue(createAccountPage.emailField.isDisplayed());
        Assert.assertTrue(createAccountPage.passwordField.isDisplayed());
        Assert.assertTrue(createAccountPage.rePasswordField.isDisplayed());
    }
}