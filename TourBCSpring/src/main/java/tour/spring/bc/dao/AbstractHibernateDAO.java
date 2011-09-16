package tour.spring.bc.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public interface AbstractHibernateDAO<E> {       

    HibernateTemplate getHibernateTemplate();
    
    void save(E entity);
    
    E load(long id);
    
    
    void delete(E entity);
    
    public List<E> loadByNamedParams(final String queryString, String paramNames[], Object values[]);
    
    public List<E> loadByNamedParam(final String queryString, String paramName, Object value);
    
    public List<E> find(final String queryString, Object []values);
    
    public List<E> find(final String queryString, Object value);
    
    public List<E> loadAll();
}
