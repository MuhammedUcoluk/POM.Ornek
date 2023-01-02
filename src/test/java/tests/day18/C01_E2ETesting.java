package tests.day18;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_E2ETesting {
    @Test
    public void createHotel() throws InterruptedException {

        //hotelmycampe git
        //Username ve password locate edin ve aşağıdaki verileri girin
        //usarname : manager
        //password : Manager1!
        //Logine tıklayın
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();

        //Hotel management/Hotel List menüsünden Add Hotel menüsüne tıklayın
        Thread.sleep(3000);
        hotelMyCampPage.hotelManagementLinki.click();
        hotelMyCampPage.hotelListLinki.click();
        hotelMyCampPage.addHotelLinki.click();

        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.

        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(hotelMyCampPage.addHotelCodeKutusu)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        Select select=new Select(hotelMyCampPage.addHotelDropDown);
        select.selectByVisibleText("Hotel Type2");


        //Save butonuna tıklayın
        hotelMyCampPage.addHotelSaveButonu.click();

        //"Hotel was inserted successfully" textinin göründüğünü test edin.
         Assert.assertTrue(hotelMyCampPage.hotelWasSuccessfullyYazisi.isDisplayed());

        //Ok butonunu tuşlayın.
        hotelMyCampPage.okButonu.click();

        Driver.closeDriver();

    }
}
