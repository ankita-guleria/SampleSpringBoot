package com.sampleSpringBoot.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "HotelData")
public class HotelData {

	@Column(name = "Id", unique = true, nullable = false)
	@GenericGenerator(name = "hotelSequence", strategy = "sequence", parameters = {
			@org.hibernate.annotations.Parameter(name = "hotelSequence", value = "sequence"),
			@org.hibernate.annotations.Parameter(name = "allocationSize", value = "1"), })
	@GeneratedValue(generator = "hotelSequence", strategy = GenerationType.SEQUENCE)
	@Id
	private long id;
	@Column(name = "noOfGuest")
	private int noOfGuest;
	@Column(name = "name")
	private String name;
	@Column(name = "idProof")
	private String idProof;
	@Column(name = "contact")
	private String contact;
	@Column(name = "typeOfRoom")
	private String typeOfRoom;
	@Column(name = "checkInDate")
	private String checkInDate;
	@Column(name = "checkOutDate")
	private String checkOutDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNoOfGuest() {
		return noOfGuest;
	}
	public void setNoOfGuest(int noOfGuest) {
		this.noOfGuest = noOfGuest;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdProof() {
		return idProof;
	}
	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getTypeOfRoom() {
		return typeOfRoom;
	}
	public void setTypeOfRoom(String typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
	
}
