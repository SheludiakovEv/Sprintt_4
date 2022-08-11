package ru.qaScooter.praktikumServices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectListTwo {

    WebDriver driver;

    //Локаторы для второй страницы.
    private final By orderDate = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[1]/div/input"); //Локатор поля даты заказ
    private final By exactDate = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[6]");//конкретная дата 13.08.2022
    private final By exactDate2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[5]"); //конкретная дата 22.08.2022
    private final By rentPeriod = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]"); //поле срок аренды
    private final By rentPeriodInDay = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]"); //срок аренды одни сутки для первого заказа
    private final By rentPeriodInDay2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[4]"); //срок аренды 4 суток для второго заказа
    private final By colorScooterBlack = By.xpath("//*[@id=\"black\"]"); //цвет самоката черный
    private final By colorScooterGrey = By.xpath("//*[@id=\"grey\"]"); //цвет самоката серый
    private final By commentDelivery = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input"); //комеент доставке
    private final By confirmOrderButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]"); //конпка заказа на второй страницу
    private final By buttonYes = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]"); //кноака Да
    public final By finishModalWindow = By.xpath("/html/body/div/div/div[2]/div[5]/div[1]"); //текст модального окна успешного оформления

    public PageObjectListTwo(WebDriver driver){
        this.driver = driver;
    }
    public void clickOrderDate() {   //выбрал конкретную дату доставки самоката
        driver.findElement(orderDate).click();
        driver.findElement(exactDate).click();
    }

    public void clickRentPeriod() {  //выбрал определенный срок аренды
        driver.findElement(rentPeriod).click();
        driver.findElement(rentPeriodInDay).click();
    }

    public void clickColorScooterBlack() { //цвет самоката черный
        driver.findElement(colorScooterBlack).click();
    }

    public void setCommentDelivery(String comment){  //комент
        driver.findElement(commentDelivery).sendKeys(comment);
    }

    public void commentForDelivery(String comment) { //ввод коммента для курьера (он не обязателен, но думаю не помешает))
        setCommentDelivery(comment);
    }

    public void clickConfirmOrderButton() {   //Кликаю заказать
        driver.findElement(confirmOrderButton).click();
    }

    public void clickButtonYes() {   //подтвержадю заказ
        driver.findElement(buttonYes).click();
    }


    //Работа со второй заявкой

    public void clickOrderDate2() {   //выбрал конкретную дату доставки самоката для заказа через нижнюю кнопку
        driver.findElement(orderDate).click();
        driver.findElement(exactDate2).click();
    }


    public void clickColorScooterGrey() { //цвет самоката серый
        driver.findElement(colorScooterGrey).click();
    }

    public void clickRentPeriod2() {  //выбрал определенный срок аренды для второго заказа
        driver.findElement(rentPeriod).click();
        driver.findElement(rentPeriodInDay2).click();
    }

}
