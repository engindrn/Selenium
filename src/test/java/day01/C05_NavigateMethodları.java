package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodları {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //driver.navigate().to() methodu sayfada ileri geri yapacaksak kullanılır
        //driver.get() methodu gibi bizi istenilen sayfaya götürür

        //önce amazona gittik
        driver.navigate().to("https://www.amazon.com");

        //techproyı açtık
        Thread.sleep(3000);
        driver.navigate().to("https://www.techproeducation.com");

        //tekrar amazona döndük
        Thread.sleep(3000);
        driver.navigate().back(); //GELDİĞİ SAYFAYA DÖNER adrese gerek yok


        // tekrar techpro sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().forward();//BACK İLE DÖNÜLEN SAYFADAN TEKRAR GELİR

        //techpro sayfasını yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();

        //KAPAT
        driver.close();
    }
}
