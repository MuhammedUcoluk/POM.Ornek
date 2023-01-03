package tests.day16;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_HotelMyCampPositiveLogin {

    @Test(groups = {"miniRegression", "smoke"})
    public void pozitifLogin() throws InterruptedException {

        //https://hotelmycamp.com/ adresine gidin.
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        Thread.sleep(5000);
        hotelMyCampPage.gelismisSekmesiElementi.click();
        hotelMyCampPage.siteyeilerleSekmesiElementi.click();

        //Login butonuna bas
        hotelMyCampPage.ilkLoginLinki.click();

        //username=manager
        hotelMyCampPage.usernameBox.sendKeys("manager");

        //passwprd=Manager1!
        hotelMyCampPage.passwordBox.sendKeys("Manager1!");
        hotelMyCampPage.loginLinki.click();

        //Değerler girildiğinde sayfaya başarılı bir şekilde girildiğini test edin.
        Assert.assertTrue(hotelMyCampPage.basariliGiris.isDisplayed());

        Driver.closeDriver();
    }
}
