package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageilkClass {

    //POM da farklı classlara farklı şekilde ulaşılması benimsenmiştir.
    //Driver classı için static yöntemi kullanıyoruz.
    //Page class ları için obje üzerinden erişilmesi tercih edilmiştir.
    @Test
    public void test01(){
        //amazona gidelim.
        Driver.getDriver().get("https://www.amazon.com");

        //arama kutusuna "Nutella" yazıp aratalım.
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //Arama sonuçlarının "Nutella içerdiğini test edelim.
        String actualSonucStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucStr.contains("Nutella"));
    }
    @Test
    public void test02(){
        //amazona gidelim.
        Driver.getDriver().get("https://www.amazon.com");

        //java için arama yapalım
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("java"+Keys.ENTER);

        //sonucun java içerdiğini test edelim.
        String sonucYazisiStr=amazonPage.sonucYazisiElementi.getText();

        Assert.assertTrue(sonucYazisiStr.contains("java"));

        Driver.closeDriver();
    }
}

