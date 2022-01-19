package Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CW_03 {
    public static void main(String[] args) {
        //1. Yeni bir Class olusturalim.C03_ManageWindow
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
       System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition()+"boyut lari : "+driver.manage().window().getSize());
        //4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //8. Sayfayi kapatin
     driver.quit();
    }
}
