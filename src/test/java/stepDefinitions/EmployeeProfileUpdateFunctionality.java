package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmployeeHomePage;

import static org.junit.Assert.assertEquals;

public class EmployeeProfileUpdateFunctionality extends Base {

    @When("I click on menu My Profile")
    public void i_click_on_menu_my_profile() {

        click(EmployeeHomePage.menuMyProfile);

    }

    @When("I click on button Update")
    public void i_click_on_button_update() {
        click(EmployeeHomePage.btnUpdateInfo);
    }

    @When("I clear the existing address")
    public void i_clear_the_existing_address() {
        clear(EmployeeHomePage.changeAddress);
    }

    @When("I enter new address")
    public void i_enter_new_address() {
        sendKeys(EmployeeHomePage.changeAddress, "5617 Southern Fern Rd");
    }

    @When("I click on btn Submit")
    public void i_click_on_btn_submit() {
        click(EmployeeHomePage.btnSubmit);
    }

    @Then("Verify updated profile page")
    public void verify_updated_profile_page() {
        String actualVerifyMsg = getText(EmployeeHomePage.updateVrerify);
        assertEquals("My Info", actualVerifyMsg);
    }


}
