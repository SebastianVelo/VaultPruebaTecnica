package com.vault.core.model;

import java.sql.Date;

import com.vault.core.entity.JobHistory;

public class MJobHistory {

	private int employeeId;	
	private Date startDate;	
	private Date endDate;
	private int jobId;	
	private int departmentId;
	
	
	public MJobHistory(int employeeId, Date startDate, Date endDate, int jobId, int departmentId) {
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.jobId = jobId;
		this.departmentId = departmentId;
	}
	public MJobHistory(JobHistory jobHistory){
		this(jobHistory.getEmployeeId(), jobHistory.getStartDate(), jobHistory.getEndDate(), jobHistory.getJobId(), jobHistory.getDepartmentId());		
	}
	public MJobHistory(){
		
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
}
