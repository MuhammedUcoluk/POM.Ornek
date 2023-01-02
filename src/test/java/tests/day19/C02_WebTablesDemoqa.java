package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebTablesDemoqa {

    @Test
    public void demoqaTest(){
        //1. "https://www.demoqa.com/webtables/ sayfasına gidin.
        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));

        DemoqaPage demoqaPage=new DemoqaPage();
        //2. Headers te bulunan department isimlerini yazdırın
        //normalde //thead//th olurdu ancak bu sayfa class isimleri ile organize edilmiş.
        System.out.println("baslik satiri elementi :" + demoqaPage.baslikSatiriElemeti.getText());
        //ikinci Yöntem olarak; Basşlıkları bir listeye koyabiliriz.

        //3. üçüncü Sutunun başlığını yazdırın.
        System.out.println("3'üncü sutun başlığı : " + demoqaPage.basliklarWebElementiListesi.get(2).getText());

        //4. Tablodaki tüm dataları yazdırın.
        System.out.println("======Tum Body====== : "+ demoqaPage.bodyTekWebElement );

        //5. tabloda kaç cell(data) olduğunu yazdırın.
        System.out.println("Tablodaki data sayisi : " + demoqaPage.tumDataWebElement.size());

        //6. Tablodaki satır sayısını yazdırın.
        System.out.println("Tablodaki Satir sayisi : " + demoqaPage.tumSatirlarWebElementList.size());

        //7. sutun sayısını yazdırın.
        //    farkli yollardan hesaplanabilir ama biz hücre sayisi/satir sayisi yapalım

        System.out.println("Tablodaki sutun sayisi :" +
                demoqaPage.tumDataWebElement.size()/demoqaPage.tumSatirlarWebElementList.size());

        //8. tablodaki 3. kolonu yazdırın.
        demoqaPage.sutunYazdir(3);

        //9. tabloda first name i Kieraa olan kişinin Salary sini yazdırın.
        demoqaPage.ismeGoreMaasYazdir("Kierra");

        //10. page sayfasında bir method oluşturun.Test sayfasından satır ve sutun sayısını girdiğimde
        //bana datayı yazdırsın.
        demoqaPage.hucreYazdir(2,3);

        Driver.closeDriver();
    }
}

