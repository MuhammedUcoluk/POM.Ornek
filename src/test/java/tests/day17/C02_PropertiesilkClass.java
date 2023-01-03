package tests.day17;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesilkClass {

    @Test
    public void positiveLoginTest() throws InterruptedException {
        //Hotelmycamp sitesine positive login testini poma tam uygun olarak yapınız.
        //https://hotelmycamp.com/ adresine gidin.
       // Driver.getDriver().get("buraya properties dosyasından hotelmycamp e karşılık gelen değeri getir.");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.gelismisSekmesiElementi.click();
        hotelMyCampPage.siteyeilerleSekmesiElementi.click();

        //Login butonuna bas
        hotelMyCampPage.ilkLoginLinki.click();

        //username=manager
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

        //password=Manager1!
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));


        //Değerler girildiğinde sayfaya başarılı bir şekilde girildiğini test edin.
        hotelMyCampPage.loginLinki.click();
        hotelMyCampPage.basariliGiris.isDisplayed();

        Driver.closeDriver();

    }

}
