package techrpoed.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class TestBase {
    /*
    TestBase classindan obje olusturmanin onune gecmek icin bu classi abstract yapabiliriz
    Bu classa extends yaptigimiz test classlarindan ulasabiliriz
     */
   protected WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(300);
        driver.quit();
    }
    public void bekle(int saniye){try {
        Thread.sleep(saniye*1000);
    }catch (InterruptedException e){
        throw new RuntimeException(e);
    }
    }
}
