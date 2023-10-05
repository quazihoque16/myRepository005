package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OrderListPage;
import pages.ProductOrderPage;

import static org.junit.Assert.assertEquals;

public class CustomerOrderProductFunctionality extends Base {

    @When("I click on menu Product Order")
    public void i_click_on_menu_product_order() {
        click(ProductOrderPage.CustomerOrderMenu);

    }

    @When("I select Product Name")
    public void i_select_product_name() {

        dropDownText(ProductOrderPage.dropDownProductName, "Pencil");

    }

    @When("I enter Order Date")
    public void i_enter_order_date() {
        sendKeys(ProductOrderPage.ProductOrderDate, "06/21/2023");
    }

    @When("I click on button Order Product")
    public void i_click_on_button_order_product() {
        click(ProductOrderPage.btnProductOrder);
    }

    @Then("Verify Order List")
    public void verify_order_list() {
       // String actualMsg = getText(OrderListPage.OrderList);
       // assertEquals("Order List", actualMsg);

       String actualMessage = getText(OrderListPage.productOrderConfirmed);
       assertEquals("Due",actualMessage);
    }

}
