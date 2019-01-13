package com.vault.core.controller;

import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vault.core.entity.Department;
import com.vault.core.model.MEmployee;
import com.vault.core.service.DepartmentService;
import com.vault.core.service.EmployeeService;

@RestController
@RequestMapping("/v1")
public class DepartmentController {

	@Autowired
	@Qualifier("DepartmentService")
	DepartmentService departmentService;
	
	@Autowired
	@Qualifier("EmployeeService")
	EmployeeService employeeService;
	
	
	@PutMapping("/department")
	public boolean addDepartment(@RequestBody @Valid Department department){
		List<MEmployee> memployees = employeeService.getByLocationId(department.getLocationId());
		float prom = calculatePromSalary(memployees);
		int max = Calendar.DATE < 15 ? 1000 : 1500;
		if(prom > max)
			return false;
		return departmentService.create(department);	
	}

	
	public float calculatePromSalary(List<MEmployee> memployees){
		float acum = 0;
		for(MEmployee memployee : memployees){
			acum += memployee.getSalary();
		}
		return acum / memployees.size();
	}
}
