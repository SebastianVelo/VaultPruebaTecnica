package com.vault.core.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="JOB_HISTORY")
@Entity
public class JobHistory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6616559974056458363L;

	@Column(name="EMPLOYEE_ID")
	private int employeeId;	
	@Column(name="START_DATE")
	private Date startDate;	
	@Column(name="END_DATE")
	private Date endDate;	
	@Column(name="JOB_ID")
	private int jobId;	
	@Column(name="DEPARTMENT_ID")
	private int departmentId;
	
	
	public JobHistory(int employeeId, Date startDate, Date endDate, int jobId, int departmentId) {
		super();
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.jobId = jobId;
		this.departmentId = departmentId;
	}	
	public JobHistory(){
		
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
