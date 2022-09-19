package ODEV;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OdevNavigate {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //youtube gidiniz
        driver.navigate().to("https://www.youtube.com");

        //amazon a gidiniz
        driver.navigate().to("https://www.amazon.com");

        //youtube dön
        driver.navigate().back();

        //tekrar amazona git
        driver.navigate().forward();

        //sayfayı yenile
        driver.navigate().refresh();

        //kapat
        driver.close();




    }
}
