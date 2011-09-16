package tour.spring.bc.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class SeasonType {

	private long id;
	private String type;
	private double seasonPriceRatio;
	
	@Column(name="season_type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Column(name="season_price_ratio")
	public double getSeasonPriceRatio() {
		return seasonPriceRatio;
	}
	public void setSeasonPriceRatio(double seasonPriceRatio) {
		this.seasonPriceRatio = seasonPriceRatio;
	}
	@Column
	@Id
	@SequenceGenerator(name="seasontype_seq", sequenceName="seasontype_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seasontype_seq")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
}
