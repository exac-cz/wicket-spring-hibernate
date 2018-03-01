package info.exac.wicket_spring_hibernate.dao;

import info.exac.wicket_spring_hibernate.entity.Person;

import javax.transaction.Transactional;



/**
 * Created by exac on 28/02/2018.
 */
public interface PersonDao {
    @Transactional
    Person getById(long id);



    @Transactional
    Person persist(Person person);



    @Transactional
    Person update(Person person);
}
