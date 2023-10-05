package pages;

import org.openqa.selenium.By;

public class CustomerHomePage {

    // locators
    public static By labelWelcomeMsg= By.xpath("//h2[contains(text(),'Welcome')]");

    public static By menuOrderProduct =  By.xpath("//a[text()='Order Product']");


//    public static By textCustomerUserId=By.name("mailuid");
//
//    public static By textCustomerPassword= By.xpath("//input[@name='pwd']");
//
//    public static By btnCustomerLogin= By.cssSelector("input[name='login-submit']");
}
