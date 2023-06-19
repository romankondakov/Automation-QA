package PageObjectHW;

import Util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class PageObject {

    public static class MainPageObject {

        private final WebDriver driver;

        By courseTitle = By.xpath("//div[@class=\"course-descriptor_title\"]//span[@class=\"course-descriptor_header-text\"]");By courseRate = By.xpath("//div[@class=\"course-descriptor_rating\"]//span[@class=\"course-rating_average\"]");By courseDescription = By.xpath("//div[@class=\"introduction-info_content introduction-info-redactor\"]");
        By coachesShowAllButton= By.id("coachesShowAllButton");
        By coachListItem=By.className("coach-list_item");
        By coachName=By.className("coach-card_name");

        public MainPageObject(WebDriver driver) {
            this.driver = driver;
        }

        public WebElement getCourseTitle() {
            return driver.findElement(courseTitle);
        }

        public WebElement getCourseRate() {

            return driver.findElement(courseRate);
        }

        public WebElement getCourseDescription() {

            return driver.findElement(courseDescription);
        }

        public List<String> getCoachNamesList(){
            Util.scrollToElementVisibilityOf(driver,coachesShowAllButton);
            driver.findElement(coachesShowAllButton).click();
            List<String> namesList = new ArrayList<>();
            for (WebElement element : driver.findElements(coachListItem)) {
                namesList.add(element.findElement(coachName).getText());
            }

            return namesList;
        }
    }
}