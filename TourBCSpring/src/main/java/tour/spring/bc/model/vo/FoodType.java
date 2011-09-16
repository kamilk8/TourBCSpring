package tour.spring.bc.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class FoodType {

	private long id;
	private String type;
	private float foodPriceRatio;
	
	@Column(name="food_type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Column(name="food_price")
	public float getFoodPriceRatio() {
		return foodPriceRatio;
	}
	public void setFoodPriceRatio(float foodPriceRatio) {
		this.foodPriceRatio = foodPriceRatio;
	}
	
	@Column
	@Id
	@SequenceGenerator(name="foodtype_seq", sequenceName="foodtype_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="foodtype_seq")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
	
}
