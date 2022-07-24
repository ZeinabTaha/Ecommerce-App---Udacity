package io.github.ZeinabTaha.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.ZeinabTaha.pages.P01_registrationPage;
import org.testng.Assert;


public class D01_registerStepDef {

    P01_registrationPage regBtn = new P01_registrationPage();
    P01_registrationPage genderSelector = new P01_registrationPage();
    P01_registrationPage firstName = new P01_registrationPage();
    P01_registrationPage lastName = new P01_registrationPage();
    P01_registrationPage dayList = new P01_registrationPage();
    P01_registrationPage monthList = new P01_registrationPage();
    P01_registrationPage yearList = new P01_registrationPage();
    P01_registrationPage email = new P01_registrationPage();
    P01_registrationPage password = new P01_registrationPage();
    P01_registrationPage confirmPassword = new P01_registrationPage();
    P01_registrationPage registerButton = new P01_registrationPage();
    P01_registrationPage successMessage = new P01_registrationPage();

@Given("user go to register page")
    public void openRegistrationPage()
    {

        regBtn.registerButtonHome().click();
    }

@When("user select gender type")
    public void selectGenderType(){
        genderSelector.genderTypeSelector().click();
    }

@And("user enter first name \"automation\"")
    public void enterFirstName(){
        firstName.firstNameField().sendKeys("automation");
    }

@And("user enter last name \"tester\"")
    public void enterLastName(){
        lastName.lastNameField().sendKeys("tester");
    }

@And("user enter date of birth")
    public void enterDateOfBirth(){
        dayList.dayDropDownList().selectByValue("10");
        monthList.monthDropDownList().selectByValue("6");
        yearList.yearDropDownList().selectByValue("1993");
    }

@And("user enter email \"test@example.com\" field")
    public void enterEmail(){
        email.emailField().sendKeys("test@example.com");
    }

@And("user fills Password fields \"P@ssw0rd\" \"P@ssw0rd\"")
    public void enterPassword(){
        password.passwordField().sendKeys("P@ssw0rd");
        confirmPassword.confirmPasswordField().sendKeys("P@ssw0rd");
    }

@And("user clicks on register button")
    public void clickRegisterButton(){
        registerButton.registerButton().click();
    }

@Then("success message is displayed")
    public void checkRegistrationSuccessMessage(){
        String messageContent = successMessage.successMessage().getText();
        System.out.println(messageContent);

        //String messageBackground = successMessage.successMessage().getCssValue("background-color");
        String messageColor = successMessage.successMessage().getCssValue("color");

        //System.out.println(messageBackground);
        System.out.println(messageColor);

        Assert.assertEquals(messageContent,"Your registration completed");
        //Assert.assertEquals(messageBackground,"rgba(76, 177, 124, 1)");
        Assert.assertEquals(messageColor,"rgba(76, 177, 124, 1)");
    }

}
