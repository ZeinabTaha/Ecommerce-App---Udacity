package io.github.ZeinabTaha.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.ZeinabTaha.pages.P03_homePage;
import io.github.ZeinabTaha.pages.P04_wishList;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {

    P03_homePage wishListBtn = new P03_homePage();
    P03_homePage wishListMsg = new P03_homePage();
    P04_wishList quantity = new P04_wishList();
    SoftAssert softAssertion = new SoftAssert();

    @When("user click on wishList button")
    public void clickWishListBtn()
    {
        wishListBtn.wishList().click();
    }

    @Then("Success message appears")
    public void checkSuccessMessageIsDisplayed()
    {
        boolean messageDisplayed = wishListMsg.wishList().isDisplayed();
        softAssertion.assertTrue(messageDisplayed);
    }

    @And("Success message is green")
    public void checkSuccessMessageIsGreen(){
        String messageColor = wishListMsg.wishList().getCssValue("background-color");
        softAssertion.assertEquals(messageColor,"rgb(75,176,122)");
    }

    @When("user click on wishList button for same product")
    public void clickSameWishListBtn(){
        wishListBtn.wishList().click();
    }

    @And("wait success message to disappear")
    public void waitMessageToDisappeared(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
    }

    @Then("user click on WishList tab")
    public void clickWishListTab(){
        wishListBtn.wishListTab().click();
    }

    @And("Qty value is bigger than 0")
    public void checkQtyValue(){
       String qty = quantity.qtyField().getAttribute("value");
       softAssertion.assertNotEquals(qty,"0");
    }
}
