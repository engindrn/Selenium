package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class C01_SinifCalismasi {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // Main method oluşturun ve aşağıdaki görevi tamamlayın.
       // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

       // b. Sign in butonuna basin
                // driver.findElement(By.id("sign-in")).click();  bir kere kullanacaksak direk yapabiliriz
       WebElement singIn= driver.findElement(By.id("sign-in"));
       singIn.click();

       // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement email =driver.findElement(By.id("session_email"));
        WebElement password = driver.findElement(By.id("session_password"));
        WebElement singIn2= driver.findElement(By.name("commit"));


       // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
       // i. Username : testtechproed@gmail.com
        email.sendKeys("testtechproed@gmail.com");

       // ii. Password : Test1234!
        password.sendKeys("Test1234!");

       //iii.sing in tıkla
       singIn2.click();

       //  e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        //1.YOL
        WebElement expectedUser = driver.findElement(By.className("navbar-text"));

        System.out.println("bolean :"+expectedUser.isDisplayed());     //bolean değer döner varsa true yoksa false yazdırır

        if (expectedUser.isDisplayed()){
            System.out.println("Expected user testi passed "+ expectedUser.getText());  //webelementi üzerindeki yazıyı konsolda yazdırabilmek için getTest() methodu kullanılır
        }else System.out.println("Expected user testi faild");

       //2.YOL-----------------------------------------------------------------------------------------------
       String expectedUserYazisi= "testtechproed@gmail.com" ;

       String actualUserYazsi= expectedUser.getText();   //1. yolda ilk başta location almış ve expected a atamıştık
                                                         //o locationdan getText() methodunu kullanarak metni aldık
       if (actualUserYazsi.equals(expectedUserYazisi)){
           System.out.println("TEST PASSED");
       }else System.out.println("TEST FAILD");


       //  f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
       WebElement addreses = driver.findElement(By.linkText("Addresses"));
       if (addreses.isDisplayed()){
           System.out.println("addreses testi passed");
       }else System.out.println("addreses testi faild");


       WebElement singOut= driver.findElement(By.linkText("Sign out"));
        if (singOut.isDisplayed()){
            System.out.println("singout testi passed");
        }else System.out.println("singout testi faild");


       // 3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a")); //linklerin tag nameleri a oldugu için
        System.out.println("Linklerin sayisi :"+linklerListesi.size());        //liste attığımız değerilerin sayısını aldık

        //linkleri yazdıralım
        /*listemiz webElementlerden oluştuğu için direk yazdırırsak referansları yazdırır
        onun yerine for each loop yapıp her bir link elementinin üstündeli yazıyı getText() methodu ile alıp yazdırmalıyız
        */

            //for each ile:
        for (WebElement each:linklerListesi){
            System.out.println("linkler :"+ each.getText());            //liste atadığımız linklerdeki text değerlerini yazdırdık
        }

            //Lambda ile
        linklerListesi.forEach(t-> System.out.println(t.getText()));

       //KAPAT
       driver.close();
    }
}
