package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodları {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");                             //önce amazona gittik
        //driver.navigate().to() methodu sayfada ileri geri yapacaksak kullanılır
        //driver.get() methodu gibi bizi istenilen sayfaya götürür
        Thread.sleep(3000);
        driver.navigate().to("https://www.techproeducation.com");                   //techproyı açtık

        Thread.sleep(3000);

        driver.navigate().back();                                                      //tekrar amazona döndük


        // tekrar techpro sayfasına gidelim                                           //techproya döndük
        Thread.sleep(3000);
        driver.navigate().forward();

        //techpro sayfasını yenileyelim                                              //techpro sayfasını yeniledik
        Thread.sleep(3000);
        driver.navigate().refresh();

        driver.close();                                                             //kapattık
    }
}
