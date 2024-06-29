package techrpoed.day08_Assertion;

import org.junit.Assert;
import org.junit.Test;

public class C06_Assertion {
    @Test
    public void test01() {
        Assert.assertEquals(2,2);
        System.out.println("Test basarili");
    }
    @Test
    public void test02() {
        Assert.assertEquals(3,3);
        System.out.println("Test basarili");
    }

    @Test
    public void test03() {
        Assert.assertNotEquals(5,4);
        System.out.println("test basarili");
    }
}
