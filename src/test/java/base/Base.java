package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Base {
    public static WebDriver driver;


    public static String getText(By locator) {

        String s = driver.findElement(locator).getText();
        return s;
    }

    public static boolean isDisplayed(By locator) {
        WebElement element = driver.findElement(locator);
        boolean b = element.isDisplayed();
        return b;

    }

    public static void navigateUrl(String url) {
        driver.get(url);
    }

    public static void dropDownText(By locator, String text) {
        Select st = new Select(driver.findElement(locator));
        st.selectByVisibleText(text);
    }

    public static void dropDownValue(By locator, String value) {
        Select st = new Select(driver.findElement(locator));
        st.selectByValue(value);
    }

    public static void dropDownIndex(By locator, int index) {
        Select st = new Select(driver.findElement(locator));
        st.selectByIndex(index);
    }

    public static void mouseHover(By locator) {
        WebElement element = driver.findElement(locator);
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        action.contextClick();
    }

    public static void click(By locator) {
        driver.findElement(locator).click();
    }

    public static void sendKeys(By locator, String keys) {

        driver.findElement(locator).sendKeys(keys);


    }
    public static void clear(By loicator){

        driver.findElement(loicator).clear();
    }

}
