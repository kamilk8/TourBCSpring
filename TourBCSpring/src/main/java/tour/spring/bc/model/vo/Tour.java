package tour.spring.bc.model.vo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Tour {

	private long id;
	private int placeQuantity;
	private Date dateFrom;
	private Date dateTo;
	private Hotel hotel;
//	private Season season;
	private List<FoodType> foodType;
	private List<Room> rooms;
	
	@ManyToMany
	@JoinTable(name = "TourFoodType",
			joinColumns = @JoinColumn(name = "tour_id"),
			inverseJoinColumns = @JoinColumn(name = "foodtype_id"))
	public List<FoodType> getFoodType() {
		return foodType;
	}
	public void setFoodType(List<FoodType> foodType) {
		this.foodType = foodType;
	}
	
	@Column(name="place_quantity")
	public int getPlaceQuantity() {
		return placeQuantity;
	}
	public void setPlaceQuantity(int placeQuantity) {
		this.placeQuantity = placeQuantity;
	}
	
	@Column(name="date_from")
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	
	@Column(name="date_to")
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	
	@ManyToOne
	@JoinColumn(name="hotel_id")
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	@ManyToMany
	@JoinTable(name = "TourRoom",
			joinColumns = @JoinColumn(name = "tour_id"),
			inverseJoinColumns = @JoinColumn(name = "room_id"))
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
//	@ManyToMany
//	public Season getSeason() {
//		return season;
//	}
//	public void setSeason(Season season) {
//		this.season = season;
//	}
	
	@Column
	@Id
	@SequenceGenerator(name="tour_seq", sequenceName="tour_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="tour_seq")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
