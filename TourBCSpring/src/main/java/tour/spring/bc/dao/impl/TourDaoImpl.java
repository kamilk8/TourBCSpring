package tour.spring.bc.dao.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import tour.spring.bc.bo.impl.TourSearchParameters;
import tour.spring.bc.dao.TourDao;
import tour.spring.bc.model.vo.Tour;

@Repository
public class TourDaoImpl extends AbstractHibernateDAOImpl<Tour> implements TourDao{

	public TourDaoImpl() {
		super(Tour.class);
	}

	public Collection<Tour> searchTours(TourSearchParameters params, boolean countFreePlaces) {
		List<Tour> tours = new ArrayList<Tour>();
		DetachedCriteria crit = DetachedCriteria.forClass(getEntityClass());
		crit.add(Restrictions.ge("dateFrom", params.getStartDateFrom()));
		crit.add(Restrictions.le("dateTo", params.getStartDateTo()));
		crit.add(Restrictions.in("hotel.place.id", params.getPlaceIds()));
		List<Tour> list = getHibernateTemplate(
				).findByCriteria(crit);
		for (Tour tour : list) {
			Calendar c = Calendar.getInstance();
			c.setTime(tour.getDateTo());
//			c.
//			c.add(Calendar.DAY_OF_MONTH, tour.getDateFrom().)
//			if(tour.getDateFrom().)
		}
		return null;
	}
}
