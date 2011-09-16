package tour.spring.bc.dao;

import java.util.Date;

import tour.spring.bc.model.vo.Season;
import tour.spring.bc.model.vo.SeasonType;

public interface SeasonDao extends AbstractHibernateDAO<Season> {
	 SeasonType getSeasonTypeByDates(Date dateFrom, Date dateTo);
}
