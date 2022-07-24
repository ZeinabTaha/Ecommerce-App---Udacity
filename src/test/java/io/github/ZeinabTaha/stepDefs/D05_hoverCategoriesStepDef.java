package io.github.ZeinabTaha.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.ZeinabTaha.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class D05_hoverCategoriesStepDef {

    P03_homePage category = new P03_homePage();
    Actions action = new Actions(Hooks.driver);
    P03_homePage subCategory = new P03_homePage();
    String categoryName;

    @Given("user hover on random category")
    public void hoverOnRandomCategory(){
        //WebElement selectedCategory = (WebElement) category.categoriesList();
        action.moveToElement(category.categories()).perform();
    }

    @When("user select random subCategory")
    public void SelectRandomSubCategory(){
        subCategory.subCategories().click();
        categoryName = subCategory.subCategories().getAttribute("href");
    }

    @Then("subCategory page is opened")
    public void checkSubCategoryPageIsOpened(){
        String pageTitle;
        String pageTitleLowerCase;
        pageTitle = subCategory.pageTitle().getText();
        pageTitleLowerCase = pageTitle.toLowerCase().trim();
        Assert.assertTrue(categoryName.contains(pageTitleLowerCase));
    }
}
