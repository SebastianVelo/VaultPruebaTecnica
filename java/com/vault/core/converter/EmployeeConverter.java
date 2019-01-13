package com.vault.core.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.vault.core.entity.Employee;
import com.vault.core.model.MEmployee;

@Component("EmployeeConverter")
public class EmployeeConverter {
	
	public List<MEmployee> convertToEmployees(Iterable<Employee> employees){
		List<MEmployee> memployees = new ArrayList<>();
		for(Employee employee : employees){
			memployees.add(new MEmployee(employee));
		}
		return memployees;
	}
	
}
