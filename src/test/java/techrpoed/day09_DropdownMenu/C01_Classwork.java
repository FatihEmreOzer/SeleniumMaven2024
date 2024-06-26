package techrpoed.day09_DropdownMenu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Classwork {
    /*
    1. https://www.amazon.com adresine gidin
    2. Asagidaki adlari kullanrak 4 test metodu olusturun ve gerekli testleri yapin
    title Test --> sayfa basligi "Amazon" kelimesini icerip icermedigini test edin
    image Test --> Amazon resmini goruntulendigini test edin
    Searcg Box'in erisilebilir oldugunu test edin
    wrongTitleTest --> Sayfa Basliginin "amazon" icermedigini dogrulayin
     */
    static WebDriver  driver;
    @BeforeClass
    public static void beforeClass() throws Exception {
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
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
}
    //image Test --> Amazon resmini goruntulendigini test edin
    @Test
    public void imageTest() {
        WebElement image = driver.findElement(By.id("nav-logo-sprites"));
        Assert.assertTrue(image.isDisplayed());
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung", Keys.ENTER);
    }
    //Search Box'in erisilebilir oldugunu test edin
    @Test
    public void searchBoxTest() {
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(searchBox.isEnabled());
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nokia", Keys.ENTER);
    }
    //    wrongTitleTest --> Sayfa Basliginin "amazon" icermedigini dogrulayin
    @Test
    public void wrongTittleTest() {
        String ActualTittle = driver.getTitle();
        String expectedTittle = "Amazon";
        Assert.assertTrue(ActualTittle.contains(expectedTittle));

    }

    @AfterClass
    public static void afterClass() throws Exception {
        driver.close();
    }
}
