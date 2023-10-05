package pages;

import org.openqa.selenium.By;

public class EmployeeHomePage {

    //locators

    public static By labelWelcomeMsg= By.xpath("//h2[contains(text(),'Welcome')]");

    public static By leaveLoginMenu= By.xpath("//a[text()='Apply Leave']");

    public static By menuProductOrder = By.xpath("//li/a[text()='Product Order']");
    public static By menuMyProfile = By.xpath("//li[2]/a");
   //public static By choseProduct = By.name("prodId");
   // public static By productOrderDate = By.name("ordDate");

   // public static By btnProductOder = By.xpath("//button[text()='Order Product']");
   public static By btnUpdateInfo = By.xpath("//button[text()='Update Info']");
   public static By btnSubmit = By.xpath("//button[text()='Submit']");
   public static By changeAddress = By.name("address");

   public static By updateVrerify = By.xpath("//h2");

   //public static By verifyEmpOrderPage = By.xpath("//body/h2");
    public static By logOut = By.xpath("//a[text()='Log Out']");





}
