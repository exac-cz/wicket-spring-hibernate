package info.exac.wicket_spring_hibernate.web.panel;

import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.validation.validator.StringValidator;



/**
 * @author exac
 * @date 04/03/2018 15:17
 */
public class PersonPanel extends Panel {



    public PersonPanel(String id, IModel<?> model) {
        super(id, model);
        initComponents();
    }



    private void initComponents() {
        TextField<String> nameTextField = new TextField<>("name", new PropertyModel<>(getDefaultModel(), "name"));
        nameTextField.add(StringValidator.maximumLength(100));
        add(nameTextField);
    }


}
