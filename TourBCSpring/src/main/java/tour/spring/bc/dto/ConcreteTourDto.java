package tour.spring.bc.dto;


public class ConcreteTourDto extends AbstractTourDto {
	private double price;
	private FoodTypeDto foodType;
	
	
	public ConcreteTourDto() {
	}
	
	public ConcreteTourDto(TourDto t) {
		setDateFrom(t.getDateFrom());
		//pozostale settery oprocz FoodType
	}
	
	public FoodTypeDto getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodTypeDto foodType) {
		this.foodType = foodType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
