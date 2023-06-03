import Config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW_Consultation_page extends BaseClass {
    public static void main(String[] args) {

        driver.get("https://dnipro.ithillel.ua/");
        WebElement consultationButton = driver.findElement(By.id("btn-consultation-hero"));
        consultationButton.click();

        WebElement nameField = driver.findElement(By.id("input-name-consultation"));
        nameField.sendKeys("Роман");


        WebElement emailField = driver.findElement(By.id("input-email-consultation"));
        emailField.sendKeys("test@gmail.com");


        WebElement phoneField = driver.findElement(By.name("tel"));
        phoneField.sendKeys("95-777-77-77");


        WebElement telegramIcon = driver.findElement(By.xpath(
                "//div[@class='socials-input-triggers']//button[@data-name='tg']"));
        telegramIcon.click();


        WebElement telegramField = driver.findElement(By.xpath(
                "//div[@class='socials-input_item socials-input-item -active']//input[@class='socials-input-item_input input -text']"));
        telegramField.click();
        telegramField.sendKeys("https://t.me/r.kondakov");


        WebElement viberIcon = driver.findElement(By.xpath("//div[@class='socials-input-triggers']//button[@data-name][2]"));
        viberIcon.click();

        WebElement viberField = driver.findElement(By.xpath("//div[@class='socials-input_item socials-input-item -active']//input[@name='db']"));
        viberField.click();
        viberField.sendKeys("+38095-777-77-77");


        WebElement chooseCourse = driver.findElement(By.xpath(
                "//div[@class='form-field_input']//button[@id='listbox-btn-input-course-consultation']"));
        chooseCourse.click();


        WebElement chooseCourseList = driver.findElement(By.xpath("//div[@class='listbox_container']//li[@data-entry-id='129290']"));
        chooseCourseList.click();


        WebElement checkboksConfirm = driver.findElement(By.xpath("//footer[@class='form_footer form-footer']//span[@class='checkbox_checkmark']"));
        checkboksConfirm.click();


//        я закомител это кусок кода, дабы не отправлять каждый раз запрос на консультацию
//        WebElement sendRequest = driver.findElement(By.xpath("//div[@class='form-footer_group']//button[@class='btn btn-submit -submit form-footer_btn']"));
//        sendRequest.click();
//

        //driver.quit();

    }


}
