package tests.day17;

import com.github.javafaker.Hobbit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_HotelMyCampNegativeLogin {

    @Test
    public void negatifLoginTesti(){
        //hotelmycamp e gidelim.
        Driver.getDriver().get("https://www.hotelmycamp.com");
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.gelismisSekmesiElementi.click();
        hotelMyCampPage.siteyeilerleSekmesiElementi.click();

        //logine baslaım
        hotelMyCampPage.ilkLoginLinki.click();

        //username : manager1
        hotelMyCampPage.usernameBox.sendKeys("manager1");

        //password : manager1!
        hotelMyCampPage.passwordBox.sendKeys("manager1!");

        //değerler girildiğinde sayfaya girilmediğini test edelim.
        hotelMyCampPage.loginLinki.click();
        Assert.assertTrue(hotelMyCampPage.basarisizGiris.isDisplayed());

        Driver.closeDriver();
    }
}
