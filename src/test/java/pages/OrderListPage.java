package pages;

import org.openqa.selenium.By;

public class OrderListPage {
    //Locators
    public static By OrderList= By.xpath("//a[text()='Order List']");
    public static By productOrderConfirmed = By.xpath("//tr[last()]/td[6]");


    public static By btnConfirm=By.xpath("//tr[last()]/td[last()]/a");
}
