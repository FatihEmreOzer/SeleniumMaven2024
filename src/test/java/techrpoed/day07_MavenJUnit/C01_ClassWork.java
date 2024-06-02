package techrpoed.day07_MavenJUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_ClassWork {
    public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            //1. http://zero.webappsecurity.com sayfasina gidin
            driver.get("http://zero.webappsecurity.com");

            //2.Signin buttonuna tiklayin
            driver.findElement(By.id("signin_button")).click();

            //3.Login alanine "usarname" yazdirin
            WebElement login = driver.findElement(By.xpath("//*[@id= 'user_login']"));
            login.sendKeys("username");

            //4.Password alanina "password" yazdirin
            WebElement password = driver.findElement(By.xpath("//*[@id= 'user_password']"));
            password.sendKeys("password");

            //5.Sign in buttonuna tiklayin
            WebElement signIn = driver.findElement(By.xpath("//*[@value= 'Sign in']"));
            signIn.click();
            Thread.sleep(1000);
            driver.navigate().back();

            //6.Online Banking altinda Pay Bills sayfasina gidin
            driver.findElement(By.xpath("(//*[text() =.])[11]")).click();
            //--->//*[text() =. ][11] Bu sekilde text ile aldigimiz bir xpathde text degisse bile biz o webelementi handle edebiliriz
            driver.findElement(By.xpath("//*[@id= 'pay_bills_link']")).click();
            //7.amount kisminda yatirmak istediginiz herhangi bir miktar yazin
            driver.findElement(By.xpath("//*[@id = 'sp_amount']")).sendKeys("1250");
            Thread.sleep(1000);

            //8.tarih kismina "2020-09-10" yazdirin
            driver.findElement(By.xpath("//*[@id = 'sp_date']")).sendKeys("2020-09-10");
            Thread.sleep(1000);

            //9.pay buttonuna tiklayin
            driver.findElement(By.id("pay_saved_payees")).click();

            //10."The payment was succesfully submitted." mesajinin ciktigini kontrol edin
            WebElement sonucYazisi = driver.findElement(By.xpath("(//span)[1]"));
            System.out.println(sonucYazisi.getText());
            if (sonucYazisi.getText().equals("The payment was successfully submitted.")) {
                    System.out.println("TEST PASSED");
            }else System.out.println("TEST FAILED");
            Thread.sleep(1000);
            driver.close();
    }
    }

