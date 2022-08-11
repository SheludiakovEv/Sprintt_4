package ru.qaScooter.praktikumServices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomeLocator {


    public HomeLocator(WebDriver driver) {
        this.driver = driver;

    }

    private WebDriver driver;

    //Локатор до которого скроллить. Группа текста "Вопросы о важном"
    private final By skrollQuestionsDiv = By.xpath(".//div[starts-with(@class,'Home_FourPart')]/div[starts-with(@class,'Home_SubHeader')]");

    //Блок FAQ

    //Вопрос 1
    private final By buttonFirstQuestion = By.xpath("//*[@id=\"accordion__heading-0\"]"); //Первый вопрос в блоке Вопросы о важном
    public String expectedFirstQuestionText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";//ОЖ текст первого вопроса.


    //Вопрос 2
    private final By buttonSecondQuestion = By.xpath("//*[@id=\"accordion__heading-1\"]"); //Второй вопрос
    public String expectedSecondQuestionText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."; //ОЖ текст 2 вопроса

    //Вопрос 3
    private final By buttonThirdQuestion = By.id("accordion__heading-2"); //Клик третий вопрос
    public String expectedThirdQuestionText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."; //ОЖ текст 3 вопроса

    //Вопрос 4
    private final By buttonFourthQuestion = By.id("accordion__heading-3"); //Клик четвертый вопрос
    public String expectedFourthQuestionText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее."; //ОЖ текст 4-го вопроса

    //Вопрос 5
    private final By buttonFifthQuestion = By.xpath("//*[@id=\"accordion__heading-4\"]"); //клик по пятому вопросу
    public String expectedFifthQuestionText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."; //ОЖ текст 5-го вопроса

    //Вопрос 6
    private final By buttonSixthQuestion = By.id("accordion__heading-5"); //Клик по шестому вопросу
    public String expectedSixthQuestionText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."; //ОЖ текст 6-го вопроса

    //Вопрос 7
    private final By buttonSeventhQuestion = By.id("accordion__heading-6"); //Клик по седьмому вопросу
    public String expectedSeventhQuestionText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."; //ОЖ текст 7-го вопроса

    //Вопрос 8
    private final By buttonEightQuestion = By.id("accordion__heading-7"); //лик по восьмому вопросу
    public String expectedEightQuestionText = "Да, обязательно. Всем самокатов! И Москве, и Московской области."; //ОЖ текст 8-го вопроса







    //Методы для использования в тестах
    public void scrollToimportantQuestionsDiv() { //скроллю до элемента FAQ
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(skrollQuestionsDiv));
    }

    public void openPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");  //Открываем ссылку приложения
    }

    public void clickButtonFirstQuestion() {    //Кликаем по первому вопросу
        driver.findElement(buttonFirstQuestion).click();
    }

    public void clickButtonSecondQuestion() {   //Кликаем по второму вопросу
        driver.findElement(buttonSecondQuestion).click();
    }

    public void clickButtonThirdQuestion() {  //Кликаем по третьему вопросу
        driver.findElement(buttonThirdQuestion).click();
    }

    public void clickButtonFourthQuestion() {  //Кликаем по четвертому вопросу
        driver.findElement(buttonFourthQuestion).click();
    }

    public void clickButtonFifthQuestion() {  //Кликаем по пятому вопросу
        driver.findElement(buttonFifthQuestion).click();
    }

    public void clickButtonSixthQuestion() {  //Кликаем по шестому вопросу
        driver.findElement(buttonSixthQuestion).click();
    }

    public void clickButtonSeventhQuestion() {  //Кликаем по седьмому вопросу
        driver.findElement(buttonSeventhQuestion).click();
    }

    public void clickButtonEightQuestion() {  //Кликаем по восьмому вопросу
        driver.findElement(buttonEightQuestion).click();
    }


}
