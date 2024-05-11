package techproed.day06_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_MavenIlkTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://amazon.com/ sayfasina gidelim
        driver.get("https://amazon.com/");

        //arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id = \"twotabsearchtextbox\"]"));

        //"Samsung headphones" ile aram ayapalim
        aramaKutusu.sendKeys("Samsung headphones", Keys.ENTER);

        //Bulunan sonuc sayisini yazdiriniz
        WebElement sonucYazisi = driver.findElement(By.xpath("(//*[@class ='sg-col-inner'])[1]"));
        String [] sonucSayisi = sonucYazisi.getText().split(" ");
        System.out.println(sonucSayisi[2]);
        //Ilk urune tiklayalim
        driver.findElement(By.xpath("(//h2//a[1]")).click();


        Thread.sleep(4000);
        driver.close();
    }
}
