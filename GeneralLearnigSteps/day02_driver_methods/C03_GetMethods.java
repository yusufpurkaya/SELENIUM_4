package day02_driver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {

 //1. Yeni bir package olusturalim : day01
    //2. Yeni bir class olusturalim : C01_GetMethods

 public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
     WebDriver obj=new ChromeDriver();
     //3. Amazon sayfasina gidelim. https://www.amazon.com/
    obj.get("https://www.amazon.com");
     //4. Sayfa basligini(title) yazdirin
     System.out.println(obj.getTitle());
     //5. Sayfa basliginin “Amazon” icerdigini test edin
    String actuelTitle=obj.getTitle();
String arananKelime="Amazon";
if (actuelTitle.contains(arananKelime)){
    System.out.println("tittle testi PASS");
}else {
    System.out.println("title testi FAILED");
}
     //6. Sayfa adresini(url) yazdirin
     System.out.println(obj.getCurrentUrl());

     //7. Sayfa url’inin “amazon” icerdigini test edin.
     String actuelUrl=obj.getCurrentUrl();
     String aranan="amazon";
     if (actuelUrl.contains(aranan)){
         System.out.println("url testi gecti PASS");
     }else {
         System.out.println("url testi FAILED");
     }
     //8. Sayfa handle degerini yazdirin
     System.out.println(obj.getWindowHandle());
     //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
     String kelime="alisveris";
     String kod=obj.getPageSource();
     if (kod.contains(kelime)){
         System.out.println("pagesource gecti PASS");
     }else {
         System.out.println("pagesource testi FAILED");
     }
     //10. Sayfayi kapatin
     obj.close();
 }
}
