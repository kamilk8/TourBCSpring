package tour.spring.bc.model.vo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Region extends Place{

	private long id;
	private List<City> cities;

	@OneToMany(mappedBy="region")
	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
	@Column
	@Id
	@SequenceGenerator(name="region_seq", sequenceName="region_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="region_seq")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}	
	
}
