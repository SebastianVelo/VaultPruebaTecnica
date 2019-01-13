package com.vault.core.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vault.core.entity.Employee;
import com.vault.core.model.MEmployee;
import com.vault.core.service.EmployeeService;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

	@Autowired
	@Qualifier("EmployeeService")
	EmployeeService employeeService;
	
	@PutMapping("/employee")
	public boolean addEmployee(@RequestBody @Valid Employee employee){
		return employeeService.create(employee);	
	}
	
	@PostMapping("/employee")
	public boolean updateEmployee(@RequestBody @Valid Employee employee){
		return employeeService.update(employee);	
	}

	@DeleteMapping("/employee/{id}")
	public boolean deleteEmployee(@PathVariable("id") int id){
		return employeeService.delete(id);
	}
	
	@GetMapping("/employee/{pageNumber}/{pageSize}")
	public List<MEmployee> getEmployees(@PathVariable("pageNumber")int pageNumber,
										@PathVariable("pageSize") int pageSize){
		return employeeService.getAll(pageNumber, pageSize);
	}
	
	@GetMapping("/employee/{id}")
	public MEmployee getEmployee(@PathVariable("id") int id){
		return employeeService.getById(id);
	}
	
	@GetMapping("/employee/{lastName}/{managerId}/{jobId}")
	public List<MEmployee> getEmployee(@PathVariable("lastName") String lastName, 
								 @PathVariable("managerId") int managerId, 
								 @PathVariable("jobId") int jobId, 
								 @PathVariable("pageNumber")int pageNumber,
								 @PathVariable("pageSize") int pageSize){
		return employeeService.getBy(lastName, managerId, jobId, pageNumber, pageSize);
	}
	
}
