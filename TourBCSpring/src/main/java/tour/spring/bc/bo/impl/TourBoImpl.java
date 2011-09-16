package tour.spring.bc.bo.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tour.spring.bc.assembler.TourAssembler;
import tour.spring.bc.bo.TourBo;
import tour.spring.bc.dao.TourDao;
import tour.spring.bc.dto.ConcreteTourDto;
import tour.spring.bc.dto.FoodTypeDto;
import tour.spring.bc.dto.TourDto;

@Service
public class TourBoImpl implements TourBo {
	// @Resource()
	// public Properties messages;
	@Autowired
	private TourDao tourDao;

	@Autowired
	private TourAssembler tourAssembler;

	public Collection<TourDto> queryAll() {
		return tourAssembler.convertToDto(tourDao.loadAll());
	}

	@Override
	public Collection<ConcreteTourDto> queryAllConcrete() {
		Collection<TourDto> tours = queryAll();
		Collection<ConcreteTourDto> cts = new ArrayList<ConcreteTourDto>(
				tours.size());
		for (TourDto tourDto : tours) {
			for (FoodTypeDto ft : tourDto.getFoodTypeList()) {
				ConcreteTourDto ct = new ConcreteTourDto(tourDto);
				ct.setFoodType(ft);
				calculateFinalPrice(ct);
				cts.add(ct);
			}
		}
		return cts;
	}

	public void calculateFinalPrice(ConcreteTourDto tDto) {
		// na podstawie typy jedzenia
		// oraz typu sezonu (pobranego na podstawie dat)
		// obliczyc tourDto.price
	}

	public Collection<TourDto> searchTours(TourSearchParameters params) {
		return searchTours(params, false);
	}

	public Collection<TourDto> searchTours(TourSearchParameters params,
			boolean countFreePlaces) {

		return null;
	}
}
