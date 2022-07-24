package io.github.ZeinabTaha.pages;

import io.github.ZeinabTaha.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_wishList {
    public WebElement qtyField(){
        return Hooks.driver.findElement(By.cssSelector("input[class=\"qty-input\"]"));
    }
}
