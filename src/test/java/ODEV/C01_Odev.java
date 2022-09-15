package ODEV;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Odev {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //sayfa baslıgini (title) yazdırın
        System.out.println("title :"+ driver.getTitle());

        //sayfa basliginin "Amazon" icerdigini test edin
        if (driver.getTitle().contains("Amazonn")){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        //ternary ile: System.out.println(driver.getTitle().contains("Amazonn")? "title testi passed" : "title testi faild");


        //sayfa adresini (url) yazdırın
        System.out.println(driver.getCurrentUrl());

        //sayfa adresinin (url) "amazon" içerdiğini test edin
        System.out.println(driver.getCurrentUrl().contains("amazonn")? "url testi passed" : "url testi faild"); //ternary ile

        //sayfanın handle değerini yazdırın
        System.out.println(driver.getWindowHandle());

        //saydanın HTML kodlarında "Gateway" kelimesinin geçip geçmediğini test edin
        String arananKelime= "Gateway";
        if (driver.getPageSource().contains("Gateway")){
            System.out.println("içeriyor");
        }else System.out.println("içermiyor");

        //sayfayı kapatın
        driver.close();




    }

}
