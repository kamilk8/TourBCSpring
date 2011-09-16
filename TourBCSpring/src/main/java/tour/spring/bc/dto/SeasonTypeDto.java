package tour.spring.bc.dto;


public class SeasonTypeDto {
	
	private String type;
	private double seasonPriceRatio;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getSeasonPriceRatio() {
		return seasonPriceRatio;
	}
	public void setSeasonPriceRatio(double seasonPriceRatio) {
		this.seasonPriceRatio = seasonPriceRatio;
	}
}
