package Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03 {
    public static void main(String[] args) {
// ...Exercise3...
System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


//fill the firstname
driver.findElement(By.id("cookieChoiceDismiss")).click();
        driver.manage().deleteAllCookies();

//fill the firstname
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("yusuf Emre");
//check the gender
driver.findElement(By.xpath("//input[@value='Male']"));
               //  driver.findElement().sendKeys(Keys.PAGE_DOWN);
//check the experience

//fill the date

//choose your profession -> Automation Tester

//choose your tool -> Selenium Webdriver

//choose your continent -> Antartica

//choose your command  -> Browser Commands

//click submit button

    }
}
