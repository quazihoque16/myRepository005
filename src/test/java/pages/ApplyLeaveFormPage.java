package pages;

import org.openqa.selenium.By;

public class ApplyLeaveFormPage {

public static  By menuApplyLeave = By.xpath("//li/a[text()='Apply Leave']");
    public static By applyReason = By.name("reason");

    public static By getStartDate = By.name("start");

    public static By getEndDate = By.name("end");

    public static By btnSubmit = By.xpath("//button[text()='Submit']");

    public static By verfyStatus = By.xpath(" //h2[text()='Leave Satus']");
}
