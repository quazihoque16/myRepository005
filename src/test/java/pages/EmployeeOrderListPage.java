package pages;

import base.Base;
import org.openqa.selenium.By;

public class EmployeeOrderListPage extends Base {

   // public static By verifyEmpOrderListPage= By.xpath("//body/h2");
    public static By orderConfirm = By.xpath("//tbody/tr[last()]/td/a");
    public static By OrderConfirmed = By.xpath("//tbody/tr[last()]/td[6]");
}
