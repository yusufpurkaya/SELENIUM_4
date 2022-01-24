package Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q05 {
    public static void main(String[] args) {
        // ...Exercise5...
// Navigate to  https://testpages.herokuapp.com/styled/index.html

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(By.id("calculatetest")).click();
        driver.findElement(By.name("number1")).sendKeys("12");
        driver.findElement(By.xpath("//option[@value='divide']")).click();
 // Click on  Calculate under Micro Apps

//    Type any number in the first input
//    Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("4");
// Click on Calculate
        driver.findElement(By.id("calculate")).click();
// Get the result  or  // Print the result
        System.out.println(driver.findElement(By.xpath("//span[@id='answer']")).getText());
driver.close();
    }
}
