package tour.spring.bc.assembler;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import tour.spring.bc.dto.PlaceDto;
import tour.spring.bc.model.vo.Place;

@Component
public class PlaceAssembler {
	public PlaceDto convertToDto(Place place) {
		PlaceDto placeDto = new PlaceDto();
		placeDto.setId(place.getId());
		placeDto.setCountryName(place.getCountry().getName());
		placeDto.setName(place.getName());
		return placeDto;
	}
	
	public Collection<PlaceDto> convertToDto(Collection<Place> places) {
		ArrayList<PlaceDto> list = new ArrayList<PlaceDto>(); 
		for (Place place : places) {
			list.add(convertToDto(place));
		}
		return list;
	}
}
