package com.vault.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="JOB")
@Entity
public class Job implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2801322555466744389L;
	@GeneratedValue
	@Id
	@Column(name="JOB_ID")
	private int id;	
	@Column(name="JOB_TITLE")
	private String title;	
	@Column(name="MIN_SALARY")
	private int minSalary;
	@Column(name="MAX_SALARY")
	private int maxSalary;

	
	public Job(int id, String title, int minSalary, int maxSalary) {
		this.id = id;
		this.title = title;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}
	public Job(){
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}
	
	public int getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}
	
}
