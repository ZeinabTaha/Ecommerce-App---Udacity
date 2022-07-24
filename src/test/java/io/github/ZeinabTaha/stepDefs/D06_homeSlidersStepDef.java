package io.github.ZeinabTaha.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.ZeinabTaha.pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {

    P03_homePage firstSlider = new P03_homePage();
    P03_homePage secondSlider = new P03_homePage();

    @When("user click on first slider")
    public void clickOnFirstSlider(){
        firstSlider.firstSlider().click();
    }

    @Then("user is redirected to first slider page")
    public void checkFirstSliderPageIsOpened(){
        String firstSliderPage = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(firstSliderPage,"https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @When("user click on second slider")
    public void clickOnSecondSlider(){
        secondSlider.secondSlider().click();
    }

    @Then("user is redirected to second slider page")
    public void checkSecondSliderPageIsOpened(){
        String secondSliderPage = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(secondSliderPage,"https://demo.nopcommerce.com/iphone-6");
    }
}
