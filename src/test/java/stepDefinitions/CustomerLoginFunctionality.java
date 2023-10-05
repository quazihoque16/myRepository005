package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomerHomePage;
import pages.CustomerLoginPage;
import pages.LandingPage;

import static org.junit.Assert.assertEquals;

public class CustomerLoginFunctionality extends Base {
    @Given("I am in landing page")
    public void i_am_in_landing_page() {
        navigateUrl("http://it.microtechlimited.com");
    }
    @Then("I click on Login menu")
    public void i_click_on_login_menu() {
        click(LandingPage.menuLogin);
    }

      @Then("I click on Customer Login menu")
    public void i_click_on_customer_login_menu() {
         click(CustomerLoginPage.menuCustomerLogin);
    }
    @Then("I enter User Id")
    public void i_enter_user_id() {
    sendKeys(CustomerLoginPage.textCustomerUserId,"david@gmail.com");

    }
    @Then("I enter User Password")
    public void i_enter_user_password() {
        sendKeys(CustomerLoginPage.textCustomerPassword,"1234");
    }
    @When("I click on Login button")
    public void i_click_on_login_button() {
         click(CustomerLoginPage.btnCustomerLogin);
    }
    @Then("Verify I am in Customer Home Page")
    public void verify_i_am_in_customer_home_page() {
       String actualText = getText(CustomerHomePage.labelWelcomeMsg);

       assertEquals("Welcome Quazi", actualText);
    }

}