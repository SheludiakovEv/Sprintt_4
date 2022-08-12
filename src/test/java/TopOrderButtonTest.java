import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import ru.qascooter.praktikumservices.HomeLocator;
import ru.qascooter.praktikumservices.PageObjectListOne;
import ru.qascooter.praktikumservices.PageObjectListTwo;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class TopOrderButtonTest extends BaseTest {

@Test  //Тест верхней кнопки "Заказать" с первыми данными.
    public void TopButtonOrder() {

    PageObjectListOne pageObject = new PageObjectListOne(driver);
    PageFactory.initElements(driver, pageObject);
    PageObjectListTwo pageObjectListTwo = new PageObjectListTwo(driver);
    PageFactory.initElements(driver, pageObjectListTwo);
    pageObject.open();
    pageObject.clickTopButtonOrder();
    pageObject.personalDate("Иван", "Петров", "Москва", "79857856543");
    pageObject.clickStationValue();
    pageObject.clickNextButton();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    pageObjectListTwo.clickOrderDate();
    pageObjectListTwo.clickRentPeriod();
    pageObjectListTwo.clickColorScooterBlack();
    pageObjectListTwo.commentForDelivery("Привет доставка!");
    pageObjectListTwo.clickConfirmOrderButton();
    pageObjectListTwo.clickButtonYes();
    boolean result = pageObjectListTwo.finishModalWindow.isDisplayed();
    assertTrue(result);
}

@Test   //Тест нижней кнопки "Заказать" со вторыми данными
    public void lowButtonOrder() {

    HomeLocator homeLocator = new HomeLocator(driver);
    PageFactory.initElements(driver, homeLocator);

        PageObjectListOne pageObject = new PageObjectListOne(driver);
        PageFactory.initElements(driver, pageObject);
        PageObjectListTwo pageObjectListTwo = new PageObjectListTwo(driver);
        PageFactory.initElements(driver, pageObjectListTwo);
        pageObject.open();
        homeLocator.scrollToimportantQuestionsDiv();
        pageObject.clickLowButtonOrder();
        pageObject.personalDate("Петр", "Сидоров", "Пермь", "79567845697");
        pageObject.clickStationValueLowButton();
        pageObject.clickNextButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pageObjectListTwo.clickOrderDate2();
        pageObjectListTwo.clickRentPeriod2();
        pageObjectListTwo.clickColorScooterGrey();
        pageObjectListTwo.commentForDelivery("Доставка, где самокат?");
        pageObjectListTwo.clickConfirmOrderButton();
        pageObjectListTwo.clickButtonYes();
        boolean result = pageObjectListTwo.finishModalWindow.isDisplayed();
        assertTrue(result);


    }
           
}


