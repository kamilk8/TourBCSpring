package tour.spring.bc.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class RoomType {

	private long id;
	private int palceQuantity;
	private String standard;
	
	
	@Column
	@Id
	@SequenceGenerator(name="roomtype_seq", sequenceName="roomtype_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="roomtype_seq")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="place_quantity")
	public int getPalceQuantity() {
		return palceQuantity;
	}
	public void setPalceQuantity(int palceQuantity) {
		this.palceQuantity = palceQuantity;
	}
	
	@Column(name="standardd")
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	
}
