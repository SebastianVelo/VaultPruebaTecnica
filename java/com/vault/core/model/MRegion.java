package com.vault.core.model;

import com.vault.core.entity.Region;

public class MRegion {

	private int id;	
	private String name;	
	
	
	public MRegion(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public MRegion(Region region) {
		this(region.getId(), region.getName());
	}
	public MRegion(){
		
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
	
}
