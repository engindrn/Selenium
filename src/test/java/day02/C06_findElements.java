package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_findElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // amazon sayfasına gidiniz
        driver.get("https://www.amazon.de");

        // Amazon sayfasındaki tag'ları input olanların sayısını yazdırınız
        List<WebElement> tag = driver.findElements(By.tagName("input"));
        System.out.println("input tag'inin sayısı = "+tag.size());

        System.out.println(driver.findElement(By.xpath("(//*[@class='a-color-base headline truncate-2line'])[1]")).getText());
    }
}
