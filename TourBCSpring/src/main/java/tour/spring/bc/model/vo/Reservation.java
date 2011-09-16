package tour.spring.bc.model.vo;

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
public class Reservation {

	private long id;
	private int participantQuantity;
	private FoodType foodType;
	private Tour tour;
	private Client client; 
	private List<Room> rooms;

	@ManyToOne
	@JoinColumn(name="client_id")
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Column(name="participant_quantity")
	public int getParticipantQuantity() {
		return participantQuantity;
	}

	public void setParticipantQuantity(int participantQuantity) {
		this.participantQuantity = participantQuantity;
	}

	@ManyToOne
	@JoinColumn(name="tour_id")
	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	@ManyToOne
	@JoinColumn(name="foodtype_id")
	public FoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}
	
	@ManyToMany
	@JoinTable(name = "ReservationRoom",
			joinColumns = @JoinColumn(name = "reservation_id"),
			inverseJoinColumns = @JoinColumn(name = "room_id"))
	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	@Column
	@Id
	@SequenceGenerator(name="reservation_seq", sequenceName="reservation_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="reservation_seq")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
