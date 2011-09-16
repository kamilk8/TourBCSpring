package tour.spring.bc.assembler;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tour.spring.bc.dto.ConcreteTourDto;
import tour.spring.bc.dto.TourDto;
import tour.spring.bc.model.vo.FoodType;
import tour.spring.bc.model.vo.Tour;

@Component
public class TourAssembler {
	@Autowired
	private FoodTypeAssembler foodTypeAssembler;
	@Autowired
	private HotelAssembler hotelAssembler;

	public TourDto convertToDto(Tour tour){
		TourDto tourDto = new TourDto();
		tourDto.setId(tour.getId());
		tourDto.setDateFrom(tour.getDateFrom());
		tourDto.setDateTo(tour.getDateTo());
		tourDto.setPlaceQuantity(tour.getPlaceQuantity());
		tourDto.setHotelDto(hotelAssembler.convertToDto(tour.getHotel()));
		for (FoodType ft : tour.getFoodType()) {
			tourDto.addFoodType(foodTypeAssembler.convertToDto(ft));
		}
		return tourDto;
	}
	
	public Collection<TourDto> convertToDto(Collection<Tour> tours) {
		ArrayList<TourDto> list = new ArrayList<TourDto>(); 
		for (Tour tour : tours) {
			list.add(convertToDto(tour));
		}
		return list;
	}
	
	public void setFoodTypeAssembler(FoodTypeAssembler foodTypeAssembler) {
		this.foodTypeAssembler = foodTypeAssembler;
	}

	public void setHotelAssembler(HotelAssembler hotelAssembler) {
		this.hotelAssembler = hotelAssembler;
	}
	
	
}
