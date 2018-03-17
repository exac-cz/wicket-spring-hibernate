package info.exac.wicket_spring_hibernate.service.impl;

import info.exac.wicket_spring_hibernate.dao.PersonDao;
import info.exac.wicket_spring_hibernate.entity.Person;
import info.exac.wicket_spring_hibernate.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * @author exac
 * @date 04/03/2018 16:35
 */
@Service
public class PersonServiceImpl implements PersonService {


    private PersonDao personDao;


    @Autowired
    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }



    @Override
    public void savePerson(Person person) {
        personDao.persist(person);
    }



    @Override
    public Person getPerson(long personId) {
        return personDao.findById(personId);
    }


}
