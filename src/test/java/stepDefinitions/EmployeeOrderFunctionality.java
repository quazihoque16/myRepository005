package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmployeeHomePage;
import pages.EmployeeOrderListPage;
import pages.EmployeeProductOrderPage;
import pages.OrderListPage;

import static org.junit.Assert.assertEquals;

public class EmployeeOrderFunctionality extends Base {

    @When("I click on employee menu product order")
    public void i_click_on_employee_menu_product_order() {
        click(EmployeeHomePage.menuProductOrder);

    }

    @When("I chosen my product")
    public void i_chosen_my_product() throws InterruptedException {
        dropDownText(EmployeeProductOrderPage.choseProduct, "Laptop");
        Thread.sleep(2000);
    }


    @When("I put order date")

    public void i_put_order_date() throws InterruptedException {
        sendKeys(EmployeeProductOrderPage.productOrderDate, "06/22/2023");
        Thread.sleep(3000);
    }

    @When("I click on btn product order")
    public void i_click_on_btn_product_order() throws InterruptedException {

        click(EmployeeProductOrderPage.btnProductOder);
        Thread.sleep(4000);
    }

    @Then("I Verify product order confirm")
    public void i_verify_product_order_confirm() throws InterruptedException {

        click(EmployeeOrderListPage.orderConfirm);
        Thread.sleep(2000);
    }

   @Then("I confirmed product order")
    public void i_confirmed_product_order() {
 String actualMsg = getText(EmployeeOrderListPage.OrderConfirmed);
  assertEquals("Confirmed", actualMsg);

    }


}
