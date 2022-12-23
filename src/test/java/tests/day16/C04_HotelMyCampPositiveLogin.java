package tests.day16;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_HotelMyCampPositiveLogin {

    @Test
    public void pozitifTesti(){
        //https://www.hotelmycamp.com/ adresine gidin.
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.guvenligiGec1.click();
        hotelMyCampPage.guvenligiGec2.click();

        //Login butonuna bas
        hotelMyCampPage.ilkLoginLinki.click();

        //test data username=manager
        hotelMyCampPage.userNameBox.sendKeys("manager");

        //test data password= Manager1!
        hotelMyCampPage.passwordBox.sendKeys("Manager1!");


        //Değerleri girildiğinde sayfaya başarılı bir şekilde girilebildiğini test et.
        hotelMyCampPage.LoginButonu.click();

    }
}
