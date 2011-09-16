package tour.spring.bc.dao;

import java.util.Collection;

import tour.spring.bc.bo.impl.TourSearchParameters;
import tour.spring.bc.model.vo.Tour;

public interface TourDao extends AbstractHibernateDAO<Tour>{
	Collection<Tour> searchTours(TourSearchParameters params, boolean countFreePlaces);
}
