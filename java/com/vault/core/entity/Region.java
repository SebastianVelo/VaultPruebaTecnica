package com.vault.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="REGION")
@Entity
public class Region implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4703679952616378088L;
	@GeneratedValue
	@Id
	@Column(name="REGION_ID")
	private int id;	
	@Column(name="REGION_NAME")
	private String name;	
	
	public Region(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Region(){
		
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
