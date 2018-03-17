package info.exac.wicket_spring_hibernate.dao.impl;

import info.exac.wicket_spring_hibernate.dao.IDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;



/**
 * @author exac
 * @date 16/03/2018 19:20
 */
public abstract class AbstractDaoImpl<T> implements IDao<T> {


    private static final Logger logger = LoggerFactory.getLogger(AbstractDaoImpl.class);


    @PersistenceContext
    private EntityManager em;



    public abstract Class<T> getEntityClass();



    @Override
    public T findById(Object id) {
        return em.find(getEntityClass(), id);
    }



    public List<T> findAll() {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(getEntityClass());
        criteriaQuery.select(criteriaQuery.from(getEntityClass()));

        List<T> result = em.createQuery(criteriaQuery).getResultList();

        if (result == null) {
            result = Collections.emptyList();
        }

        return result;
    }



    @Override
    @Transactional
    public T persist(T entity) {
        getEm().persist(entity);
        return entity;
    }



    @Override
    @Transactional
    public T merge(T entity) {
        return getEm().merge(entity);
    }



    @Transactional
    public void remove(T entity) {
        getEm().remove(
                getEm().contains(entity) ? entity : merge(entity));
    }



    @Transactional
    public void removeById(Object id) {
        T entity = findById(id);
        remove(entity);
    }



    // --- Getters/Setters ------



    public EntityManager getEm() {
        return em;
    }


}
