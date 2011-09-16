package tour.spring.bc.dao.impl;

import org.springframework.stereotype.Repository;

import tour.spring.bc.dao.PlaceDao;
import tour.spring.bc.model.vo.Place;

@Repository
public class PlaceDaoImpl extends AbstractHibernateDAOImpl<Place> implements PlaceDao {

		public PlaceDaoImpl() {
			super(Place.class);
		}

}
