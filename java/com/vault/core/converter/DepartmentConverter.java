package com.vault.core.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.vault.core.entity.Department;
import com.vault.core.model.MDepartment;

@Component("DepartmentConverter")
public class DepartmentConverter {
	
	public List<MDepartment> convertToDepartments(Iterable<Department> departments){
		List<MDepartment> mdepartments = new ArrayList<>();
		for(Department department : departments){
			mdepartments.add(new MDepartment(department));
		}
		return mdepartments;
	}
	
}
