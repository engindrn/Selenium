package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_GetMethodları {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // amazon sayfasına gidiniz
        driver.get("https://amazon.de");

        // arama kutusunu locate ediniz
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        // search Box un tagName inin input olduğunu test ediniz
        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();          //web elementinin tag ismini getirir

        if (actualTagName.equals(expectedTagName)){
            System.out.println("TagName TESTI PASSED : "+actualTagName);
        }else {
            System.out.println("TagName TESTI FAILED" +actualTagName);
        }

        //search box un name attribute unun değerinin field-keywords olduğunu test ediniz
        String expectedAttributeName= "field-keywords";
        String actualAttributeName= aramaKutusu.getAttribute("name");    //ismi girilen atribute nin değerini getirir

        System.out.println(actualAttributeName);  // attribute nin değerini yazdırdık


        if (actualAttributeName.equals(expectedAttributeName)){
            System.out.println("Atribute TESTI PASSED");
        } else System.out.println("Atribute TESTI FAILED");


        // Arama kutusunun konumunu yazdırınız
        System.out.println("Arama kutusu konumu "+aramaKutusu.getLocation());

        //KAPAT
        driver.close();
    }
}
