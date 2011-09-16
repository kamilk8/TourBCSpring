package tour.spring.bc.dto;

public class FoodTypeDto {

	private long id;
	private String foodTypeName;
	private float foodPriceRatio;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFoodTypeName() {
		return foodTypeName;
	}
	public void setFoodTypeName(String foodTypeName) {
		this.foodTypeName = foodTypeName;
	}
	public float getFoodPriceRatio() {
		return foodPriceRatio;
	}
	public void setFoodPriceRatio(float foodPriceRatio) {
		this.foodPriceRatio = foodPriceRatio;
	}
	
	
}
