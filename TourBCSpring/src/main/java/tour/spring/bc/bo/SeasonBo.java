package tour.spring.bc.bo;

import java.util.Collection;
import java.util.Date;

import tour.spring.bc.dto.SeasonTypeDto;

public interface SeasonBo {
	public Collection<SeasonTypeDto> queryAllSeasonType();
//	public SeasonTypeDto getSeasonTypeByDates(Date dateFrom, Date dateTo);
}
