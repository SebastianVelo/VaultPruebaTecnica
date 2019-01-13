package com.vault.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="LOCATION")
@Entity
public class Location implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2741279611616753590L;
	@GeneratedValue
	@Id
	@Column(name="LOCATION_ID")
	private int id;	
	@Column(name="STREET_ADDRESS")
	private String streetAddress;
	@Column(name="POSTAL_CODE")
	private String postalCode;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE_PROVINCE")
	private String stateProvince;
	@Column(name="COUNTRY_ID")
	private String countryId;
	
	
	public Location(int id, String streetAddress, String postalCode, String city, String stateProvince,
			String countryId) {
		super();
		this.id = id;
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
		this.city = city;
		this.stateProvince = stateProvince;
		this.countryId = countryId;
	}
	public Location(){
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getStateProvince() {
		return stateProvince;
	}
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

}
