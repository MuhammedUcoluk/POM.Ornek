package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {

    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//button[@id='details-button']" )
    public WebElement guvenligiGec1;

    @FindBy(xpath = "//a[@id='proceed-link']")
    public WebElement guvenligiGec2;

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public  WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement LoginButonu;

    @FindBy(xpath = "//span[text()='Try again please']")
    public WebElement girisYapilamadiElementi;
}
