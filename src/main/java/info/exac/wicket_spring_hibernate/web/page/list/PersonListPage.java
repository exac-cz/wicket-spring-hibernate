package info.exac.wicket_spring_hibernate.web.page.list;

import info.exac.wicket_spring_hibernate.web.page.abstract_bootstrap.AbstractBootstrapWebPage;
import info.exac.wicket_spring_hibernate.web.page.create.CreatePersonPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;



/**
 * @author exac
 * @date 04/03/2018 16:01
 */
public class PersonListPage extends AbstractBootstrapWebPage {


    public PersonListPage(PageParameters parameters) {
        super(parameters);
        initComponents();
    }



    private void initComponents() {
        add(new BookmarkablePageLink<CreatePersonPage>("createPersonLink", CreatePersonPage.class));
    }


}
