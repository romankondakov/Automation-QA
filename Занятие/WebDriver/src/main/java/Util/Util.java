package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Util {
    public static void scrollToElementVisibilityOf(WebDriver driver, By by) {//метод который скролит до элемента
        JavascriptExecutor js = (JavascriptExecutor) driver;

        boolean bool = false;



        while (!bool) {//цикл проверяет есть ли элемент, если не находит скролит до тех пор пока не найдет этот элемент
            try {
                driver.findElement(by);
                bool = true;
                js.executeScript("window.scrollBy(0,400)");
            } catch (Exception ignore) {
                js.executeScript("window.scrollBy(0,400)");

            }
        }
    }
}