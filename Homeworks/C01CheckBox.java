package day07assetions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01CheckBox {
    //a. Verilen web sayfasına gidin.
    //https://the
    //internet.herokuapp.com/checkboxes
    //b. Checkbox1 ve checkbox2 elementlerini locate edin.
    //c. Checkbox1 seçili değilse onay kutusunu tıklayın
    //d. Checkbox2 seçili değilse onay kutusunu tıklayın
    static WebDriver driver;
   @Before
   public void setup(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }

   @Test
   public void test01(){
driver.get("https://the-internet.herokuapp.com/checkboxes");
WebElement kutu1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
       WebElement kutu2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
       if (!kutu1.isSelected()){
           kutu1.click();
       }
       if (!kutu2.isSelected()){
           kutu2.click();
       }


   }

    @After
    public void teardown(){

    }




















}
