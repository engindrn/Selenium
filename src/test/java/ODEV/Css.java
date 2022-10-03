package ODEV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Css {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        // b. Locate email textbox
        WebElement email= driver.findElement(By.cssSelector("#session_email"));
        email.sendKeys("testtechproed@gmail.com");

        //locate password
        WebElement password= driver.findElement(By.cssSelector("#session_password"));
        password.sendKeys("Test1234!");
        //sing in
        driver.findElement(By.cssSelector("input[name='commit']")).click();


    }
}
