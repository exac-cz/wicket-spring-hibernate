package info.exac.wicket_spring_hibernate.web.page.detail;

import info.exac.wicket_spring_hibernate.entity.Person;
import info.exac.wicket_spring_hibernate.service.PersonService;
import info.exac.wicket_spring_hibernate.web.page.abstract_bootstrap.AbstractBootstrapWebPage;
import info.exac.wicket_spring_hibernate.web.panel.PersonPanel;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;



/**
 * @author exac
 * @date 04/03/2018 16:42
 */
public class PersonDetailPage extends AbstractBootstrapWebPage {


    @SpringBean
    private PersonService personService;


    private IModel<Person> model;



    public PersonDetailPage(PageParameters parameters) {
        super(parameters);

        long personId = parameters.get("personId").toLong();

        model = new LoadableDetachableModel<Person>() {
            @Override
            protected Person load() {
                return personService.getPerson(personId);
            }
        };

        initComponents();
    }



    private void initComponents() {
        add(new FeedbackPanel("feedbackPanel"));

        add(new PersonPanel("personalPanel", model));

    }


}
