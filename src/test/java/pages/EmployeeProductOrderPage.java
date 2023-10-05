package pages;

import base.Base;
import org.openqa.selenium.By;

public class EmployeeProductOrderPage extends Base {

    public static By choseProduct = By.name("prodId");

    public static By productOrderDate = By.name("ordDate");

    public static By btnProductOder = By.xpath("//button[text()='Order Product']");
}
