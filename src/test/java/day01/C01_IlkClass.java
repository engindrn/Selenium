package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {

         /*
        En temel haliyle bir otomasyon yapmak için
        Class'ımıza otomasyon için gerekli olan webdriver'in yerini göstermemiz gerekir
        bunun için java kutuphanesinde System.setProperty() method'unu kullanırız
        ve metthod'un içine ilk olarak driver'i yazarız. İkinci olarak onun fiziki yolunu kopyalarız
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");   //driver i tanımladık

        WebDriver driver= new ChromeDriver();  // kütüphaneyi tanımayıp import ettik .obje oulşturduk
                                              //pencere açıldı

        //////////////////////////////////////////////////////////////////////////////////////////////////////

        driver.get("https://www.amazon.com");

        System.out.println("Actual Title :" + driver.getTitle());   //sayfa başlığı String olr. gelen datayı direk yazdırdık

        String tile= driver.getTitle();                            //title i variable atayıp sonra yazdırdık
        System.out.println("başlik :"+ tile);

        System.out.println("Actual URL : "+ driver.getCurrentUrl()); //gidilen sayfanın url ini String olr getirir

        System.out.println(driver.getPageSource());         // gidilen sayfanın kaynak kodlarını String olr getirir

    }
}
