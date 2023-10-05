package pages;

import org.openqa.selenium.By;

public class ProductOrderPage {
    //Locators
    public static By CustomerOrderMenu = By.xpath(" //a[text()='Order Product']");
    public static By dropDownProductName = By.xpath("//select[@name='prodId']");
    public static By ProductOrderDate = By.xpath("//div[2]/div/div/input");

    public static By btnProductOrder= By.xpath("//button[text()='Order Product']");


}
