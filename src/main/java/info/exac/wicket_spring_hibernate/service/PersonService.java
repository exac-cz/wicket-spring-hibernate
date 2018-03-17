package info.exac.wicket_spring_hibernate.service;

import info.exac.wicket_spring_hibernate.entity.Person;



/**
 * @author exac
 * @date 04/03/2018 16:35
 */
public interface PersonService {

    void savePerson(Person person);

    Person getPerson(long personId);

}
