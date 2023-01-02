package tests.day19;

import com.google.common.hash.HashingOutputStream;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebtableDinamikLocate {
    //3 test methodu oluşturalım



    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;
    @Test
    public void satirYazdirTesti(){
        //1. method satır numarası verdiğimde bana o dataları yazdırsın

        //2.satır yazdır //tbody//tr[2]
        //7. satır yazdır //tbody//tr[7]
        hotelMyCampPage=new HotelMyCampPage();
        hmcWebTablePage=new HMCWebTablePage();
        hotelMyCampPage.girisYap();
        WebElement ucuncuSatirElementi= hmcWebTablePage.satirYazdir(5);
        System.out.println(ucuncuSatirElementi.getText());

        Driver.closeDriver();

    }
    @Test
    public void hucreGetirTesti(){
        //2. method satır no ve data numarası girdiğimde verdiğim datayı yazdırsın
        hotelMyCampPage=new HotelMyCampPage();
        hmcWebTablePage=new HMCWebTablePage();
        hotelMyCampPage.girisYap();

        //2.satırın 4. datası = //tbody//tr[2]//td[4]
        //4.satırın 5. datası = //tbody//tr[4]//td[5]

        System.out.println("girdriğiniz hüceredeki element :" + hmcWebTablePage.hucreWebelementGetir(3,5));

        Driver.closeDriver();
    }
        @Test
        public void sutunYazdirTesti(){
            hotelMyCampPage=new HotelMyCampPage();
            hmcWebTablePage=new HMCWebTablePage();
            hotelMyCampPage.girisYap();
            //3. sütun verdiğimde bana tüm sütunu yazdırsın
            hmcWebTablePage.sutunYazdir(4);

            Driver.closeDriver();

        }

}
