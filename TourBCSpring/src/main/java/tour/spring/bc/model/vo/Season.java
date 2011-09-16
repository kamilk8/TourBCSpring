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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.AnyMetaDef;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.MetaValue;

@Entity
public class Season {

	private long id;
	private Date dateFrom;
	private Date dateTo;
	private SeasonType seasonType;
	private List<Place> place;
	
	@ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name="seasontype_id") 
	public SeasonType getSeasonType() {
		return seasonType;
	}
	public void setSeasonType(SeasonType seasonType) {
		this.seasonType = seasonType;
	}
	
	@ManyToAny(
			metaColumn = @Column( name = "place_type" ) )
			@AnyMetaDef(
			    idType = "integer",
			    metaType = "string",
			    metaValues = {
			@MetaValue( value = "C", targetEntity = City.class ),
			@MetaValue( value = "R", targetEntity = Region.class ) } )
			@Cascade( { org.hibernate.annotations.CascadeType.ALL } )

	@JoinTable(name = "SeasonPlace",
			joinColumns = @JoinColumn(name = "place_id"),
			inverseJoinColumns = @JoinColumn(name = "season_id"))
	public List<Place> getPlace() {
		return place;
	}
	public void setPlace(List<Place> place) {
		this.place = place;
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
	
	@Column
	@Id
	@SequenceGenerator(name="season_seq", sequenceName="season_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="season_seq")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
