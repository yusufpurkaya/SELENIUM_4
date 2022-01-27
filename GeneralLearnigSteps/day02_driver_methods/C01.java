package day02_driver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    /* Normalde selenium un kendi IDE si var  fakat biz daha kullanisli old icin intelij kullaniyoz
    intelij de yeni bir proje olusturdugumuzda oncelikle selenium kutuphanelerini eklememiz gerek
    biz en ilkel haliyle projemize kutuphaneleri jar dosyalari olarak yukledik
    bu ekledigimiz dosyalarla artik driver in ayarlarini yapabiliriz
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
   /*setProperty methodu 2 parametre ister
   1- kullanacagimiz browser a ait driver
   2. parametre ise selenium sitesinde indirip projemize ekledigimiz chrome driverin path i ve
   bu path bilgisayar windows ise ".exe" ile bitmeli
    */
      WebDriver driver=new ChromeDriver();   // cunku WebDriver bir interface
   driver.get("https://www.amazon.com");
    Thread.sleep(3000);
 //driver.close(); // bu objeyi kapatir eger



    }

}
