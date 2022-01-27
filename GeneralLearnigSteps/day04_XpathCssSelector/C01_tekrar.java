package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_tekrar {
    //  a.google web sayfasına gidin. https://www. amazon.com/
    //  b. Search(ara) “city bike”
    //  c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
    //  d. “Shopping” e tıklayın.
    //  e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //  a.amazon web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com");
        //  b. Search kutusuna  “city bike” yazip arattirin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);
        // aramaKutusu.submit();   istersek Keys.ENTER yerine bu satiri da yazabiliriz
        //  c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement sonucYazisiElementi= driver.findElement(By.className("sg-col-inner"));


//div[@class='sg-col-14-of-20 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']
// bu sitedeki   (//tagname[@attribute='value'])[1]   bu elementten kacincisi old da secebiliriz

//WebElement sonucYazisiElementi2= driver.findElement(By.xpath("//div[@class='sg-col-14-of-20 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']"));
        System.out.println(sonucYazisiElementi.getText());
        //  e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        /*
        WebElement ilkUrunResmi= driver.findElement(By.className("s-image"));
        ilkUrunResmi.click();
        */
        // sadece click yapmak gibi basit bir islemde kullanacagimiz webelementler icin
        // variable olusturmadan direk locate edip, istedigimiz islemi yapabiliriz
        driver.findElement(By.className("s-image")).click();

    }
}
