import Config.BaseClass;
import Util.Util;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HW_Find_Teachers extends BaseClass {

    static String mainURL = "https://dnipro.ithillel.ua/";
    By coursePrograming = By.xpath("//div[@class='course-cat-bar_body']//img[@alt='Програмування']");
    By courseFront = By.xpath("//*[@id='categories']/div[3]/div/ul/li[1]/div/div[1]/ul/li[1]/a/div[2]");


    @BeforeClass
    public static void first() {
        driver.get(mainURL);
    }

    @Before
    public void mainP() {
        if (!driver.getCurrentUrl().equals(mainURL)) {
            driver.navigate().to(mainURL);
        }
    }

    @Test
    public void mainPage() {
        driver.findElement(coursePrograming).click();
        driver.findElement(courseFront).click();
        Util.scrollToElementVisibilityOf(driver,By.className("coaches"));
        List<WebElement> teachersContainer = driver.findElements(By.xpath("//li[@class='coach-list_item']"));
        System.out.println("Teachers List:");
        for (WebElement teacher : teachersContainer) {
            System.out.println(teacher.findElement(By.className("coach-card_name")).getText());
         }
    }
}