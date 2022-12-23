package tests.day16;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_FacebookLogin {


    @Test
    public void test01() throws InterruptedException {
        //facebook a gidin.
        Driver.getDriver().get("https://facebook.com");

        //POM a uygun olarak email şifre kutularını ve giriş yap butonunu locate edin.
        //====****LOCATE İŞLEMLERİNİ PAGES DA YAPTIK****====

        //Faker class ını kullanarak email ve şifre değerlerini yazdırıp giriş butonuna basın
        FacebookPage facebookPage=new FacebookPage();
        Faker faker=new Faker();
        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.passKutusu.sendKeys(faker.internet().password());
        facebookPage.loginButonu.click();

        //Başarılı giriş yapılmadığını test edin.
        Assert.assertTrue(facebookPage.girilemediYazisiElementi.isDisplayed());


        Thread.sleep(5000);
        Driver.closeDriver();
    }
}
