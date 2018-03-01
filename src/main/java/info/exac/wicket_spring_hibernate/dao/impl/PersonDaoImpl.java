package info.exac.wicket_spring_hibernate.dao.impl;

import info.exac.wicket_spring_hibernate.dao.AbstractDao;
import info.exac.wicket_spring_hibernate.dao.PersonDao;
import info.exac.wicket_spring_hibernate.entity.Person;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;



/**
 * @author exac
 * @date 28/02/2018 22:20
 */
@Repository
public class PersonDaoImpl extends AbstractDao implements PersonDao {


    @Override
    @Transactional
    public Person getById(long id) {
        Person person = getEntityManager().find(Person.class, id);
        return person;
    }



    @Override
    @Transactional
    public Person persist(Person person) {
        getEntityManager().persist(person);
        return person;
    }



    @Override
    @Transactional
    public Person update(Person person) {
        getEntityManager().merge(person);
        return person;
    }


}
