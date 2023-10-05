package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmployeeHomePage;
import pages.EmployeeLoginPage;
import pages.LandingPage;

import static base.Base.navigateUrl;
import static org.junit.Assert.assertEquals;

public class EmployeeLoginFunctionality extends Base {

    @Then("I enter Employee User Id")
    public void i_enter_employee_user_id() {
         sendKeys(EmployeeLoginPage.textEmployeeUserId,"testpilot@gmail.com");
    }
    @Then("I enter Employee User Password")
    public void i_enter_employee_user_password() {
       sendKeys(EmployeeLoginPage.textEmployeePassword,"1234");
    }
    @When("I click on Employee Login button")
    public void i_click_on_employee_login_button() {
        click(EmployeeLoginPage.btnEmployeeLogin);

    }

    @Then("Verify I am in Employee Home Page")
    public void verify_i_am_in_employee_home_page() {
      String actualMsg  =  getText(EmployeeHomePage.labelWelcomeMsg);
      assertEquals("Welcome Test",actualMsg);
    }



}
