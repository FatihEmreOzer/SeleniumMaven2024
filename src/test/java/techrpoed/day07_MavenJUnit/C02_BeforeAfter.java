package techrpoed.day07_MavenJUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C02_BeforeAfter {
    @After
    public void tearDown(){
        System.out.println("Her Test Methodundan sonra bir kez calisir");

    }

    @Before
    public void setUp(){
        System.out.println("Her Test Methodundan once bir kez calisir");


    }

    @Test
    public  void test1(){
        System.out.println("Test1 methodunu calistir");
    }
    @Test
    public  void test2(){
        System.out.println("Test2 methodunu calistir");
    }
    @Test
    public  void test3(){
        System.out.println("Test3 methodunu calistir");
    }



}
