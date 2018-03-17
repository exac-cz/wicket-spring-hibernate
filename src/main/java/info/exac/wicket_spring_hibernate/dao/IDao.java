package info.exac.wicket_spring_hibernate.dao;

/**
 * Created by exac on 16/03/2018.
 */
public interface IDao<T> {


    T findById(Object id);


    T persist(T entity);


    T merge(T entity);


}
