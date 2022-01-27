package day03WebElementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GenelTekrar {
    public static void main(String[] args) {
        //1. Bir class oluşturun: LoginTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.navigate().to("http://a.testaddressbook.com");
        //b. Sign in butonuna basin
        WebElement id=driver.findElement(By.id("sign-in"));
        id.click();
        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
     //  WebElement emailTextBox=driver.findElement(By.id("session_email"));
      //  WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        WebElement signIn=driver.findElement(By.className("btn btn-primary"));
        signIn.click();
        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        //3. Sayfada kac tane link oldugunu bulun.
    }
}
