package ru.qascooter.praktikumservices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeLocator {


    public HomeLocator(WebDriver driver) {
        this.driver = driver;

    }

    private WebDriver driver;

    //Локатор до которого скроллить. Группа текста "Вопросы о важном"

    @FindBy(xpath = ".//div[starts-with(@class,'Home_FourPart')]/div[starts-with(@class,'Home_SubHeader')]")  //скролл до нужного элемента
    private WebElement skrollQuestionsDiv;

    //Блок FAQ

    //Вопрос 1
    @FindBy (xpath = "//*[@id=\"accordion__heading-0\"]")
    private WebElement buttonFirstQuestion; //Первый вопрос в блоке Вопросы о важном
    public String expectedFirstQuestionText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";//ОЖ текст первого вопроса.


    //Вопрос 2
    @FindBy(xpath = "//*[@id=\"accordion__heading-1\"]")
    private WebElement buttonSecondQuestion; //Второй вопрос
    public String expectedSecondQuestionText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."; //ОЖ текст 2 вопроса

    //Вопрос 3
    @FindBy(id = "accordion__heading-2")
    private WebElement buttonThirdQuestion; //Клик третий вопрос
    public String expectedThirdQuestionText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."; //ОЖ текст 3 вопроса

    //Вопрос 4
    @FindBy(id = "accordion__heading-3")
    private WebElement buttonFourthQuestion; //Клик четвертый вопрос
    public String expectedFourthQuestionText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее."; //ОЖ текст 4-го вопроса

    //Вопрос 5
    @FindBy(xpath = "//*[@id=\"accordion__heading-4\"]")
    private WebElement buttonFifthQuestion; //клик по пятому вопросу
    public String expectedFifthQuestionText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."; //ОЖ текст 5-го вопроса

    //Вопрос 6
    @FindBy(id = "accordion__heading-5")
    private WebElement buttonSixthQuestion; //Клик по шестому вопросу
    public String expectedSixthQuestionText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."; //ОЖ текст 6-го вопроса

    //Вопрос 7
    @FindBy(id = "accordion__heading-6")
    private WebElement buttonSeventhQuestion; //Клик по седьмому вопросу
    public String expectedSeventhQuestionText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."; //ОЖ текст 7-го вопроса

    //Вопрос 8
    @FindBy(id = "accordion__heading-7")
    private WebElement buttonEightQuestion; //лик по восьмому вопросу
    public String expectedEightQuestionText = "Да, обязательно. Всем самокатов! И Москве, и Московской области."; //ОЖ текст 8-го вопроса







    //Методы для использования в тестах
    public void scrollToimportantQuestionsDiv() { //скроллю до элемента FAQ
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", skrollQuestionsDiv);
    }

    public void openPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");  //Открываем ссылку приложения
    }

    public void clickButtonFirstQuestion() {    //Кликаем по первому вопросу
        buttonFirstQuestion.click();
    }

    public void clickButtonSecondQuestion() {   //Кликаем по второму вопросу
        buttonSecondQuestion.click();
    }

    public void clickButtonThirdQuestion() {  //Кликаем по третьему вопросу
        buttonThirdQuestion.click();
    }

    public void clickButtonFourthQuestion() {  //Кликаем по четвертому вопросу
        buttonFourthQuestion.click();
    }

    public void clickButtonFifthQuestion() {  //Кликаем по пятому вопросу
        buttonFifthQuestion.click();
    }

    public void clickButtonSixthQuestion() {  //Кликаем по шестому вопросу
        buttonSixthQuestion.click();
    }

    public void clickButtonSeventhQuestion() {  //Кликаем по седьмому вопросу
        buttonSeventhQuestion.click();
    }

    public void clickButtonEightQuestion() {  //Кликаем по восьмому вопросу
        buttonEightQuestion.click();
    }


}
