package info.exac.wicket_spring_hibernate.web.page.create;

import info.exac.wicket_spring_hibernate.web.HomePage;
import info.exac.wicket_spring_hibernate.web.page.AbstractPageTest;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;



/**
 * Created by exac on 17/03/2018.
 */
public class CreatePersonPageTest extends AbstractPageTest {

    @Test
    public void testPageRendered() {
        // Start and render the test page
        WicketTester tester = getTester();

        tester.startPage(CreatePersonPage.class);

        // Asert rendered page class
        tester.assertRenderedPage(CreatePersonPage.class);
    }


}