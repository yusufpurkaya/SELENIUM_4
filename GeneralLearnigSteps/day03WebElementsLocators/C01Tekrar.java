package day03WebElementsLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01Tekrar {
    public static void main(String[] args) {
       //1. Yeni bir class olusturun (TekrarTesti)
       System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

       //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
       driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.navigate().to("https://www.youtube.com");
        if (driver.equals("youtube")){
            System.out.println("sayfa basligi dogru "+driver.getTitle());
        }else {
            System.out.println(driver.getTitle()+" iste bu dogru baslik ");
        }

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
       if (driver.getCurrentUrl().contains("youtube")){
           System.out.println("url testi pass");
       }else {
           System.out.println("url testi failed");
       }
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
       driver.navigate().to("https://www.amazon.com");
        //5. Youtube sayfasina geri donun
       driver.navigate().back();
        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
       driver.manage().window().fullscreen();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
   if (driver.getTitle().contains("Amazon")){
       System.out.println("Amazon icerme testi pass");
   }else {
       System.out.println(" Amazon icerme testi failed cunku dogru baslik : "+driver.getTitle());
   }
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        if (driver.getCurrentUrl().equals("https://www.amazon.com")){
            System.out.println("amazon url si "+driver.getCurrentUrl()+" old icin test pass");
        }else {
            System.out.println("amazon url si "+driver.getCurrentUrl()+" olmadıgı icin  test failed");
        }
        //11.Sayfayi kapatin
        driver.quit();
    }
}
