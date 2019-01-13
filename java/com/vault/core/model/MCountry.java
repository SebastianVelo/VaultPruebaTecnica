package com.vault.core.model;

import com.vault.core.entity.Country;

public class MCountry {

	private int id;	
	private String name;
	private int regionId;	
	
	public MCountry(int id, String name, int regionId) {
		this.id = id;
		this.name = name;
		this.regionId = regionId;
	}
	public MCountry(Country country){
		this(country.getId(), country.getName(), country.getRegionId());		
	}
	public MCountry(){
		
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
