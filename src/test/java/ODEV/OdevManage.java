package ODEV;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OdevManage {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //amazona git
        driver.get("https://www.amazon.de");

        //sayfanın konumu ve boyutlarını yazıdır
        System.out.println("kordinatları :"+driver.manage().window().getPosition());
        System.out.println("boyutları :"+driver.manage().window().getSize());

        //simge durumuna getir
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //maximize yap
        driver.manage().window().maximize();

        //fullscreen yap
        driver.manage().window().fullscreen();

        //konumu ve boyutu yazdır
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //kapat
        driver.close();


    }

}
