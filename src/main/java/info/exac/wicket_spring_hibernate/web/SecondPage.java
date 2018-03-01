package info.exac.wicket_spring_hibernate.web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;



/**
 * @author exac
 * @date 28/02/2018 20:26
 */
public class SecondPage extends WebPage {

    public SecondPage(PageParameters parameters) {
        super(parameters);

        add(new Label("helloLabel", "Hello"));
    }

}
