
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import ru.qascooter.praktikumservices.HomeLocator;

import static org.junit.Assert.assertEquals;

public class SeleniumTestQuestions extends BaseTest {


    @Test
    public void testFirstQuestion() {

        HomeLocator homeLocator = new HomeLocator(driver);
        PageFactory.initElements(driver, homeLocator);
        homeLocator.openPage();  //открыл страницу приложения
        homeLocator.scrollToimportantQuestionsDiv(); //скролл до элемента

        homeLocator.clickButtonFirstQuestion();  //кликает в тесте по перовму вопросу
        String firstQuestionText = driver.findElement(By.id("accordion__panel-0")).getText(); //Текст первого вопроса
        assertEquals( homeLocator.expectedFirstQuestionText, firstQuestionText); //сравнивает текст

    }

    @Test
    public void testSecondQuestion() {

        HomeLocator homeLocator = new HomeLocator(driver);
        PageFactory.initElements(driver, homeLocator);
        homeLocator.openPage();
        homeLocator.scrollToimportantQuestionsDiv();


        homeLocator.clickButtonSecondQuestion();  //кликает в тесте по второму вопросу
        String secondQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-1\"]/p")).getText(); //Текст 2 элемента
        assertEquals(homeLocator.expectedSecondQuestionText, secondQuestionText);// сравнивает текст
        }

    @Test
    public void testThirdQuestion() {

        HomeLocator homeLocator = new HomeLocator(driver);
        PageFactory.initElements(driver, homeLocator);
        homeLocator.openPage();
        homeLocator.scrollToimportantQuestionsDiv();

        homeLocator.clickButtonThirdQuestion();  //кликает в тесте по третьему вопросу
        String thirdQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-2\"]/p")).getText();  //Текст 3 вопроса
        assertEquals(homeLocator.expectedThirdQuestionText, thirdQuestionText);
    }



    @Test
    public void testFourthQuestion() {

        HomeLocator homeLocator = new HomeLocator(driver);
        PageFactory.initElements(driver, homeLocator);
        homeLocator.openPage();
        homeLocator.scrollToimportantQuestionsDiv();

        homeLocator.clickButtonFourthQuestion();  //кликает в тесте по четвертом вопросу
        String fourthQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-3\"]/p")).getText();   //текст 4 вопроса
        assertEquals(homeLocator.expectedFourthQuestionText, fourthQuestionText);

    }

    @Test
    public void testFifthQuestion() {
        HomeLocator homeLocator = new HomeLocator(driver);
        PageFactory.initElements(driver, homeLocator);
        homeLocator.openPage();
        homeLocator.scrollToimportantQuestionsDiv();


        homeLocator.clickButtonFifthQuestion();  //кликает в тесте по пятому вопросу
        String fifthQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-4\"]/p")).getText();  //Текст 5 вопроса
        assertEquals(homeLocator.expectedFifthQuestionText, fifthQuestionText);

    }

    @Test
    public void testSixthQuestion() {
        HomeLocator homeLocator = new HomeLocator(driver);
        PageFactory.initElements(driver, homeLocator);
        homeLocator.openPage();
        homeLocator.scrollToimportantQuestionsDiv();

        homeLocator.clickButtonSixthQuestion();  //кликает в тесте по шестому вопросу
        String sixthQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-5\"]/p")).getText();  //Текст 6 вопроса
        assertEquals(homeLocator.expectedSixthQuestionText, sixthQuestionText);

    }

    @Test
    public void testSeventhQuestion() {
        HomeLocator homeLocator = new HomeLocator(driver);
        PageFactory.initElements(driver, homeLocator);
        homeLocator.openPage();
        homeLocator.scrollToimportantQuestionsDiv();

        homeLocator.clickButtonSeventhQuestion();  //кликает в тесте по седьмому вопросу
        String seventhQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-6\"]/p")).getText();  //Текст 7 вопроса
        assertEquals(homeLocator.expectedSeventhQuestionText, seventhQuestionText);

    }



    @Test
    public void testEightQuestion() {
        HomeLocator homeLocator = new HomeLocator(driver);
        PageFactory.initElements(driver, homeLocator);
        homeLocator.openPage();
        homeLocator.scrollToimportantQuestionsDiv();

        homeLocator.clickButtonEightQuestion();  //кликает в тесте по восьмому вопросу
        String eightQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-7\"]/p")).getText();  //Текст 8 вопроса
        assertEquals(homeLocator.expectedEightQuestionText, eightQuestionText); //сравнение

    }
}
