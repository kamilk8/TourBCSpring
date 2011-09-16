package tour.spring.bc.model.vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Room {

	private long id;

	private String number;
	private RoomType roomType;
	private Hotel hotel;
	
	
    @ManyToOne
    @JoinColumn(name="hotel_id")
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Column
	@Id
	@SequenceGenerator(name="room_seq", sequenceName="room_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="room_seq")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Column
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="roomtype_id") 
	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

}
