package tour.spring.bc.dao.impl;

import org.springframework.stereotype.Repository;

import tour.spring.bc.dao.HotelDao;
import tour.spring.bc.model.vo.Hotel;

@Repository
public class HotelDaoImpl extends AbstractHibernateDAOImpl<Hotel> implements HotelDao {

	public HotelDaoImpl() {
		super(Hotel.class);
	}

}
