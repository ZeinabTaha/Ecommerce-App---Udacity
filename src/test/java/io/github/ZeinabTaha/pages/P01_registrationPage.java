package io.github.ZeinabTaha.pages;

import io.github.ZeinabTaha.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_registrationPage {
    WebElement dayDropDownList;
    WebElement monthDropDownList;
    WebElement yearDropDownList;
    public WebElement registerButtonHome(){

        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement genderTypeSelector(){

        return Hooks.driver.findElement(By.id("gender-female"));
    }

    public WebElement firstNameField(){

        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastNameField(){

        return Hooks.driver.findElement(By.name("LastName"));
    }

    public Select dayDropDownList(){
        dayDropDownList = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        return new Select(dayDropDownList);
    }

    public Select monthDropDownList(){
        monthDropDownList = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        return new Select(monthDropDownList);
    }

    public Select yearDropDownList(){
        yearDropDownList = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        return new Select(yearDropDownList);
    }

    public WebElement emailField(){

        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement passwordField(){
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPasswordField(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerButton(){
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement successMessage(){
        return Hooks.driver.findElement(By.className("result"));
    }


}
