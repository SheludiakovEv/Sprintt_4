import org.junit.Test;
import ru.qaScooter.praktikumServices.HomeLocator;
import ru.qaScooter.praktikumServices.PageObjectListOne;
import ru.qaScooter.praktikumServices.PageObjectListTwo;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class TopButtonOrderTest extends BaseTest {

@Test  //Тест верхней кнопки "Заказать" с первыми данными.
    public void TopButtonOrder() {

    PageObjectListOne pageObject = new PageObjectListOne(driver);
    PageObjectListTwo pageObjectListTwo = new PageObjectListTwo(driver);
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
    boolean result = driver.findElement(pageObjectListTwo.finishModalWindow).isDisplayed();
    assertTrue(result);
}

@Test   //Тест нижней кнопки "Заказать" со вторыми данными
    public void lowButtonOrder() {

    HomeLocator homeLocator = new HomeLocator(driver);

        PageObjectListOne pageObject = new PageObjectListOne(driver);
        PageObjectListTwo pageObjectListTwo = new PageObjectListTwo(driver);
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
        boolean result = driver.findElement(pageObjectListTwo.finishModalWindow).isDisplayed();
        assertTrue(result);


    }
           
}


