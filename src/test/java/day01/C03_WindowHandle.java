package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getWindowHandle());   //CDwindow-0E973DDADA3699A693195EA2D43074D1
        //benzersiz olark açılan window a ait hachcode unu verir
        //farklı pencereler arasında gezebilmek için get.WindowHandle() methodu kullanılır.
    }
}
