package io.github.ZeinabTaha.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.ZeinabTaha.pages.P02_login;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login loginBtnH = new P02_login();
    P02_login email = new P02_login();
    P02_login password = new P02_login();
    P02_login loginBtn = new P02_login();
    P02_login myAccount = new P02_login();
    P02_login message = new P02_login();

    SoftAssert softAssertion = new SoftAssert();

    @Given("user go to login page")
    public void openLoginPage()
    {
        loginBtnH.loginButtonHome().click();
    }

    @When("user login with \"valid\" \"test@example.com\"")
    public void enterUsername(){
        email.emailField().sendKeys("test@example.com");
    }

    @And("user login with \"valid\" \"P@ssw0rd\"")
    public void enterPassword(){
        password.passwordField().sendKeys("P@ssw0rd");
    }

    @And("user press on login button")
    public void clickLoginButton(){
        loginBtn.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void checkLoginSuccessfully(){
        //verify the link
        String url = Hooks.driver.getCurrentUrl();
        softAssertion.assertEquals(url,"https://demo.nopcommerce.com/");

        //verify my account tab is displayed
        boolean myAccountDisplayed = myAccount.myAccountTab().isDisplayed();
        softAssertion.assertTrue(myAccountDisplayed);

        softAssertion.assertAll();
    }

    @Given("user go to login page again")
    public void openLoginPageAgain() {
        loginBtnH.loginButtonHome().click();
    }

    @When("user login with \"invalid\" \"invalidtest@example.com\"")
    public void enterInvalidUsername(){
        email.emailField().sendKeys("invalidtest@example.com");
    }

    @And("user login with \"invalid\" \"P@ssw0rd\"")
    public void enterInvalidPassword(){
        password.passwordField().sendKeys("P@ssw0rd");
    }

    @And("user click on login button")
    public void pressLoginButton(){
        loginBtn.loginButton().click();
    }

    @Then("user could not login to the system")
    public void checkLoginFail(){
        //verify error message content
        String text = message.errorMessage().getText();
        softAssertion.assertTrue(text.contains("Login was unsuccessful."));

        //verify message color
        String messageColor = message.errorMessage().getCssValue("color");
        softAssertion.assertEquals(messageColor,"rgba(228, 67, 75, 1)");

        softAssertion.assertAll();
    }


}
