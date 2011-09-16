package tour.spring.bc.model.vo;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
@MappedSuperclass
public abstract class Place {

	
	private String name;
	private Country country;
	
	@Transient
	public abstract void setId(long id);
	@Transient
	public abstract long getId();
	
	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne
	@JoinColumn(name="country_id")
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
}
