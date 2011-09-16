package tour.spring.bc.assembler;

import org.springframework.stereotype.Component;

import tour.spring.bc.dto.FoodTypeDto;
import tour.spring.bc.model.vo.FoodType;

@Component
public class FoodTypeAssembler {

	public FoodTypeDto convertToDto(FoodType foodType){
		FoodTypeDto foodTypeDto = new FoodTypeDto();
		foodTypeDto.setId(foodType.getId());
		foodTypeDto.setFoodTypeName(foodType.getType());
		foodTypeDto.setFoodPriceRatio(foodType.getFoodPriceRatio());
		return foodTypeDto;
	}
}
