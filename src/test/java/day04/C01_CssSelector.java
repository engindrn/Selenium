package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_CssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


       // 1 ) Bir class oluşturun : Locators_css
       // 2)Main method oluşturun ve aşağıdaki görevi tamamlayın.

       // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

       // b. Locate email textbox
        WebElement emailTextBox= driver.findElement(By.cssSelector("#session_email"));

       // c. Locate password textbox ve
        WebElement paswordTextBox= driver.findElement(By.cssSelector("#session_email"));

       // d. Locate signin button
        WebElement singIn= driver.findElement(By.cssSelector("input[name='commit']"));

       // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini
       // tıklayın
       // i. Username : testtechproed@gmail.com
        paswordTextBox.sendKeys("testtechproed@gmail.com");

       // ii. Password : Test1234!
        paswordTextBox.sendKeys("Test1234!");

        singIn.click();

        driver.close();

       // NOT: cssSelector kullanarak elementleri locate ediniz.




    }
}
