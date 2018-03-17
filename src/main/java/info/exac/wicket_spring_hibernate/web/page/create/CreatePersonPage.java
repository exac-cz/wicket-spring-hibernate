package info.exac.wicket_spring_hibernate.web.page.create;

import info.exac.wicket_spring_hibernate.entity.Person;
import info.exac.wicket_spring_hibernate.service.PersonService;
import info.exac.wicket_spring_hibernate.web.page.abstract_bootstrap.AbstractBootstrapWebPage;
import info.exac.wicket_spring_hibernate.web.page.detail.PersonDetailPage;
import info.exac.wicket_spring_hibernate.web.panel.PersonPanel;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;



/**
 * @author exac
 * @date 04/03/2018 16:00
 */
public class CreatePersonPage extends AbstractBootstrapWebPage {

    @SpringBean
    private PersonService personService;


    public CreatePersonPage(PageParameters parameters) {
        super(parameters);
        initComponents();
    }



    private void initComponents() {
        IModel<Person> model = Model.of(new Person());

        Form<Person> form = new Form<Person>("form", model) {
            @Override
            protected void onSubmit() {
                super.onSubmit();
                personService.savePerson(this.getModel().getObject());
                setResponsePage(PersonDetailPage.class, new PageParameters().add("personId", this.getModel().getObject().getId()));
                getSession().success("Success");
            }
        };
        add(form);

        form.add(new PersonPanel("personPanel", model));

    }



}
