package tour.spring.bc.bo.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tour.spring.bc.assembler.PlaceAssembler;
import tour.spring.bc.bo.PlaceBo;
import tour.spring.bc.dao.PlaceDao;
import tour.spring.bc.dto.PlaceDto;

@Service
public class PlaceBoImpl implements PlaceBo{
	@Autowired
	private PlaceDao placeDao;
	
	@Autowired
	private PlaceAssembler placeAssembler;

	public Collection<PlaceDto> queryAllPlaces(){
		return placeAssembler.convertToDto(placeDao.loadAll());
	}
}
