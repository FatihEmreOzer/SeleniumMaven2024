package techrpoed.day09_DropdownMenu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C02_Dropdown {
    /*
    DROPDOWN---> Altbasliklarin oldugu acilir menu listesidir
    Dropdown'u handle etmek icin
    1. Dropdown menu ilk olarak locate edilir
    2-Select objesi olusturulur
    3-Select objesinin ddm webeleementinin icerigine ve seceneklerine erisim saglamasi icin SELECT sinifina arguman olarak
    locate ettigimiz webelementi koyariz

    SYNTAX:
    Select select = new Select(ddm webelementi)

    4- Select class'i sadece <select> tagi ile olusturulmus dropdown menulere uygulanabilir
    5- Select objesi ddm'yu handle edebilmek icin 3 method kullaniri
        - selectByVisibleText() -->DDm deki elemente gorunur metin ile ulasmak icin kullanilir.
        - selectByIndex() --> index ile ulasmak icin kullanilir
        - selectByValue() --> elementin degeri ila ulasmak icin kullanilir

    6- getOptions() --> Locate ettigimiz ddm'deki tum secenekleri bize verir(List'e atip loop ile yazdirabiliriz)
    7- getFirstSelectedOption() -->    Ddm'deki secili kalan secenegi bize verir. Birden fazla secenek secilidiyse
    bu secilenlerin ilkini verir.
     */
                        //----------------------------------------------------------//

    /*
    Given kullanicisi https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken
    3 farkli test methodu olusturalim
    1.Method
        a. Yil,ay,gun dropdown menulerini locate ediniz
        b.Select objesi olusutr
        c.Select object i kullanarak 3 farkli sekilde secim yapiniz

     2.Method
        a.Tum eyalet isimlerini yazdiralim

     3.Method:
        a. State dropdownindaki varsayilan secili secenegin 'Select a State ' oldugunu verify edelim
     */


    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

    }

    @Test
    public void test01() {
        //1.Method
        //        a. Yil,ay,gun dropdown menulerini locate ediniz
        WebElement year = driver.findElement(By.xpath("//*[@id = 'year']"));
        WebElement month = driver.findElement(By.xpath("//*[@id = 'month']"));
        WebElement day = driver.findElement(By.xpath("//*[@id = 'day']"));

        //        b.Select objesi olusutr
        Select select = new Select(year);

        //        c.Select object i kullanarak 3 farkli sekilde secim yapiniz
        select.selectByIndex(6);
        Select select1 = new Select(month);
        select1.selectByValue("6");
        Select select2 =new Select(day);
        select2.selectByVisibleText("8");
    }

    @Test
    public void test02() {


    }

    @Test
    public void test03() {

    }
}
