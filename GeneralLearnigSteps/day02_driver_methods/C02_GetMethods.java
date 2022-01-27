package day02_driver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_GetMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());        // sayfanin basligini getirir
                                                      //Amazon.com. Spend less. Smile more.
        System.out.println(driver.getCurrentUrl());   // sayfanin adresini getirir
        System.out.println(driver.getWindowHandle()); // sayfanin  kimlik numarasini getirir
        System.out.println(driver.getPageSource());   // sayfanin arkasinda calisan kodlari getirir



    }
}
