import Config.BaseClass;
import PageObjectHW.PageObject;
import Util.Util;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HW_PageObject extends BaseClass {

    private static PageObject.MainPageObject mainPage;

    @BeforeClass
    public static void beforeTest() {
        driver.get("https://dnipro.ithillel.ua/courses/front-end-basic");
        mainPage = new PageObject.MainPageObject(driver);
    }

    @Test
    public void test1() {

        System.out.println("Название курса : " + mainPage.getCourseTitle().getText());
    }

    @Test
    public void test2() {
        System.out.println("Рейтинг курса : " + mainPage.getCourseRate().getText());
    }

    @Test
    public void test3() {
        System.out.println("Описание курса : " + mainPage.getCourseDescription().getText());
    }

    @Test
    public void test4() {

        System.out.println("Список спреподавателей : " + mainPage.getCoachNamesList());
        }
    }



