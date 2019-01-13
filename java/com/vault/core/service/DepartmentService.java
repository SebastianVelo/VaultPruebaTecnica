package com.vault.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vault.core.converter.DepartmentConverter;
import com.vault.core.entity.Department;
import com.vault.core.model.MDepartment;
import com.vault.core.repository.DepartmentRepository;

@Service("DepartmentService")
public class DepartmentService {
	@Autowired
	@Qualifier("DepartmentRepository")
	private DepartmentRepository repository;
	
	@Autowired
	@Qualifier("DepartmentConverter")
	private DepartmentConverter converter;
	
	public boolean create(Department department){
		try{
			repository.save(department);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public List<MDepartment> getByLocationId(int locationId){
		try{
		    return converter.convertToDepartments(repository.findByLocationId(locationId));
		}catch(Exception e){
			return null;
		}
	}
}
