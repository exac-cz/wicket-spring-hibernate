package info.exac.wicket_spring_hibernate.dao.impl;

import info.exac.wicket_spring_hibernate.dao.PersonDao;
import info.exac.wicket_spring_hibernate.entity.Person;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;



/**
 * Created by exac on 28/02/2018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
//@DirtiesContext(classMode= DirtiesContext.ClassMode.AFTER_CLASS)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonDaoImplTest extends AbstractJUnit4SpringContextTests {


    @Autowired
    private PersonDao personDao;



    @Test
    public void test01getById() throws Exception {
        Person person = null;

        // Try to load something from empty DB
        person = personDao.findById(1L);
        assertNull(person);

        // Persist one record
        person = new Person();
        person.setName("Foo");
        Long id = personDao.persist(person).getId();
        assertNotNull(id);
        assertNotEquals((Long) 0L, id);
        person = null;

        // Retrieve that record
        person = personDao.findById(id);
        assertNotNull(person);
        assertEquals("Foo", person.getName());

        // Modifiy that record
        person.setName("Qux");
        id = personDao.merge(person).getId();
        person = null;

        // Retrieve that record
        person = personDao.findById(id);
        assertNotNull(person);
        assertEquals("Qux", person.getName());

        List<Person> persons = personDao.findAll();
        assertTrue(persons.size() > 0);

        // Remove record
//        personDao.remove(person);
//        person = null;
//        person = personDao.findById(id);
//        assertNull(person);

    }




}