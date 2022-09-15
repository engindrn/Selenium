package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //amazon sayfasına gidelim
        driver.get("https://wwww.amazon.com");

        //sayfanın konumunu ve boyutlarını yazdırın
        System.out.println("SAYFANIN KONUMU :"+ driver.manage().window().getPosition());
        System.out.println("SAYFANIN BOYUTLARI :"+driver.manage().window().getSize());

        //sayfanın konumunu ve boyutunu istediğimiz gibi ayarlayalım
        driver.manage().window().setPosition(new Point(20,20));
       driver.manage().window().setSize(new Dimension(600,300));

       //sayfanının yeni boyutunu test edin
        System.out.println("sayfanın yeni konumu :"+driver.manage().window().getPosition());
        System.out.println("sayfanın yeni boyutları :"+driver.manage().window().getSize());

        //KAPAT
        Thread.sleep(3000);
        driver.close();


    }
}
