package techrpoed.day08_Assertion;

import org.junit.*;

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

    @Test
    public void test01() {
        System.out.println("Test01 ethodu calisti");
    }

    @Test
    public void test02() {
        System.out.println("Test02 ethodu calisti");
    }

    @Test
    public void test03() {
        System.out.println("Test03 ethodu calisti");
    }
}
