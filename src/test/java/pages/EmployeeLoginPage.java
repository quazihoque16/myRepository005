package pages;

import base.Base;
import org.openqa.selenium.By;

public class EmployeeLoginPage extends Base {

    //Locators

    public static By menuEmployeeLogin = By.partialLinkText("Employee");


    public static By textEmployeeUserId = By.name("mailuid");

    public static By textEmployeePassword = By.xpath("//input[@name='pwd']");

    public static By btnEmployeeLogin = By.cssSelector("input[name='login-submit']");

    public static  By verifyWelcome = By.xpath("//h2[text()='Welcome Test ']");
  public static  By errorMsgInvalidEmpPassword = By.id("error-msg");

    //Actions
    public static void logInAsEmployee() throws InterruptedException {
       // click(LandingPage.menuLogin);
       // click(EmployeeLoginPage.menuEmployeeLogin);
        sendKeys(EmployeeLoginPage.textEmployeeUserId,"testpilot@gmail.com");
        sendKeys(EmployeeLoginPage.textEmployeePassword,"1234");
        Thread.sleep(3000);
        click(EmployeeLoginPage.btnEmployeeLogin);
    }

}
