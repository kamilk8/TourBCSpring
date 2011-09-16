package tour.spring.bc.bo;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import tour.spring.bc.AbstractBoTest;
import tour.spring.bc.dto.PlaceDto;
import tour.spring.bc.dto.RegionDto;

public class PlaceBoTest extends AbstractBoTest {

	@Autowired
    private PlaceBo placeBo;
	
	@Test
	public void testQueryAllPlaces(){
		Collection<PlaceDto> places = placeBo.queryAllPlaces();
		Assert.assertNotNull(places);
		Assert.assertEquals(countRowsInTable("city") + countRowsInTable("region"), places.size());
		
		for (PlaceDto place : places) {
			Assert.assertNotNull(place.getId());
			Assert.assertTrue(StringUtils.hasLength(place.getCountryName()));
			Assert.assertTrue(StringUtils.hasLength(place.getName()));
			if(place instanceof RegionDto) {
				Assert.assertNotNull(((RegionDto)place).getCitiesNames());// nie chce dostaæ nulla tylko zawsze pust¹ liste
			}
			
		}
	}
}
