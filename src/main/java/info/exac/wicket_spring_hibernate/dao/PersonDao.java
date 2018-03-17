package info.exac.wicket_spring_hibernate.dao;

import info.exac.wicket_spring_hibernate.entity.Person;

import java.util.List;



/**
 * Created by exac on 28/02/2018.
 */
public interface PersonDao extends IDao<Person> {

    List<Person> findAll();

    void remove(Person person);

}
