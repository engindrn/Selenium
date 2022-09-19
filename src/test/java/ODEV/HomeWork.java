package ODEV;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //facebook a git ve title ın "facebook" olduğunu  doğrulayın (verify),değilse doğru başlığı yazdırın
        driver.navigate().to("https://www.facebook.com");
        String actualTitle =driver.getTitle();
        String expectedTitle= "facebook";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("test passad");
        }else System.out.println(actualTitle);

        //url "facebook" kelimesi içerdiğini doğrulayın, içermiyorsa "actual" url i yazdırın
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl= "facebook";
        if(actualUrl.contains(expectedUrl)){
            System.out.println("test passed");
        }else System.out.println(actualUrl);

        //https://www.walmart.com sayfasına gidin
        driver.navigate().to("https://www.walmart.com");

        //başlığın "Walmart.com" içrediğini doğrulayın
        if (driver.getTitle().contains("Walmart.com")){
            System.out.println("walmart passed");
        }else System.out.println(driver.getTitle());

        //facebook a dönün
        driver.navigate().back();

        //yenileyin
        driver.navigate().refresh();

        //kapat
        driver.close();


    }
}
