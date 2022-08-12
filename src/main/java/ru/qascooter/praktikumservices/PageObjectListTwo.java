package ru.qascooter.praktikumservices;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectListTwo {

    WebDriver driver;

    //Локаторы для второй страницы.
    @FindBy(xpath = ".//input[@placeholder='* Когда привезти самокат']")
    private WebElement orderDate; //Локатор поля даты заказ
    @FindBy(xpath = ".//div[@class='react-datepicker__day react-datepicker__day--013 react-datepicker__day--weekend']")
    private WebElement exactDate;//конкретная дата 13.08.2022
    @FindBy(xpath = ".//div[@class='react-datepicker__day react-datepicker__day--022'] ")
    private WebElement exactDate2; //конкретная дата 22.08.2022
    @FindBy(className = "Dropdown-placeholder")
    private WebElement rentPeriod; //поле срок аренды
    @FindBy(xpath = ".//div[@class='Dropdown-option'][1]")
    private WebElement rentPeriodInDay; //срок аренды одни сутки для первого заказа
    @FindBy(xpath = ".//div[@class='Dropdown-option'][4]")
    private WebElement rentPeriodInDay2; //срок аренды 4 суток для второго заказа
    @FindBy(xpath = "//*[@id=\"black\"]")
    private WebElement colorScooterBlack; //цвет самоката черный
    @FindBy(xpath = "//*[@id=\"grey\"]")
    private WebElement colorScooterGrey; //цвет самоката серый
    @FindBy(xpath = ".//input[@placeholder='Комментарий для курьера']")
    private WebElement commentDelivery; //коммент доставке
    @FindBy(xpath = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private WebElement confirmOrderButton; //конпка заказа на второй страницу
    @FindBy(xpath = ".//div[@class='Order_Modal__YZ-d3']//button[2]")
    private WebElement buttonYes; //кноака Да
    @FindBy(xpath = ".//div[@class = 'Order_ModalHeader__3FDaJ']")
    public WebElement finishModalWindow; //текст модального окна успешного оформления

    public PageObjectListTwo(WebDriver driver){
        this.driver = driver;
    }
    public void clickOrderDate() {   //выбрал конкретную дату доставки самоката
        orderDate.click();
        exactDate.click();
    }

    public void clickRentPeriod() {  //выбрал определенный срок аренды
        rentPeriod.click();
        rentPeriodInDay.click();
    }

    public void clickColorScooterBlack() { //цвет самоката черный
        colorScooterBlack.click();
    }

    public void setCommentDelivery(String comment){  //комент
        commentDelivery.sendKeys(comment);
    }

    public void commentForDelivery(String comment) { //ввод коммента для курьера (он не обязателен, но думаю не помешает))
        setCommentDelivery(comment);
    }

    public void clickConfirmOrderButton() {   //Кликаю заказать
        confirmOrderButton.click();
    }

    public void clickButtonYes() {   //подтвержадю заказ
        buttonYes.click();
    }


    //Работа со второй заявкой

    public void clickOrderDate2() {   //выбрал конкретную дату доставки самоката для заказа через нижнюю кнопку
        orderDate.click();
        exactDate2.click();
    }


    public void clickColorScooterGrey() { //цвет самоката серый
        colorScooterGrey.click();
    }

    public void clickRentPeriod2() {  //выбрал определенный срок аренды для второго заказа
        rentPeriod.click();
        rentPeriodInDay2.click();
    }

}
