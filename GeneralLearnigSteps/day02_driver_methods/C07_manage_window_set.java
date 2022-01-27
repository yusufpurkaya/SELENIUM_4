package day02_driver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_manage_window_set {
    public static void main(String[] args) throws InterruptedException {
        //1. Yeni bir Class olusturalim.C07_ManageWindowSet
       System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       //2. Amazon soyfasina gidelim. https://www.amazon.com/
       driver.get("https://www.amazon.com");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(" sayfanin size i "+driver.manage().window().getSize());
        System.out.println("sayfanin position u "+driver.manage().window().getPosition());
        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
       driver.manage().window().setPosition(new Point(100,100));
       driver.manage().window().setSize(new Dimension(500,500));
        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
int xpos=driver.manage().window().getPosition().getX();
int ypos=driver.manage().window().getPosition().getY();
int genislik=driver.manage().window().getSize().width;
int yukseklk=driver.manage().window().getSize().height;
      Thread.sleep(2000);
if (xpos==100 && ypos==100&&genislik==500 && yukseklk==500){
    System.out.println("  PASS   bravo");
}else {
    System.out.println(" FAİLED  ");
}
        //8. Sayfayi kapati
   driver.close();
    }
}
