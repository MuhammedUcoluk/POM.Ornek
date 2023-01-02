package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverİlkTest {

    //Driver class ı sayesinde eski driver öldü
    //Artık driver a ihtiyaç varsa Driver.getDriver() yazacağız.

    @Test
    public void test01(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //amazona gittiğimizi test edelim.
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));

        //Driver.getDriver methodu her çalıştığında
        //driver=new chromedriver komutundan ötürü yeni bir driver oluşturuyor.
        //Biz driver classından getdriver i ilk çalıştırdığımızda new ataması olsun
        //Sonraki çalıştırmalarda atama olmasın istiyoruz.
        //Bunun için driver=new diriver satırını bir if bloğu içine alacağız.
        Driver.closeDriver();
    }
    @Test
    public void test02(){
        //bestbuy anasayfaya gidelim.
        Driver.getDriver().get("https://www.bestbuy.com");

        //bestbuya gittiğimizi test edelim.
        String url=Driver.driver.getCurrentUrl();
        Assert.assertTrue(url.contains("bestbuy"));

        Driver.closeDriver(); //closeDriver ı istediğin yere koyabilirsin.
    }
}
