package info.exac.wicket_spring_hibernate.service.impl;

import info.exac.wicket_spring_hibernate.dao.PersonDao;
import info.exac.wicket_spring_hibernate.service.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * @author Miroslav Exner
 * @date  2018-02-28
 */
@Service
public class BasicServiceImpl implements BasicService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BasicServiceImpl.class);


    private final PersonDao personDao;


    @Autowired
    public BasicServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }



    @Override
    public String getSpringStatus() {
        LOGGER.info("Doing something");
        return "Working";
    }

}
