package tour.spring.bc.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import tour.spring.bc.dao.AbstractHibernateDAO;

/**
 * The Class HibernateDAOImpl.
 * 
 * @param <E>
 * 
 */
public class AbstractHibernateDAOImpl<E> implements AbstractHibernateDAO<E> {

    /** The hibernate template. */
    private HibernateTemplate hibernateTemplate;

    /** The entity class. */
    private final Class<E> entityClass;

    public AbstractHibernateDAOImpl(final Class<E> aEntityClass) {
        this.entityClass = aEntityClass;
        hibernateTemplate = new HibernateTemplate();
    }

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		hibernateTemplate.setSessionFactory(sessionFactory);
	}

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }
    
    public Class<E> getEntityClass() {
		return entityClass;
	}

	//    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(final E entity) {
        hibernateTemplate.delete(entity);

    }

//    @Transactional(propagation = Propagation.SUPPORTS)
    public E load(final long id) {
        return hibernateTemplate.get(entityClass, id);
    }
    
    public List<E> loadAll() {
        return hibernateTemplate.loadAll(entityClass);
    }
    
    
//    @Transactional(propagation = Propagation.SUPPORTS)
    public List<E> loadByNamedParam(final String queryString, String paramName, Object value) {
        return hibernateTemplate.findByNamedParam(queryString, paramName, value);
    }
    
//    @Transactional(propagation = Propagation.SUPPORTS)
    public List<E> loadByNamedParams(final String queryString, String paramNames[], Object values[]) {
        return hibernateTemplate.findByNamedParam(queryString, paramNames, values);
        //FIXME: czy dobrze?
    }

//    @Transactional(propagation = Propagation.SUPPORTS)
    public List<E> find(final String queryString, Object value) {
    	return hibernateTemplate.find(queryString, value);
    }
    
//    @Transactional(propagation = Propagation.SUPPORTS)
    public List<E> find(final String queryString, Object []values) {
    	return (List<E>)hibernateTemplate. find(queryString, values);
    	//FIXME: ??
    }


//    @Transactional(propagation = Propagation.REQUIRED)
    public void save(final E entity) {
        hibernateTemplate.saveOrUpdate(entity);
//        hibernateTemplate.refresh(entity);
//        hibernateTemplate.flush();
    }

}
