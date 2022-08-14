
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import ru.qascooter.praktikumservices.MainPage;

import static org.junit.Assert.assertEquals;

public class SeleniumTestQuestions extends BaseTest {

    @Test
    public void testFirstQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();  //открыл страницу приложения
        mainPage.scrollToimportantQuestionsDiv(); //скролл до элемента

        mainPage.clickButtonFirstQuestion();  //кликает в тесте по перовму вопросу
        String firstQuestionText = driver.findElement(By.id("accordion__panel-0")).getText(); //Текст первого вопроса
        assertEquals(mainPage.expectedFirstQuestionText, firstQuestionText); //сравнивает текст
    }

    @Test
    public void testSecondQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();
        mainPage.scrollToimportantQuestionsDiv();


        mainPage.clickButtonSecondQuestion();  //кликает в тесте по второму вопросу
        String secondQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-1\"]/p")).getText(); //Текст 2 элемента
        assertEquals(mainPage.expectedSecondQuestionText, secondQuestionText);// сравнивает текст
    }

    @Test
    public void testThirdQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();
        mainPage.scrollToimportantQuestionsDiv();

        mainPage.clickButtonThirdQuestion();  //кликает в тесте по третьему вопросу
        String thirdQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-2\"]/p")).getText();  //Текст 3 вопроса
        assertEquals(mainPage.expectedThirdQuestionText, thirdQuestionText);
    }

    @Test
    public void testFourthQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();
        mainPage.scrollToimportantQuestionsDiv();

        mainPage.clickButtonFourthQuestion();  //кликает в тесте по четвертом вопросу
        String fourthQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-3\"]/p")).getText();   //текст 4 вопроса
        assertEquals(mainPage.expectedFourthQuestionText, fourthQuestionText);
    }

    @Test
    public void testFifthQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();
        mainPage.scrollToimportantQuestionsDiv();

        mainPage.clickButtonFifthQuestion();  //кликает в тесте по пятому вопросу
        String fifthQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-4\"]/p")).getText();  //Текст 5 вопроса
        assertEquals(mainPage.expectedFifthQuestionText, fifthQuestionText);
    }

    @Test
    public void testSixthQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();
        mainPage.scrollToimportantQuestionsDiv();

        mainPage.clickButtonSixthQuestion();  //кликает в тесте по шестому вопросу
        String sixthQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-5\"]/p")).getText();  //Текст 6 вопроса
        assertEquals(mainPage.expectedSixthQuestionText, sixthQuestionText);
    }

    @Test
    public void testSeventhQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();
        mainPage.scrollToimportantQuestionsDiv();

        mainPage.clickButtonSeventhQuestion();  //кликает в тесте по седьмому вопросу
        String seventhQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-6\"]/p")).getText();  //Текст 7 вопроса
        assertEquals(mainPage.expectedSeventhQuestionText, seventhQuestionText);
    }

    @Test
    public void testEightQuestion() {
        MainPage mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        mainPage.openPage();
        mainPage.scrollToimportantQuestionsDiv();

        mainPage.clickButtonEightQuestion();  //кликает в тесте по восьмому вопросу
        String eightQuestionText = driver.findElement(By.xpath("//*[@id=\"accordion__panel-7\"]/p")).getText();  //Текст 8 вопроса
        assertEquals(mainPage.expectedEightQuestionText, eightQuestionText); //сравнение
    }
}
