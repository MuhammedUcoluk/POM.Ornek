package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampPage {

     public HotelMyCampPage(){
         PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//button[@class='secondary-button small-link']")
    public WebElement gelismisSekmesiElementi;

     @FindBy(xpath = "//a[@id='proceed-link']")
    public WebElement siteyeilerleSekmesiElementi;

     @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

     @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

     @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

     @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginLinki;

     @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement basariliGiris;

     @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement basarisizGiris;

     @FindBy(xpath = "//span[text()='Hotel Management']")
     public WebElement hotelManagementLinki;

     @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
     public WebElement hotelListLinki;

     @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
     public WebElement addHotelLinki;

     @FindBy(xpath = "//input[@id='Code']")
     public WebElement addHotelCodeKutusu;

     @FindBy(xpath = "//select[@id='IDGroup']")
     public WebElement addHotelDropDown;

     @FindBy(xpath = "//button[@id='btnSubmit']")
     public WebElement addHotelSaveButonu;

     @FindBy(xpath = "//div[@class='bootbox-body']]")
     public WebElement hotelWasSuccessfullyYazisi;

     @FindBy(xpath = "//button[@class='btn btn-primary']")
     public WebElement okButonu;

    public void girisYap(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        gelismisSekmesiElementi.click();
        siteyeilerleSekmesiElementi.click();
        ilkLoginLinki.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginLinki.click();
    }
}
