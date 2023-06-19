package Pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertificatePage {

    @FindBy(name = "certificate")
    WebElement searchField;
    @FindBy(id = "certificateCheckForm")
    WebElement formCert;


    public CertificatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    WebDriver driver;

    public void sendCertificate(String sendNumber){
    searchField.sendKeys(sendNumber);
    searchField.sendKeys(Keys.ENTER);
    }


    public Object validationCertificate() throws Exception {
        boolean result = false;
        int i = 0;
        while (true){
            if (driver.getCurrentUrl().contains("view")){
                result = true;
                break;
            }
            if (formCert.getAttribute("class").contains("invalid")){
                result = false;
                break;
            }
            Thread.sleep(1000);
            i++;
            if (i > 10){
                throw new Exception("Fail");
            }
        }
        return result
    }
}
