package tests.day17;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_YanlisKeyKullanımı {

    @Test
    public void test01(){

        //Driver.getDriver().get(ConfigReader.getProperty("HMCurl"));  "HMCUrl" yerine "HMCurl" yazdık.

        //Eğer key olarak girdiğimiz String configreader dosyasında yoksa
        //configreader o keyi bulamaz ve
        //NullPointerException fırlatır.


       //SİNGLETON PATTERN:KABUL GÖRMÜŞ PATERNDİR.
        //AMAÇ BİR CLASS TAN  BİRDEN FAZLA OBJE ÜRETİLMESİNİN ÖNÜNE GEÇER!!!
        //SİGLETON PATERN İLE KOTUYACAĞIMIZ CLASSTA PARAMETRESİZ VİR CONSTRUCTOR OLUŞTURUR VE
        //OLUŞTURDUĞUMUZ COSTRUCTOR U PRİVATE YAPARIZ!!!!
    }
}
