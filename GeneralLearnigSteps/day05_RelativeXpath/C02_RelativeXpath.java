package day05_RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C02_RelativeXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        WebElement sailor=driver.findElement(By.id("pid11_thumb"));
        WebElement boston=driver.findElement(By.id("pid6_thumb"));
        WebElement byArea=driver.findElement(By.id("pid8_thumb"));
        WebElement nyc=driver.findElement(By.id("pid3_thumb"));

        //2 ) Berlin’i  3 farkli relative locator ile locate edin
        WebElement berlin=driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(boston).above(sailor).toLeftOf(byArea));
        WebElement berlin2=driver.findElement(RelativeLocator.with(By.tagName("img")).below(nyc).toLeftOf(byArea));
        WebElement berlin3=driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(boston).above(sailor));


        //3 ) Relative locator’larin dogru calistigini test edin
        String expectedBerlinIddegeri="pid7_thumb";
        if (berlin.getAttribute("id").equals(expectedBerlinIddegeri)){
            System.out.println("berlin testi PASS");
        }else {
            System.out.println("berlin testi FAILED");
        }
        if (berlin2.getAttribute("id").equals(expectedBerlinIddegeri)){
            System.out.println("berlin2 testi PASS");
        }else {
            System.out.println("berlin2 testi FAILED");
        }
        if (berlin3.getAttribute("id").equals(expectedBerlinIddegeri)){
            System.out.println("berlin3 testi PASS");
        }else {
            System.out.println("berlin3 testi FAILED");
        }
    }
}
