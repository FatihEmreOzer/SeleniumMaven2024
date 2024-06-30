package techrpoed.day08_Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_RadioButtonClassWork {
    /*
    https://www.facebook.com adresine gidin
    Cookies'i kabul edin
    "Create and Account" buttonuna basin
    "radio buttons" elementlerini locate edin
    Secili degilse cinsiyet butonuna size uygun olani secin

     */
    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }

    @Test
    public void radioButton() throws InterruptedException {

        // https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com ");
        Thread.sleep(2000);
        //    Cookies'i kabul edin
        //    "Create and Account" buttonuna basin
      driver.findElement(By.xpath("(//*[@role= 'button'])[2]")).click();
      Thread.sleep(1000);

        //    "radio buttons" elementlerini locate edin
        WebElement female = driver.findElement(By.xpath("(//*[@type = 'radio'])[1]"));
        Thread.sleep(1000);
        WebElement male = driver.findElement(By.xpath("(//*[@type = 'radio'])[2]"));
        WebElement special = driver.findElement(By.xpath("(//*[@type = 'radio'])[3]"));
        //    Secili degilse cinsiyet butonuna size uygun olani secin

        Thread.sleep(1000);
        if (!male.isSelected()){
            male.click();
        }



    }
}
