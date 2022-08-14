import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import ru.qascooter.praktikumservices.MainPage;
import ru.qascooter.praktikumservices.OrderPage_Stage1;
import ru.qascooter.praktikumservices.OrderPage_Stage2;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class TopOrderButtonTest extends BaseTest {

    @Test  //Тест верхней кнопки "Заказать" с первыми данными.
    public void TopButtonOrder() {
        OrderPage_Stage1 pageObject = new OrderPage_Stage1(driver);
        PageFactory.initElements(driver, pageObject);

        OrderPage_Stage2 orderPageStage2 = new OrderPage_Stage2(driver);
        PageFactory.initElements(driver, orderPageStage2);
        pageObject.open();
        pageObject.clickTopButtonOrder();
        pageObject.personalDate("Иван", "Петров", "Москва", "79857856543");
        pageObject.clickStationValue();
        pageObject.clickNextButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        orderPageStage2.clickOrderDate();
        orderPageStage2.clickRentPeriod();
        orderPageStage2.clickColorScooterBlack();
        orderPageStage2.commentForDelivery("Привет доставка!");
        orderPageStage2.clickConfirmOrderButton();
        orderPageStage2.clickButtonYes();
        boolean result = orderPageStage2.finishModalWindow.isDisplayed();
        assertTrue(result);
    }

    @Test   //Тест нижней кнопки "Заказать" со вторыми данными
    public void lowButtonOrder() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);

        OrderPage_Stage1 pageObject = new OrderPage_Stage1(driver);
        PageFactory.initElements(driver, pageObject);
        OrderPage_Stage2 orderPageStage2 = new OrderPage_Stage2(driver);
        PageFactory.initElements(driver, orderPageStage2);
        pageObject.open();
        mainPage.scrollToimportantQuestionsDiv();
        pageObject.clickLowButtonOrder();
        pageObject.personalDate("Петр", "Сидоров", "Пермь", "79567845697");
        pageObject.clickStationValueLowButton();
        pageObject.clickNextButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        orderPageStage2.clickOrderDate2();
        orderPageStage2.clickRentPeriod2();
        orderPageStage2.clickColorScooterGrey();
        orderPageStage2.commentForDelivery("Доставка, где самокат?");
        orderPageStage2.clickConfirmOrderButton();
        orderPageStage2.clickButtonYes();
        boolean result = orderPageStage2.finishModalWindow.isDisplayed();
        assertTrue(result);
    }
}


