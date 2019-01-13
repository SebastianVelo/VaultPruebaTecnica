package com.vault.core.model;

import java.sql.Date;

import com.vault.core.entity.Employee;

public class MEmployee {

	private int id;	
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hireDate;
	private int jobId;
	private float salary;
	private float comissionPct;
	private int managerId;
	private int departmentId;
	
	
	public MEmployee(int id, String firstName, String lastName, String email, String phoneNumber, Date hireDate,
			int jobId, float salary, float comissionPct, int managerId, int departmentId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
		this.comissionPct = comissionPct;
		this.managerId = managerId;
		this.departmentId = departmentId;
	}
	public MEmployee(Employee employee){
		this(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.getPhoneNumber(), employee.getHireDate(), employee.getJobId(), employee.getSalary(), employee.getComissionPct(), employee.getManagerId(), employee.getDepartmentId());	
	}
	public MEmployee(){
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public float getComissionPct() {
		return comissionPct;
	}
	public void setComissionPct(float comissionPct) {
		this.comissionPct = comissionPct;
	}
	
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	
	
}
