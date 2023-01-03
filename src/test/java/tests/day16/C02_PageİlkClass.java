package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageİlkClass {
    //Pom da farklı class lara farklı şekilde ulaşılması benimsenmiştir.
    //Driver class ı için static yöntemi
    //Page class ları için obje üzerinden erişim tercih edilmiştir.
    @Test
    public void test01(){
        //Amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");

        //Arama kutusuna Nutella yazıp aratalım
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //Arama sonuçlarının Nutella içerdiğini test edelim.
        String actualSonucStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucStr.contains("Nutella"));

        Driver.closeDriver();

    }
    @Test
    public void test02(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //java için arama yapalım
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("java" + Keys.ENTER);
        //sonucun java içerdiğini test edelim.
        String sonucYazisiStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiStr.contains("java"));

        Driver.closeDriver();

    }
}
