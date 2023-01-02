package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTesti {

    @Test
    public void positiveLoginTest(){
        //hotelmycampe git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.gelismisSekmesiElementi.click();
        hotelMyCampPage.siteyeilerleSekmesiElementi.click();

        //logine bas
        hotelMyCampPage.ilkLoginLinki.click();

        //usename:manager
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

        //password: Manager1!
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginLinki.click();

        //Sayfaya başarılı girildiğini test et.
        Assert.assertTrue(hotelMyCampPage.basariliGiris.isDisplayed());

        Driver.closeDriver();
    }

}

