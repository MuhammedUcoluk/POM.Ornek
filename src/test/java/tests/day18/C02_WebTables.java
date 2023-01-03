package tests.day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

import java.util.List;

public class C02_WebTables {
    HotelMyCampPage hotelMyCampPage;
    HMCWebTablePage hmcWebTablePage;
    @Test
    public void loginT(){
        //login() metodu oluşturun ve oturum açın.
        // Hotelmyccampe gidin admin/HotelRoomAdmin adresine gidin.
        //username:manager
        //password:Manager1!
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
    }
    @Test(dependsOnMethods = "loginT")
    public void table(){
        //table() methodu oluşturun
        //tüm table body sinin boyutunu sütun sayısını bulun/tbody
        //header kısmında birinci satır ve altındaki dataları locate edelim.
        hmcWebTablePage=new HMCWebTablePage();
        List<WebElement> headerDataList=hmcWebTablePage.headerBirinciSatirDatalar;
        System.out.println("tablodaki sütun sayısı :" + headerDataList.size());

        //table deki tüm body i ve başlıkları konsoldan yazdırın
        System.out.println(hmcWebTablePage.tumBodyWebElementi.getText());
        //eğer body yi tek bir webelement olarak locate edersek
        //içindek, tüm datalalrı gettext() ile yazdırabiliriz.
        //ancak bu durumda bu elemntler ayrı ayrı değil
        //body nin içineki tek bir Stringin parçaları olurlar.
        //dolayısı ile bu elementlere tek tek ulaşmamız mümkün olmaz.
        //sadece contains methodu ile body de olup olmadıklarını test edebiliriz.

        //eğer her bir datayı ayrı ayrı almak istersek
        ////tbody//td şeklinde locate edip bir liste atabiliriz.

        List<WebElement>bodyTumDataList=hmcWebTablePage.tumBodyDatalariList;

        System.out.println("body deki data sayisi :" + bodyTumDataList.size());


    }
    @Test(dependsOnMethods = "loginT")
    public void printRows(){


        //printRows() metodu oluşturun//tr
        //table bodysinde bulunan toplam satır(row)sayısını bulun
        ////tbody//tr
        System.out.println(hmcWebTablePage.satirlarListesi.size());

        //table body sinde bulunan satırları(rows) konsolda yazdırın.
        List<WebElement> satirlarWebElementListesi=hmcWebTablePage.satirlarListesi;
        for (WebElement each:satirlarWebElementListesi
             ) {

            System.out.println(each.getText());
        }
        //4. satırdaki elementleri konsolda yazdırın
        System.out.println("4. satır : "+ satirlarWebElementListesi.get(3).getText());


        Driver.closeDriver();

    }


}
