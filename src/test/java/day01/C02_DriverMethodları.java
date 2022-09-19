package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodları {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();   //her driver objesi oluşturdan sonra ilk olr sayfamızı full ekran yapalm


        //amazon sayfasına gidiniz
        driver.get("https://amazon.com");

        // kaynak kodları içersinde "Gateway" kelimesinin olduğunu test ediniz
       String source= driver.getPageSource(); //getPageSource methodu String döner
        String arananKelime ="Gateway";
       if(source.contains("arananKelime")){
           System.out.println("içeriyor");
       }else System.out.println("içermiyor");

        //2.yol
     //  String aranankelime="Gateway";
     //  if (driver.getPageSource().contains("aranankelime")){
     //      System.out.println("PageSource testi PASSED");
     //  }else System.out.println("PageSouece tesit FAILD");

        driver.close();   //açılan sayfayı kapatır
        //driver.quit();  birden fazla sayfa varsa hepsini kapatır


    }

}
