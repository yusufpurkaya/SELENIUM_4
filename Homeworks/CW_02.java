package Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CW_02 {
    public static void main(String[] args) {

        //    Class Work-2
        //1. Yeni bir Class olusturalim.C02_NavigationMethods
        //2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.youtube.com");
        //3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        //4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        //5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        //6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        //7. Sayfayi tam ekran yapalim
        driver.manage().window().fullscreen();
        //8. Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();
    }
}
