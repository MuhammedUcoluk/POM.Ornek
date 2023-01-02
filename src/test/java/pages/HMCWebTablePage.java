package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HMCWebTablePage {
    public HMCWebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//thead//tr[1]//th")
    public List<WebElement> headerBirinciSatirDatalar;

    @FindBy(xpath = "//tbody")
    public WebElement tumBodyWebElementi;

    @FindBy(xpath = "//tbody//td")
    public List<WebElement> tumBodyDatalariList;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> satirlarListesi;

    public WebElement satirYazdir(int satirNo){

        String satirDinamikXpath="//tbody//tr["+satirNo+"]";
        WebElement satirElementi= Driver.getDriver().findElement(By.xpath(satirDinamikXpath));

        return satirElementi;
    }


    public String hucreWebelementGetir(int satir, int sutun) {
        String dinamikHucreXpathi="//tbody//tr["+ satir +"]//td["+ sutun +"]";
        WebElement isteneHucreElementi=Driver.getDriver().findElement(By.xpath(dinamikHucreXpathi));
        String hucreDatasi= isteneHucreElementi.getText();

        //2.satırın 4. datası = //tbody//tr[2]//td[4]
        //4.satırın 5. datası = //tbody//tr[4]//td[5]
        return hucreDatasi;
    }

    public void sutunYazdir(int sutun) {
        //her bir satırdaki istene sütun elementini yazdırabilmek için önce satır sayısını bilmeye
        //ihtiyacım var.

        int satirSayisi=satirlarListesi.size();

        for (int i=1;i<satirSayisi ; i++){
            System.out.println(hucreWebelementGetir(i,sutun));
        }
    }
}
