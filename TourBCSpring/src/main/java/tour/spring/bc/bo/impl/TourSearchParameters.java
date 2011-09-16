package tour.spring.bc.bo.impl;

import java.util.Collection;
import java.util.Date;

public class TourSearchParameters {
	private Date startDateFrom;
	private Date startDateTo;
	private int personCounter;
	private TourLength length;
	
	private Collection<Integer> placeIds;
	
	public TourSearchParameters(int personCounter, TourLength tourLength){
		this.personCounter=personCounter;
		this.length = tourLength;
	}

	public Date getStartDateFrom() {
		return startDateFrom;
	}

	public void setStartDateFrom(Date startDateFrom) {
		this.startDateFrom = startDateFrom;
	}

	public Date getStartDateTo() {
		return startDateTo;
	}

	public void setStartDateTo(Date startDateTo) {
		this.startDateTo = startDateTo;
	}

	public Collection<Integer> getPlaceIds() {
		return placeIds;
	}

	public void setPlaceIds(Collection<Integer> placeIds) {
		this.placeIds = placeIds;
	}

	public int getPersonCounter() {
		return personCounter;
	}

	public TourLength getLength() {
		return length;
	}
	
}
