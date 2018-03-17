package info.exac.wicket_spring_hibernate.web.page;

import info.exac.wicket_spring_hibernate.WicketApplication;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
 * @author exac
 * @date 17/03/2018 23:44
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class AbstractPageTest extends AbstractJUnit4SpringContextTests {

    /** Wicket tester */
    private WicketTester tester;


    /** Injected application - with application context connected */
    @Autowired
    private WicketApplication wicketApplication;



    @Before
    public void setUp() {
        // Creates wicket tester for current wicket application with application context connected
        tester = new WicketTester(wicketApplication);
    }



    @Ignore
    public WicketTester getTester() {
        return tester;
    }


}
