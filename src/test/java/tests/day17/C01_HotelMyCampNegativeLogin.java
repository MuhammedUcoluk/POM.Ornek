package tests.day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_HotelMyCampNegativeLogin {


    @Test
    public void test01(){
        //HotelMycamp adresine git.
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.guvenligiGec1.click();
        hotelMyCampPage.guvenligiGec2.click();

        //Login click.
        hotelMyCampPage.ilkLoginLinki.click();

        // username: manager1
        hotelMyCampPage.userNameBox.sendKeys("manager1");

        //password: manager1
        hotelMyCampPage.passwordBox.sendKeys("manager1");
        hotelMyCampPage.LoginButonu.click();

        //Değerleri girildiğinde sayfaya girilmediğini test et
        Assert.assertTrue(hotelMyCampPage.girisYapilamadiElementi.isDisplayed());
        Driver.closeDriver();
    }
}
