package Config;

import org.openqa.selenium.WebDriver;

public class BaseClass {

   static public WebDriver driver = ConfigWebDriver.createDriver(WebDrivers.CHROME_INCOGNITO);
}
