package ru.qaScooter.praktikumServices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectListOne {

        WebDriver driver;

        //Кнопки заказать

        private final By topButtonOrder = By.className("Button_Button__ra12g"); //локатор верхней кнопки Заказать
        private final By lowerButtonOrder = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button");  //локатор нижней кнопки Заказать. Xpath тк есть пробел


        //Локаторы для первой страницы
        private final By onName = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input"); //локатор поля Имя.
        private final By onSurname = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input"); //Локатор поля Фамилия
        private final By onAddress = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input"); //Локатор поля адресс
        private final By fieldOnMetroStation = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div/input"); //Локатор поля станции метро
        private final By stationValue = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[1]/button"); //Значение поля станции Бульвар Рокоссовского (для теста верхней кнопки Заказа)
        private final By stationValue2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[4]/button"); //Значение поля станции Сокольники (для теста нижней кнопки заказа)
        private final By phoneNumber = By.xpath("/html/body/div/div/div[2]/div[2]/div[5]/input"); //Локатор поля телефона
        private final By nextButton = By.xpath("/html/body/div/div/div[2]/div[3]/button"); //Локатор кнопки далее

    public PageObjectListOne(WebDriver driver){
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
            driver.findElement(topButtonOrder).click();
        }

        public void setUsername(String username){   //Ввел имя
            driver.findElement(onName).sendKeys(username);
        }

        public void setOnSurname (String surname){   //Ввел фамилию
            driver.findElement(onSurname).sendKeys(surname);
        }

        public void setOnAddress (String address) {  //ввел адрес
            driver.findElement(onAddress).sendKeys(address);
        }

        public void clickStationValue (){ //кликаю по выпадающему списку Бульвар Рокоссовского
            driver.findElement(fieldOnMetroStation).click();
            driver.findElement(stationValue).click();
        }

        public void setPhoneNumber(String number) { //Вводим номер
            driver.findElement(phoneNumber).sendKeys(number);
        }

        public void clickNextButton() {  //кликаем на кнопку Далее
            driver.findElement(nextButton).click();
        }


        public void personalDate(String username, String surname, String address, String number) {
            setUsername(username);
            setOnSurname(surname);
            setOnAddress(address);
            setPhoneNumber(number);
        }

        //Работа с заявкой в нижней кнопке

         public void clickLowButtonOrder() {   //кликаю на нжнюю кнопку Заказать
           driver.findElement(lowerButtonOrder).click();
         }

         public void clickStationValueLowButton () {  //Клик по нижней кнопке
             driver.findElement(fieldOnMetroStation).click();
             driver.findElement(stationValue2).click();
         }
}
