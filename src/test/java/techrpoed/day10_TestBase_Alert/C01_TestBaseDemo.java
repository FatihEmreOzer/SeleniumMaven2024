package techrpoed.day10_TestBase_Alert;

import org.junit.Assert;
import org.junit.Test;
import techrpoed.utilities.TestBase;

public class C01_TestBaseDemo  extends TestBase{

    @Test
    public void test01() {
    //Techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");

    //Basligin Bootcamp icerdigini test edelim
        String actualTittle = driver.getTitle();
        String expectedTittle = "a";
        Assert.assertTrue(actualTittle.contains(expectedTittle));


    }
}
