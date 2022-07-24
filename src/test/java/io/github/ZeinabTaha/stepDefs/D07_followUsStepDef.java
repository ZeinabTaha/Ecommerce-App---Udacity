package io.github.ZeinabTaha.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.ZeinabTaha.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {

    P03_homePage selectedIcon = new P03_homePage();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(2));

    @When("user opens facebook link")
    public void clickFacebookLink(){
        selectedIcon.facebookIcon().click();
    }
    
    @Then("facebook link is opened in new tab")
    public void facebookLinkIsOpened(){
        //wait
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        //switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        String secondTabUrl = Hooks.driver.getCurrentUrl();

        //switch from tab 1 to tab 0
        Hooks.driver.switchTo().window(tabs.get(0));

        //assert that facebook link is opened
        Assert.assertEquals(secondTabUrl,"https://www.facebook.com/nopCommerce");
    }
    
    @When("user opens twitter link")
    public void clickTwitterLink(){
        selectedIcon.twitterIcon().click();
    }
    
    @Then("Twitter link is opened in new tab")
    public void twitterLinkIsOpened(){
        //wait
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        //switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        String secondTabUrl = Hooks.driver.getCurrentUrl();

        //switch from tab 1 to tab 0
        Hooks.driver.switchTo().window(tabs.get(0));

        //assert that facebook link is opened
        Assert.assertEquals(secondTabUrl,"https://twitter.com/nopCommerce");
    }

    @When("user opens rss link")
    public void clickRssLink(){
        selectedIcon.rssIcon().click();
    }

    @Then("rss link is opened in new tab")
    public void rssLinkIsOpened(){
        //wait
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        //switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        String secondTabUrl = Hooks.driver.getCurrentUrl();

        //switch from tab 1 to tab 0
        Hooks.driver.switchTo().window(tabs.get(0));

        //assert that facebook link is opened
        Assert.assertEquals(secondTabUrl,"https://demo.nopcommerce.com/new-online-store-is-open");
    }

    @When("user opens youtube link")
    public void clickYoutubeLink(){
        selectedIcon.youtubeIcon().click();
    }

    @Then("youtube is opened in new tab")
    public void youtubeLinkIsOpened(){
        //wait
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        //switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        String secondTabUrl = Hooks.driver.getCurrentUrl();

        //switch from tab 1 to tab 0
        Hooks.driver.switchTo().window(tabs.get(0));

        //assert that facebook link is opened
        Assert.assertEquals(secondTabUrl,"https://www.youtube.com/user/nopCommerce");
    }
}
