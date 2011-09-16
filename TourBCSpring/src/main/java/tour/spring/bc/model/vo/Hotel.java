package tour.spring.bc.model.vo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Any;
import org.hibernate.annotations.AnyMetaDef;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.MetaValue;

@Entity
public class Hotel {

	private long id;
	private List<Room> rooms;
	private List<FoodType> foodType;
	private Place place;
	private String name;

	@OneToMany(mappedBy="hotel")
	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	@ManyToMany
	@JoinTable(name = "HotelFoodType", 
			joinColumns = @JoinColumn(name = "hotel_id"), 
			inverseJoinColumns = @JoinColumn(name = "foodtype_id"))
	public List<FoodType> getFoodType() {
		return foodType;
	}

	public void setFoodType(List<FoodType> foodType) {
		this.foodType = foodType;
	}

	@Any(metaColumn = @Column(name = "place_type"), fetch = FetchType.EAGER)
	@AnyMetaDef(idType = "integer", metaType = "string", metaValues = {
			@MetaValue(value = "C", targetEntity = City.class),
			@MetaValue(value = "R", targetEntity = Region.class) })
	@Cascade({ CascadeType.ALL })
	@JoinColumn(name = "place_id")
	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	@Column
	@Id
	@SequenceGenerator(name="hotel_seq", sequenceName="hotel_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="hotel_seq")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
