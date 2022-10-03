package ODEV;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class OdevLoginTet {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://a.testaddressbook.com");

        driver.findElement(By.id("sign-in")).click();

        driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");

        driver.findElement(By.id("session_password")).sendKeys("Test1234!");

        driver.findElement(By.name("commit")).click();

        String actualUrl=driver.getCurrentUrl();

        if(actualUrl.contains("tesrttecproed@gmail.com/")){
            System.out.println("test passt");
        }else System.out.println("test faild");

        WebElement adresses= driver.findElement(By.linkText("Addresses"));
        if (adresses.isDisplayed()){
            System.out.println("adresses test passd");
        }else System.out.println("adresses test faild");

        WebElement singOut= driver.findElement(By.linkText("Sign out"));
        if (singOut.isDisplayed()){
            System.out.println("singout test passd");
        }else System.out.println("singout test faild");


        //sayfada kaç link old bulun
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a")); //linklerin tag nameleri a oldugu için
        System.out.println("Linklerin sayisi :"+linklerListesi.size());        //liste attığımız değerilerin sayısını aldık

        for (WebElement w:linklerListesi) {
            System.out.println(w.getText());
        }
        /*listemiz webElementlerden oluştuğu için direk yazdırırsak referansları yazdırır
        onun yerine for each loop yapıp her bir link elementinin üstündeli yazıyı getText() methodu ile alıp yazdırmalıyız
        */


        }
    }
