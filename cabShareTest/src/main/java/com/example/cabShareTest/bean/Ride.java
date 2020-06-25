package com.example.cabShareTest.bean;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "RIDE")
public class Ride {

	@Id
	@GeneratedValue
	@Column(name = "rideid", unique = true, nullable = false)
	private Integer rideid;

	public void setRideid(Integer rideid) {
		this.rideid = rideid;
	}


	@Column(name = "pricePerTraveller", unique = false, length = 100)
	private Double pricePerTraveller;

	@Column(name = "riderName", unique = false, length = 100)
	private String riderName;


	@Column(name = "carType", unique = false, length = 100)
	private String carType;

	@Column(name = "seats", unique = false, length = 100)
	private Integer seats;

	@Column(name = "source", unique = false, length = 100)
	private String source;

	@Column(name = "destination", unique = false, length = 100)
	private String destination;
	
	@Column
	private String departureDateString;
	
	@Column(name = "homepickup", unique = false, length = 100)
	private Boolean homepickup;

	@Column
	private Integer userId;
	
	@Column
	private String imageUrl;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date departureDate;
	
	@Column(name = "distanceTravelled", unique = false, length = 50)
	private Long distanceTravelled;
	
	
	public Long getDistanceTravelled() {
		return distanceTravelled;
	}

	public void setDistanceTravelled(Long distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
	public Boolean getHomepickup() {
		return homepickup;
	}

	public void setHomepickup(Boolean homepickup) {
		this.homepickup = homepickup;
	}

	public String getDepartureDateString() {
		return departureDateString;
	}

	public void setDepartureDateString(String departureDateString) {
		this.departureDateString = departureDateString;
	}


	
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	

	public Date getDepartureDate() {
		return departureDate;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String ImageUrl) {
		imageUrl = ImageUrl;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer UserId) {
		userId = UserId;
	}

	
	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}


	
	public Integer getRideid() {
		return rideid;
	}

	public String getRiderName() {
		return riderName;
	}

	public void setRiderName(String riderName) {
		this.riderName = riderName;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seat) {
		seats = seat;
	}


	public Double getPricePerTraveller() {
		return pricePerTraveller;
	}

	public void setPricePerTraveller(Double pricePerTraveller) {
		this.pricePerTraveller = pricePerTraveller;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}


	@Override
	public String toString() {
		return "Ride [rideid=" + rideid + 
				 " pricePerTraveller=" + pricePerTraveller + ", riderName=" + riderName + ", carType=" + carType + ", Seats=" + seats
				+ ", source=" + source + ", Destination="
				+ destination + ", DepartureDate=" + departureDate + "]";
	}
	
}
