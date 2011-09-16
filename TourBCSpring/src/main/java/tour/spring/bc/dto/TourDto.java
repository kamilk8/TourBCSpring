package tour.spring.bc.dto;

import java.util.ArrayList;
import java.util.List;

public class TourDto extends AbstractTourDto {
	private List<FoodTypeDto> foodTypeList = new ArrayList<FoodTypeDto>();

	public List<FoodTypeDto> getFoodTypeList() {
		return foodTypeList;
	}
	public void setFoodTypeList(List<FoodTypeDto> foodTypeList) {
		this.foodTypeList = foodTypeList;
	}
	
	public void addFoodType(FoodTypeDto ft) {
		foodTypeList.add(ft);
	}

}
