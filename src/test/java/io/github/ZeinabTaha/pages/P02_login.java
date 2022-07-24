package io.github.ZeinabTaha.pages;

import io.github.ZeinabTaha.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    public WebElement loginButtonHome(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement emailField(){
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement passwordField(){
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement loginButton(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }

    public WebElement myAccountTab(){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }

    public WebElement errorMessage(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}
