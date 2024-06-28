package techrpoed.day08_Assertion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class C01_BeforeClassAfterClass {
    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Her classdan once BeforeClass methoodu bir kez calisir");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Her classdan sonra AfterClass methoodu bir kez calisir");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Her methoddan once before methodu bir kez calisir");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Her methoddan sonra after methodu bir kez calisir");
    }
}
