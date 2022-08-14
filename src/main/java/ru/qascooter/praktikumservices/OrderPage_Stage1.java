package ru.qascooter.praktikumservices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage_Stage1 {

    WebDriver driver;

    //Кнопки заказать
    @FindBy(className = "Button_Button__ra12g")
    private WebElement topButtonOrder; //локатор верхней кнопки Заказать
    @FindBy(xpath = ".//div[@class='Home_FinishButton__1_cWm']/button")
    private WebElement lowerButtonOrder;  //локатор нижней кнопки Заказать. Xpath тк есть пробел

    //Локаторы для первой страницы
    @FindBy(xpath = ".//input[@placeholder='* Имя']")
    private WebElement onName; //локатор поля Имя.
    @FindBy(xpath = ".//input[@placeholder='* Фамилия']")
    private WebElement onSurname; //Локатор поля Фамилия
    @FindBy(xpath = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private WebElement onAddress; //Локатор поля адресс
    @FindBy(xpath = ".//input[@placeholder='* Станция метро']")
    private WebElement fieldOnMetroStation; //Локатор поля станции метро
    @FindBy(xpath = ".//button[@value='1']")
    private WebElement stationValue; //Значение поля станции Бульвар Рокоссовского (для теста верхней кнопки Заказа)
    @FindBy(xpath = ".//button[@value='4']")
    private WebElement stationValue2; //Значение поля станции Сокольники (для теста нижней кнопки заказа)
    @FindBy(xpath = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private WebElement phoneNumber; //Локатор поля телефона
    @FindBy(xpath = ".//button[@class = \"Button_Button__ra12g Button_Middle__1CSJM\"]")
    private WebElement nextButton; //Локатор кнопки далее

    public OrderPage_Stage1(WebDriver driver) {
        this.driver = driver;
    }

    //Работа с заявкой по верхней кнопке
    public void open() {
        driver.get("https://qa-scooter.praktikum-services.ru");  //Открываем ссылку приложения
    }

    public void loginPageScooter(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTopButtonOrder() {  //Кликнул на кнопку заказа
        topButtonOrder.click();
    }

    public void setUsername(String username) {   //Ввел имя
        onName.sendKeys(username);
    }

    public void setOnSurname(String surname) {   //Ввел фамилию
        onSurname.sendKeys(surname);
    }

    public void setOnAddress(String address) {  //ввел адрес
        onAddress.sendKeys(address);
    }

    public void clickStationValue() { //кликаю по выпадающему списку Бульвар Рокоссовского
        fieldOnMetroStation.click();
        stationValue.click();
    }

    public void setPhoneNumber(String number) { //Вводим номер
        phoneNumber.sendKeys(number);
    }

    public void clickNextButton() {  //кликаем на кнопку Далее
        nextButton.click();
    }

    public void personalDate(String username, String surname, String address, String number) {
        setUsername(username);
        setOnSurname(surname);
        setOnAddress(address);
        setPhoneNumber(number);
    }

    //Работа с заявкой в нижней кнопке

    public void clickLowButtonOrder() {   //кликаю на нжнюю кнопку Заказать
        lowerButtonOrder.click();
    }

    public void clickStationValueLowButton() {  //Клик по нижней кнопке
        fieldOnMetroStation.click();
        stationValue2.click();
    }
}
