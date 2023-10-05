package pages;

import base.Base;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Base {

    // locators

    public static By textCustomerUserId = By.name("mailuid");
    public static By menuCustomerLogin = By.partialLinkText("Customer");
    public static By textCustomerPassword = By.xpath("//input[@name='pwd']");

    public static By btnCustomerLogin = By.cssSelector("input[name='login-submit']");

    public static By invalidErrorMsg = By.xpath("//span[@id='error-msg']");

// Actions

    public static void loginAsCustomer() {
        // -----------------Landing Page
        // clickLogin Menu
        click(LandingPage.menuLogin);
        // click Customer login Menu
        click(CustomerLoginPage.menuCustomerLogin);//ctrl+Shift+f
        // click();
        //-----------------------Customer Login Page
        //Enter Customer User Id
        sendKeys(CustomerLoginPage.textCustomerUserId, "david@gmail.com");
        //Enter User Password
        sendKeys(CustomerLoginPage.textCustomerPassword, "1234");
        // Click Customer Login Button
        click(CustomerLoginPage.btnCustomerLogin);


    }
}
