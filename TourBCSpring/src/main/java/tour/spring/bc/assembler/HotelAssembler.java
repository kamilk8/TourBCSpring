package tour.spring.bc.assembler;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import tour.spring.bc.dto.HotelDto;
import tour.spring.bc.model.vo.Hotel;

@Component
public class HotelAssembler {
	public HotelDto convertToDto(Hotel hotel) {
		HotelDto hotelDto = new HotelDto();
		hotelDto.setCityName(hotel.getPlace().getName());
		hotelDto.setCountryName(hotel.getPlace().getCountry().getName());
		hotelDto.setId(hotel.getId());
		hotelDto.setName(hotel.getName());
		return hotelDto;
	}
	
	public Collection<HotelDto> convertToDto(Collection<Hotel> hotels) {
		ArrayList<HotelDto> list = new ArrayList<HotelDto>(); 
		for (Hotel hotel : hotels) {
			list.add(convertToDto(hotel));
		}
		return list;
	}
}
