package io.github.ZeinabTaha.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.ZeinabTaha.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D04_searchStepDef {
    P03_homePage searchField = new P03_homePage();
    P03_homePage searchBtn = new P03_homePage();
    P03_homePage productNameList = new P03_homePage();
    String searchingWord;

    @When("user search with product name as {string}")
    public void searchWithProductName(String arg0) {
        searchField.searchField().sendKeys(arg0);
        searchBtn.searchButton().click();
    }

    @Then("user is redirected to search page")
    public void checkSearchPageIsOpened() {
        String url = Hooks.driver.getCurrentUrl();
        Assert.assertTrue(url.contains("https://demo.nopcommerce.com/search?q="));
    }

    @And("Search shows relevant results")
    public void checkSearchResults() {
        WebElement list;
        int size = productNameList.products().size();
        String text;
        String searchWord;
        //System.out.println(size);
        for (int i = 0; i < size; i++) {
            list = (WebElement) productNameList.productsName().get(i);
            text = list.getText();
            searchWord = productNameList.searchWord().getAttribute("value");
            //System.out.println(i);
            //System.out.println(text);
            //System.out.println(searchWord);
            Assert.assertTrue(text.toLowerCase().contains(searchWord));
        }
    }

    @When("user search with sku as {string}")
    public void searchWithSku(String arg0) {
        searchField.searchField().sendKeys(arg0);
        searchBtn.searchButton().click();
        searchingWord = productNameList.searchWord().getAttribute("value");
    }

    @And("user Select the product")
    public void selectTheProduct() {
        productNameList.imageResults().click();
    }

    @Then("product page contains the same sku")
    public void checkProductPageContainSameSku() {
        String text;
        text = productNameList.productSku().getText();
        Assert.assertTrue(text.contains(searchingWord));
    }

}
