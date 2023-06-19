package Config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {

   public static  WebDriver driver;
   @BeforeClass
   public static void beforeClass(){

      driver = ConfigWebDriver.createDriver(WebDrivers.CHROME_INCOGNITO);
   }

   @AfterClass
   public static void afterClass() throws InterruptedException {

      Thread.sleep(10000);
      driver.quit();
   }
}
