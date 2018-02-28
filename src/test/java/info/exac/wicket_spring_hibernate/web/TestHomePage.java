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
 * JUnit test ready to test current wicket application. Supports Spring dependency injection with current
 * application context.
 *
 * @author Miroslav Exner
 * @date 28/02/2018 14:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
@DirtiesContext(classMode= DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class TestHomePage extends AbstractJUnit4SpringContextTests{


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



    @Test
    public void homepageRendersSuccessfully() {
        // Start and render the test page
        tester.startPage(HomePage.class);

        // Asert rendered page class
        tester.assertRenderedPage(HomePage.class);

        // Assert rendered components
        tester.assertComponent("version", Label.class);
        tester.assertComponent("springWorking", Label.class);

        // Assert value of label
        tester.assertLabel("springWorking", "Working");
    }


}
