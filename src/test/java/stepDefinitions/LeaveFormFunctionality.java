package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApplyLeaveFormPage;
import static org.junit.Assert.assertEquals;

public class LeaveFormFunctionality extends Base {

    @When("I click on Apply Leave menu")
    public void i_click_on_apply_leave_menu() {
       click(ApplyLeaveFormPage.menuApplyLeave);
    }
    @When("I enter Reason for leave")
    public void i_enter_reason_for_leave() {
         sendKeys(ApplyLeaveFormPage.applyReason,"Vacation");
    }
    @When("I enter Start Date for leave")
    public void i_enter_start_date_for_leave() {
       sendKeys(ApplyLeaveFormPage.getStartDate,"06/19/2023");
    }
    @When("I enter End Date for leave")
    public void i_enter_end_date_for_leave() {
         sendKeys(ApplyLeaveFormPage.getEndDate,"06/25/2023");
    }
    @When("I click on Submit button")
    public void i_click_on_submit_button() {
         click(ApplyLeaveFormPage.btnSubmit);
    }
    @Then("Verify I my Leave Satus")
    public void verify_i_my_leave_satus() {
      String actualStts =  getText(ApplyLeaveFormPage.verfyStatus);

       assertEquals("Leave Satus", actualStts);
    }


}
