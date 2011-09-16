package tour.spring.bc.dto;

import java.util.Date;

public abstract class AbstractTourDto {
	private long id;
	private int placeQuantity;
	private Date dateFrom;
	private Date dateTo;
	private HotelDto hotelDto;
	private double basePrice;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getPlaceQuantity() {
		return placeQuantity;
	}
	public void setPlaceQuantity(int placeQuantity) {
		this.placeQuantity = placeQuantity;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	public HotelDto getHotelDto() {
		return hotelDto;
	}
	public void setHotelDto(HotelDto hotelDto) {
		this.hotelDto = hotelDto;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
}
