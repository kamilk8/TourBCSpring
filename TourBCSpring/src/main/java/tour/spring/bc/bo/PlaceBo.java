package tour.spring.bc.bo;

import java.util.Collection;

import tour.spring.bc.dto.PlaceDto;


public interface PlaceBo {

	public Collection<PlaceDto> queryAllPlaces();
}
