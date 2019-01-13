package com.vault.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="COUNTRY")
@Entity
public class Country implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4269493034060280654L;
	@GeneratedValue
	@Id
	@Column(name="COUNTRY_ID")
	private int id;	
	@Column(name="COUNTRY_NAME")
	private String name;
	@Column(name="REGION_ID")
	private int regionId;	
	
	public Country(int id, String name, int regionId) {
		this.id = id;
		this.name = name;
		this.regionId = regionId;
	}
	public Country(){
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getRegionId() {
		return regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

}
