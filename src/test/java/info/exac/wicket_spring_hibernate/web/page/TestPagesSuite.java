package info.exac.wicket_spring_hibernate.web.page;

import info.exac.wicket_spring_hibernate.web.page.create.CreatePersonPageTest;
import info.exac.wicket_spring_hibernate.web.page.list.PersonListPageTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



/**
 * @author exac
 * @date 17/03/2018 23:43
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        CreatePersonPageTest.class,
        PersonListPageTest.class
})
public class TestPagesSuite {
}
