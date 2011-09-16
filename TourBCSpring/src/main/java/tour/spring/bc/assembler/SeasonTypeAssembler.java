package tour.spring.bc.assembler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import tour.spring.bc.dto.HotelDto;
import tour.spring.bc.dto.SeasonTypeDto;
import tour.spring.bc.model.vo.Hotel;
import tour.spring.bc.model.vo.Season;
import tour.spring.bc.model.vo.SeasonType;

@Component
public class SeasonTypeAssembler {
	
	public SeasonTypeDto convertToDto(SeasonType seasonType) {
		SeasonTypeDto seasonTypeDto = new SeasonTypeDto();
		seasonTypeDto.setType(seasonType.getType());
		seasonTypeDto.setSeasonPriceRatio(seasonType.getSeasonPriceRatio());
		return seasonTypeDto;
	}
	
	public Collection<SeasonTypeDto> convertToDto(Collection<SeasonType> seasonTypes) {
		ArrayList<SeasonTypeDto> list = new ArrayList<SeasonTypeDto>(); 
		for (SeasonType seasonType : seasonTypes) {
			list.add(convertToDto(seasonType));
		}
		return list;
	}
}
