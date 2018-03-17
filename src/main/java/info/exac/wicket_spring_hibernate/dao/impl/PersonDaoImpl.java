package info.exac.wicket_spring_hibernate.dao.impl;

import info.exac.wicket_spring_hibernate.dao.PersonDao;
import info.exac.wicket_spring_hibernate.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;



/**
 * @author exac
 * @date 28/02/2018 22:20
 */
@Repository
public class PersonDaoImpl extends AbstractDaoImpl<Person> implements PersonDao {


    @Override
    public Class<Person> getEntityClass() {
        return Person.class;
    }


    @Override
    public List<Person> findAll() {
        return super.findAll();
    }


}
