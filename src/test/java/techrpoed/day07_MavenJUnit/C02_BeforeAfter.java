package techrpoed.day07_MavenJUnit;

import org.junit.After;
import org.junit.Before;

public class C02_BeforeAfter {
    @After
    public void tearDown(){
        System.out.println("Her Test Methodundan sonra bir kez calisir");

    }

    @Before
    public void setUp(){



    }

}
