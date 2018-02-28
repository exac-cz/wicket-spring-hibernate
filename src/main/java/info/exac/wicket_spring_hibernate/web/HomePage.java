package info.exac.wicket_spring_hibernate.web;

import info.exac.wicket_spring_hibernate.service.BasicService;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;



/**
 * @author exac
 * @date 28/02/2018 13:59
 */
public class HomePage extends WebPage {


    @SpringBean
    private BasicService basicService;


    public HomePage(final PageParameters parameters) {
        super(parameters);

        add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
        add(new Label("springWorking", basicService.getSpringStatus()));


    }


}
