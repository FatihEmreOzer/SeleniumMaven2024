package techrpoed.day08_Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CheckBoxClassWork {
    /*
    Verilen Web sayfasina gidin
    https://the-internet.herokuapp.com/checkboxes
     Checkbox1 ve checkbox2 elementlerini locate edin
     Checkbox1 secili degilse onay kutusuna tiklayin
     Checkbox2 secili degilse onay kutusuna tiklayin

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
    public void checkBox() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(1000);
        //Checkbox1 ve checkbox2 elementlerini locate edin
        WebElement checkBox1 = driver.findElement(By.xpath("(//input)[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input)[2]"));
        //Checkbox1 secili degilse onay kutusuna tiklayin
        if (!checkBox1.isSelected()){
            checkBox1.click();
        }
        Thread.sleep(2000);
        //Checkbox2 secili degilse onay kutusuna tiklayin
        if (!checkBox2.isSelected()){
            checkBox2.click();
    }


}
}
