package info.exac.wicket_spring_hibernate.web;

import info.exac.wicket_spring_hibernate.WicketApplication;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
 * @author exac
 * @date 28/02/2018 14:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
@DirtiesContext(classMode= DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class TestHomePage extends AbstractJUnit4SpringContextTests{

    private WicketTester tester;

//    @Autowired
//    private ApplicationContext ctx;

    @Autowired
    private WicketApplication wicketApplication;


    @Before
    public void setUp() {
        tester = new WicketTester(wicketApplication);
    }


    @Test
    public void homepageRendersSuccessfully() {
        //start and render the test page
        tester.startPage(HomePage.class);

        //assert rendered page class
        tester.assertRenderedPage(HomePage.class);
        tester.assertComponent("version", Label.class);

        tester.assertComponent("springWorking", Label.class);
        tester.assertLabel("springWorking", "Working");
    }

}
