package tour.spring.bc.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import tour.spring.bc.dao.SeasonDao;
import tour.spring.bc.model.vo.Season;
import tour.spring.bc.model.vo.SeasonType;

public class SeasonDaoImpl extends AbstractHibernateDAOImpl<Season> implements SeasonDao {

	public SeasonDaoImpl() {
		super(Season.class);
	}
	
	public SeasonType getSeasonTypeByDates(Date dateFrom, Date dateTo) {
		DetachedCriteria crit = DetachedCriteria.forClass(getEntityClass());
		crit.add(Restrictions.le("dateFrom", dateFrom));
		crit.add(Restrictions.ge("dateTo", dateTo));
		List<Season> list = getHibernateTemplate().findByCriteria(crit);
		return list.get(0).getSeasonType();
	}

}
