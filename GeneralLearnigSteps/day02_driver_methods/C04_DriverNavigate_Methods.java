package day02_driver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigate_Methods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        // get(); methoduyla ayni isi yapar ama daha hizlidir
        driver.navigate().to("https://www.techproeducation.com");
    //    driver.navigate().back();
  //  driver.navigate().forward();
    driver.close();
    }
}
