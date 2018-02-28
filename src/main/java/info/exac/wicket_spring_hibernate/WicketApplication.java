package info.exac.wicket_spring_hibernate;

import info.exac.wicket_spring_hibernate.web.HomePage;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;



/**
 *
 * Must be marked with @Component annotation and context aware, because of correct working
 * dependecy injection in testing.
 *
 * @author Miroslav Exner
 * @date 28/02/2018 13:56
 */
@Component
public class WicketApplication extends WebApplication implements ApplicationContextAware {


    /** Application context - is necessary be set this way for testing work correctly */
    private ApplicationContext ctx;



    @Override
    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }



    @Override
    protected void init() {
        super.init();

        // Enable Spring Injector
        getComponentInstantiationListeners().add(new SpringComponentInjector(this, ctx, true));


    }



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }

}
