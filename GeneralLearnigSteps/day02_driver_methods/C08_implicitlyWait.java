package day02_driver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_implicitlyWait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
       // implicitly wait  testimiz boyunca sayfa acilmasi ve element bulunmasi konusunda driver in
        // bekleyecegi max sureyi belirler
        // bu sure icinde gorevini bitirir bitirmez bir sonraki adima gecer
        // ama bu sure icinde gorevini bitiremezse o zaman hata verir
        // belirlenen max sure Thread.sleep deki gibi mutlak bekleme suresi degildir. yani
        // mesela isini 3 saniyede yapsa 3 saniyede diger goreve gecer

        driver.get("htpps://www.techproeducation.com");
        //Thread.sleep(3000);
        driver.close();
    }
}
