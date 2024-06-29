package techrpoed.day08_Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_AssertionClassWork {
    /*
    1. https://www.amazon.com adresine gidin
    2. Asagidaki adlari kullanrak 4 test metodu olusturun ve gerekli testleri yapin
    title Test --> sayfa basligi "Amazon" kelimesini icerip icermedigini test edin
    image Test --> Amazon resmini goruntulendigini test edin
    Searcg Box'in erisilebilir oldugunu test edin
    wrongTitleTest --> Sayfa Basliginin "amazon" icermedigini dogrulayin
     */
        WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //   1. https://www.amazon.com adresine gidin
        driver.get("https://www.amazon.com");
    }

    @Test
    public void tittleTest() {
        //Title Test --> sayfa basligi "Amazon" kelimesini icerip icermedigini test edin
        String ActualTittle = driver.getTitle();
        String expectedTittle = "Amazon";
        Assert.assertTrue(ActualTittle.contains(expectedTittle));

    }
//image Test --> Amazon resmini goruntulendigini test edin
    @Test
    public void imageTest() {
        WebElement image = driver.findElement(By.id("nav-logo-sprites"));
        Assert.assertTrue(image.isDisplayed());

    }
//Search Box'in erisilebilir oldugunu test edin
    @Test
    public void searchBoxTest() {
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(searchBox.isEnabled());

    }
//    wrongTitleTest --> Sayfa Basliginin "amazon" icermedigini dogrulayin
    @Test
    public void wrongTittleTest() {        String ActualTittle = driver.getTitle();
        String expectedTittle = "Amazon";
        Assert.assertFalse(ActualTittle.contains(expectedTittle));

    }
}
