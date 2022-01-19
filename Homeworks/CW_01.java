package Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CW_01 {
    public static void main(String[] args) {

        //1. Yeni bir package olusturalim : day01
        //2. Yeni bir class olusturalim : C01_GetMethods
   System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        //4. Sayfa basligini(title) yazdirin
        String baslik=driver.getTitle();
        System.out.println(baslik);
        //5. Sayfa basliginin “Amazon” icerdigini test edin
       if (baslik.contains("Amazon")){
           System.out.println("Baslik amazon icerme testi pass");
       } else {
           System.out.println("Baslik amazon icerme testi FAİLED");
       }
        //6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //7. Sayfa url’inin “amazon” icerdigini test edin.
       String currentUrl=driver.getCurrentUrl();
       if (currentUrl.contains("amazon")){
           System.out.println("url amazon icerme testi pass");
       }else {
           System.out.println("url amazon icerme testi FAİLED");
       }
        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        if (driver.getPageSource().contains("alisveris")){
            System.out.println("sayfa kodlarinda alisveris testi PASS");
        }else {
            System.out.println("sayfa kodlarinda alisveris testi FAİLED");
        }
        //10. Sayfayi kapatin.
        driver.quit();
}
}