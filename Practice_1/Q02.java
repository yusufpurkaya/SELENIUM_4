package Practice_1;

import net.jodah.failsafe.internal.util.Assert;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02 {
    public static void main(String[] args) {
//  ...Exercise2...
//  1-driver olusturalim
//  2-java class'imiza chromedriver.exe'yi tanitalim
//  3-driver'in tum ekrani kaplamasini saglayalim
//  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
//    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
//  5-"sahibinden.com" adresine gidelim
       System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.sahibinden.com");
//  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim

        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
//  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
        System.out.println(url.contains("oto")&&title.contains("oto")?"oto icerme testi pass":" oto icerme testi FAILED");

//  8-Ardindan "gittigidiyor.com" adresine gidelim
        driver.get("https://www.gittigidiyor.com");
//  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
//    kontrol edelim
        System.out.println(driver.getTitle().contains("Sitesi")?"title sitesi icerme testi pass":"title sitesi icerme testi FAILED" );
//  10-Bi onceki web sayfamiza geri donelim
driver.navigate().back();
//  11-sayfayi yenileyelim
driver.navigate().refresh();
//  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
driver.navigate().forward();
//  13-En son adim olarak butun sayfalarimizi kapatmis olalim
driver.quit();



    }
}
