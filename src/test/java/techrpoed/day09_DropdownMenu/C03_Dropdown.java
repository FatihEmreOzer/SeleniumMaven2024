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

public class C03_Dropdown {
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
    //programmin languages ddm den istediginiz 4 secenegi seciniz
        WebElement languages =  driver.findElement(By.xpath("(//select)[6]"));
        Select select = new Select(languages);
        select.selectByIndex(0);
        select.selectByIndex(2);
        select.selectByIndex(3);
        select.selectByIndex(4);
        //Eger sadece secili olan optionlari yazdirmak istersek;
        select.getAllSelectedOptions().forEach(w-> System.out.println(w.getText()));//lambda

    }

    @Test
    public void test02() {

    }
}
