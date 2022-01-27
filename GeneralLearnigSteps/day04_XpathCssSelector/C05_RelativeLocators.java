package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C05_RelativeLocators {
    public static void main(String[] args) {
        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html  adresine gidin


        System.setProperty("webdriver.driver.chrome","src/driver/chromedriver.exe");
       WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        WebElement sailor=driver.findElement(By.id("pid11_thumb"));
        WebElement boston=driver.findElement(By.id("pid6_thumb"));
        WebElement byArea=driver.findElement(By.id("pid8_thumb"));
        WebElement nyc=driver.findElement(By.id("pid3_thumb"));

        //2 ) Berlin’i  3 farkli relative locator ile locate edin
WebElement berlin=driver.findElement(RelativeLocator.with(By.name("img")).toRightOf(boston));

        //3 ) Relative locator’larin dogru calistigini test edin
     /*   Bir web elementini tanimlamak için 8 tane selenium locator vardır.
        1. id
        2. name
        3. className
        4. tagName
        5. linkText
        6. partialLinkText
bu ilk 6 si html attributes ile ilgilidir.
        7. xpath
        8. css
*/
    }
}
