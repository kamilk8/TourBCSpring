package tour.spring.bc.model.vo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class City extends Place{

	private long id;
	private Region region;
	
	
	@ManyToOne
	@JoinColumn(name="region_id")
	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Column
	@Id
	@SequenceGenerator(name="city_seq", sequenceName="city_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="city_seq")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
