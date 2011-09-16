package tour.spring.bc.bo.impl;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tour.spring.bc.assembler.SeasonTypeAssembler;
import tour.spring.bc.bo.SeasonBo;
import tour.spring.bc.dao.SeasonDao;
import tour.spring.bc.dao.SeasonTypeDao;
import tour.spring.bc.dto.SeasonTypeDto;

@Service
public class SeasonBoImpl implements SeasonBo {
//	@Autowired
//	private SeasonDao seasonDao;
	@Autowired
	private SeasonTypeDao seasonTypeDao;

	@Autowired
	private SeasonTypeAssembler seasonTypeAssembler;

	public Collection<SeasonTypeDto> queryAllSeasonType() {
		return seasonTypeAssembler.convertToDto(seasonTypeDao.loadAll());
	}

//	public SeasonTypeDto getSeasonTypeByDates(Date dateFrom, Date dateTo) {
//		return seasonTypeAssembler.convertToDto(seasonDao.getSeasonTypeByDates(
//				dateFrom, dateTo));
//	}

}
