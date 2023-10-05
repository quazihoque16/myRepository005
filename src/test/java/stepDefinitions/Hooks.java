package stepDefinitions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks extends Base {

    @Before
    public static void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("@BeforeSuite");
    }

        @After
        public void tearDown(Scenario scenario) {
            try {
                String screenshotName= scenario.getName().replace(" ", "");
                if(scenario.isFailed()) {
                   // scenario.log("this is my failure message");
                   // scenario.log(screenshotName);
                    TakesScreenshot ts = (TakesScreenshot)driver;
                    byte[]screenshot = ts.getScreenshotAs(OutputType.BYTES);
                    scenario.attach(screenshot, "image/png", screenshotName);
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        driver.quit();
        System.out.println("@AfterSuite");
    }
}
