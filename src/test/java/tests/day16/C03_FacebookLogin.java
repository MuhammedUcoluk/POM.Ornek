package tests.day16;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_FacebookLogin {


    @Test
    public void test01(){
        //facebooka gidin.
        Driver.getDriver().get("https://www.facebook.com");

        //Poma uygun olarak email şifre kutularını ve giriş yap butonunu locate edin.
        //Faker classını kullanarak email ve şifre değerlerini yazdırıp giriş butonuna basın.
        Faker faker=new Faker();
        FacebookPage facebookPage=new FacebookPage();
        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.passKutusu.sendKeys(faker.internet().password());
        facebookPage.loginButonu.click();

        //başarılı giriş yapıldığını test edin.
        Assert.assertTrue(facebookPage.girilemediYazisiElementi.isDisplayed());

        Driver.closeDriver();
    }
}
