package tour.spring.bc.dao.impl;

import org.springframework.stereotype.Repository;

import tour.spring.bc.dao.SeasonTypeDao;
import tour.spring.bc.model.vo.SeasonType;

@Repository
public class SeasonTypeDaoImpl extends AbstractHibernateDAOImpl<SeasonType> implements SeasonTypeDao {

	public SeasonTypeDaoImpl() {
		super(SeasonType.class);
	}
	

}

