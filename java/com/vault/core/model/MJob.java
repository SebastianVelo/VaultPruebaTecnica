package com.vault.core.model;

import com.vault.core.entity.Job;

public class MJob {

	private int id;
	private String title;
	private int minSalary;
	private int maxSalary;
	
	
	public MJob(int id, String title, int minSalary, int maxSalary) {
		this.id = id;
		this.title = title;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}
	public MJob(Job job){
		this(job.getId(), job.getTitle(), job.getMinSalary(), job.getMaxSalary());
	}
	public MJob(){
		
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
