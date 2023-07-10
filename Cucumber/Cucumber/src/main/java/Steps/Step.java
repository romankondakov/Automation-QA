package Steps;

import Config.BaseClass;
import Pages.CertificatePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step extends BaseClass {
    static final String certificateURL = "https://certificate.ithillel.ua/";
    CertificatePage certificatePage = new CertificatePage(driver);

    static {
        if (driver == null) {
            BaseClass.beforeClass();
        }
    }

    @Before("@Precondition")
    public void openCertificatePage() {
        driver.get(certificateURL);
    }

    @When("I send number {string}")
    public void iSendNumber(String certifNumber) {
        certificatePage.sendCertificate(certifNumber);
    }

    @Then("check validation {string}")
    public void checkValidation(String expected) throws Exception {
        Assert.assertEquals(Boolean.valueOf(expected), certificatePage.validationCertificate());
    }
}
