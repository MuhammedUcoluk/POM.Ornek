package tests.day22;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_FacebookTesti extends TestBaseRapor {

    @Test
    public void test01(){
        extentTest=extentReports.createTest("facebook","fake isimle girilemediği test edildi.");
        //facebooka gidin.
        Driver.getDriver().get("https://www.facebook.com");
        extentTest.info("facebook sayfasına gidildi.");

        //Poma uygun olarak email şifre kutularını ve giriş yap butonunu locate edin.
        //Faker classını kullanarak email ve şifre değerlerini yazdırıp giriş butonuna basın.
        Faker faker=new Faker();
        FacebookPage facebookPage=new FacebookPage();
        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.passKutusu.sendKeys(faker.internet().password());
        facebookPage.loginButonu.click();
        extentTest.info("facebook giriş bilgileri faker ile dolduruldu.");
        //başarılı giriş yapıldığını test edin.
        Assert.assertTrue(facebookPage.girilemediYazisiElementi.isDisplayed());
        extentTest.pass("girilemediği test edildi.");
        Driver.closeDriver();
    }
}

