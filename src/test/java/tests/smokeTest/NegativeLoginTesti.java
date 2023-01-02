package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTesti {
    //hotelmycampe git
    //logine bas
    //3 farklı methodda test yap
    //      - yanlış şifre
    //      -yanlış kullanıcı adı
    //      -yanlış şifre kullanıcı
    //giriş yapılamadığını test et.

    HotelMyCampPage hotelMyCampPage;
    @Test
    public void yanlisSifreTesti() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.gelismisSekmesiElementi.click();
        hotelMyCampPage.siteyeilerleSekmesiElementi.click();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCampPage.loginLinki.click();
        Assert.assertTrue(hotelMyCampPage.basarisizGiris.isDisplayed());
        Driver.closeDriver();
        Thread.sleep(3000);
    }
    @Test
    public void yanlisUsernameTesti() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.gelismisSekmesiElementi.click();
        hotelMyCampPage.siteyeilerleSekmesiElementi.click();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginLinki.click();
        Assert.assertTrue(hotelMyCampPage.basarisizGiris.isDisplayed());
        Driver.closeDriver();
        Thread.sleep(3000);
    }
    @Test
    public void yanlisSifreUsernameTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.gelismisSekmesiElementi.click();
        hotelMyCampPage.siteyeilerleSekmesiElementi.click();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCampPage.loginLinki.click();
        Assert.assertTrue(hotelMyCampPage.basarisizGiris.isDisplayed());
        Driver.closeDriver();

    }
}
