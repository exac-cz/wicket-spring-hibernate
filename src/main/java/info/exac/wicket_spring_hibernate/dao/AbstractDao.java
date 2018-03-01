package info.exac.wicket_spring_hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



/**
 * @author exac
 * @date 28/02/2018 22:30
 */
public abstract class AbstractDao {


    @PersistenceContext
    private EntityManager entityManager;



    protected EntityManager getEntityManager() {
        return entityManager;
    }

}
