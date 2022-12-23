package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverİlkTest {

    //Driver classı sayesinde bizim eski driver was killed
    //Artık driver a ihtiyacımız varsa Driver.getDriver() yazacağız.

    @Test
    public void test01(){

        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");

        //amazona gittiğimizi test edelim.
        String actualTitle=Driver.driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));

        //Driver.getDriver methodu her çalıştığında
        //driver=new ChromeDriver()' komutundan ötürü yeni bir driver oluşturuyor.
        //Biz Driver class tan getDriver ı ilk çalıştırdığımızda new ataması olsun
        //sonraki çalıştırmalarda atama OLMASIN istiyoruz.
        //Bunun için; driver=new ChromeDrive(); bu satırı bir if bloğu içine alacağız.
        Driver.closeDriver();

    }
    @Test
    public void test02(){
        //bestbuya gidelim
        Driver.getDriver().get("https://www.bestbuy.com");

        //bestbuya gittiğimizi test edelim.
        String url=Driver.driver.getCurrentUrl();
        Assert.assertTrue(url.contains("bestbuy"));

        Driver.closeDriver();
    }

}
