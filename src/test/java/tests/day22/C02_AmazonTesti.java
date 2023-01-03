package tests.day22;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_AmazonTesti extends TestBaseRapor {
    @Test
    public void test02(){
        extentTest=extentReports.createTest("amazon","amazon sayfasına giderek java aratılıp sonucun java içerdiği test edildi");
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        extentTest.info("amazon sayfasına gidildi.");
        //java için arama yapalım
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("java" + Keys.ENTER);
        extentTest.info("aramaçubuğunda java aratıldı");
        //sonucun java içerdiğini test edelim.
        String sonucYazisiStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiStr.contains("java"));
        extentTest.pass("sonucun java içerdiği test edildi.");

        Driver.closeDriver();

    }
}

