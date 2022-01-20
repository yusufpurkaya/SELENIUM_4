package MerveHocaQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q03 {
    public static void main(String[] args) {
        //1.  https://id.heroku.com/login sayfasina gidin
       System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://id.heroku.com/login");
        //2.  Bir mail adersi giriniz
        WebElement mailBox=driver.findElement(By.xpath("//input[@name='email']"));
       mailBox.sendKeys("yepkaya@gmail.com");
        //3.  Bir password giriniz
        WebElement sifre=driver.findElement(By.xpath("//input[@placeholder='Password']"));
       sifre.sendKeys("145236");
        //4.  Login butonuna tiklayiniz
        WebElement gonder=driver.findElement(By.name("commit"));
        gonder.submit();

        //5.  "There was a problem with your login." texti gorunur ise
       WebElement olmadi=driver.findElement(By.xpath("//div[@role='alert']"));
        //6.  "kayit yapilamadi" yazdiriniz
        //8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
      if (olmadi.isDisplayed()){
          System.out.println("kayit yapilamadi");
      }else {
          System.out.println("kayit yapildi");
      }

        //9.  Tum sayfalari kapatiniz
driver.quit();


















    }
}
