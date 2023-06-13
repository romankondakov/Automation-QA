package PageObjectHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageObject {

    public static class MainPageObject {

        private final WebDriver driver;

        private final By courseTitle=By.xpath("//div[@class=\"course-descriptor_title\"]//span[@class=\"course-descriptor_header-text\"]");
        private final By CourseRate=By.xpath("//div[@class=\"course-descriptor_rating\"]//span[@class=\"course-rating_average\"]");
        private final By CourseDescription=By.xpath("//div[@class=\"introduction-info_content introduction-info-redactor\"]");

        private final By ListCoachesName=By.xpath("//div[@class=\"coaches\"]//ul[@class=\"coach-list coaches_list\"]");
        public MainPageObject(WebDriver driver) {
            this.driver = driver;
        }

        public WebElement getCourseTitle() {
            return driver.findElement(courseTitle);
        }
        public WebElement getCourseRate(){
            return driver.findElement(CourseRate);
        }

        public WebElement getCourseDescription() {
            return driver.findElement(CourseDescription);
        }

        public List<WebElement> ListCoachesName(){
            return (List<WebElement>) driver.findElement(ListCoachesName);
        }
    }
}
