package io.github.ZeinabTaha.pages;

import io.github.ZeinabTaha.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_homePage {

    WebElement currencyDropDownList;
    List <WebElement> productList;
    List <WebElement> productsNameList;
    WebElement wishListBtn;

    public Select currencyDropList(){
        currencyDropDownList = Hooks.driver.findElement(By.id("customerCurrency"));
        return new Select(currencyDropDownList);
    }

    public List products(){
        productList = Hooks.driver.findElements(new By.ByCssSelector("span[class=\"price actual-price\"]"));
        return productList;
    }

    public WebElement searchField(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchWord(){
        return Hooks.driver.findElement(By.id("q"));
    }

    public WebElement searchButton(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public List productsName(){
        productsNameList = Hooks.driver.findElements(By.xpath("//div[@class='details']"));
        return productsNameList;
    }

    public WebElement imageResults(){
        return Hooks.driver.findElement(By.xpath("//div[@class='picture']"));
    }

    public WebElement productSku(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"sku\"]"));
    }

    public WebElement categories(){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"/computers\"]"));
    }

    public WebElement subCategories(){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"/desktops\"]"));
    }

    public WebElement pageTitle(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]"));
    }

    public WebElement firstSlider(){
        return Hooks.driver.findElement(By.xpath("//a[@style=\"display: block;\"]"));
    }

    public WebElement secondSlider(){
        return Hooks.driver.findElement(By.xpath("//a[@style=\"display: none;\"]"));
    }

    public WebElement facebookIcon(){
        return Hooks.driver.findElement(By.linkText("Facebook"));
    }

    public WebElement twitterIcon(){
        return Hooks.driver.findElement(By.linkText("Twitter"));
    }

    public WebElement rssIcon(){
        return Hooks.driver.findElement(By.linkText("RSS"));
    }

    public WebElement youtubeIcon(){
        return Hooks.driver.findElement(By.linkText("YouTube"));
    }

    public WebElement wishList(){
        List <WebElement> buttonsList;
        buttonsList = Hooks.driver.findElements(By.xpath("//button[@class=\"button-2 add-to-wishlist-button\"]"));
        wishListBtn = buttonsList.get(2);
        return wishListBtn;
    }

    public WebElement successMessageWishList(){
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

    public WebElement wishListTab(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"] "));
    }
}
