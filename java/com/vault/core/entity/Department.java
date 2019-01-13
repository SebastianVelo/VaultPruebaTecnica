package com.vault.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="DEPARTMENT")
@Entity
public class Department implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6044431108496690525L;
	@GeneratedValue
	@Id
	@Column(name="DEPARTMENT_ID")
	private int id;	
	@Column(name="DEPARTMENT_NAME")
	private String name;	
	@Column(name="MANAGER_ID")
	private int managerId;
	@Column(name="LOCATION_ID")
	private int locationId;

	
	public Department(int id, String name, int managerId, int locationId) {
		this.id = id;
		this.name = name;
		this.managerId = managerId;
		this.locationId = locationId;
	}
	public Department(){
		
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
	
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	

}
