package day02_driver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Manage_Window {
    public static void main(String[] args) throws InterruptedException {
        //1. Yeni bir Class olusturalim.C06_ManageWindow
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
       driver.get("https://www.amazon.com");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //4. Sayfayi simge durumuna getirin
driver.manage().window().minimize();
        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
Thread.sleep(3000);
driver.manage().window().maximize();
        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("max iken position "+driver.manage().window().getPosition());
        System.out.println("max iken size "+driver.manage().window().getSize());
        //7. Sayfayi fullscreen yapin
driver.manage().window().fullscreen();
        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("fullScreen iken position "+driver.manage().window().getPosition());
        System.out.println("fullScreen iken size "+driver.manage().window().getSize());
        //9. Sayfayi kapatin
        driver.close(); // eger quite deseydi ve baska actigi sayfa olsaydi hepsini kapatirdi


    }
}
