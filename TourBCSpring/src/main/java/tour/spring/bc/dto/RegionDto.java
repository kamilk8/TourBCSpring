package tour.spring.bc.dto;

import java.util.Collection;

public class RegionDto extends PlaceDto{

	
	private Collection<String> citiesNames;

	public Collection<String> getCitiesNames() {
		return citiesNames;
	}

	public void setCitiesNames(Collection<String> citiesNames) {
		this.citiesNames = citiesNames;
	}
	
	
}
