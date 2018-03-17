package info.exac.wicket_spring_hibernate.web.page.abstract_bootstrap;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;



/**
 * @author exac
 * @date 17/03/2018 16:15
 */
public abstract class AbstractBootstrapWebPage extends WebPage {


    public AbstractBootstrapWebPage() {
    }



    public AbstractBootstrapWebPage(IModel<?> model) {
        super(model);
    }



    public AbstractBootstrapWebPage(PageParameters parameters) {
        super(parameters);
    }

}
