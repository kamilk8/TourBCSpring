package tour.spring.bc.bo;

import java.util.Collection;

import tour.spring.bc.bo.impl.TourSearchParameters;
import tour.spring.bc.dto.ConcreteTourDto;
import tour.spring.bc.dto.TourDto;

public interface TourBo {
	Collection<TourDto> queryAll();
	Collection<ConcreteTourDto> queryAllConcrete();
	//FIXME
	Collection<TourDto> searchTours(TourSearchParameters params);
	public Collection<TourDto> searchTours(TourSearchParameters params,	boolean countFreePlaces);
}
