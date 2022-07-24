package io.github.ZeinabTaha.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.ZeinabTaha.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class D03_changeCurrenciesStepDef {
    P03_homePage currencyDropList = new P03_homePage();
    P03_homePage productList = new P03_homePage();


    @When("user select Euro currency")
    public void changeCurrency(){

        currencyDropList.currencyDropList().selectByVisibleText("Euro");
    }

    @Then("Euro Symbol is shown on the 4 products displayed in Home page")
    public void checkEuroSymbolIsDisplayed(){
        WebElement list;
        String text;
        for (int i = 0; i < 4; i++) {
            list = (WebElement) productList.products().get(i);
            text = list.getText();
            //System.out.println(i);
            //System.out.println(text);
            Assert.assertTrue(text.contains("€"));
       }
    }
}
