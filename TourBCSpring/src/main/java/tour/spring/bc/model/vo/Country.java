package tour.spring.bc.model.vo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Country {

	private long id;
	private String name;

	@Column
	@Id
	@SequenceGenerator(name="country_seq", sequenceName="country_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="country_seq")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
