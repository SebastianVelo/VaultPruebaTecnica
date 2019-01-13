package com.vault.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.vault.core.converter.EmployeeConverter;
import com.vault.core.entity.Employee;
import com.vault.core.model.MEmployee;
import com.vault.core.repository.EmployeeRepository;

@Service("EmployeeService")
public class EmployeeService {
	@Autowired
	@Qualifier("EmployeeRepository")
	private EmployeeRepository repository;
	
	@Autowired
	@Qualifier("EmployeeConverter")
	private EmployeeConverter converter;
	
	public boolean create(Employee employee){
		try{
			repository.save(employee);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	public boolean update(Employee employee){
		try{
			repository.save(employee);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public boolean delete(int id){
		try{
			Employee employee = repository.findById(id);
			if(employee == null)
				throw new Exception("El empleado no existe.");
			repository.delete(employee);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public MEmployee getById(int id){
		return new MEmployee(repository.findById(id));
	}
	
	public List<MEmployee> getAll(int pageNumber, int pageSize){
		try{
		    PageRequest page = new PageRequest(pageNumber,pageSize);
			return converter.convertToEmployees(repository.findAll(page));
		}catch(Exception e){
			return null;
		}
	}	

	public List<MEmployee> getByJobId(int jobId, int pageNumber, int pageSize){
		try{
		    PageRequest page = new PageRequest(pageNumber,pageSize);
		    return converter.convertToEmployees(repository.findByJobIdOrderByHireDateAsc(jobId, page));
		}catch(Exception e){
			return null;
		}
	}	
	public List<MEmployee> getByManagerId(int managerId, int pageNumber, int pageSize){
		try{
		    PageRequest page = new PageRequest(pageNumber,pageSize);
		    return converter.convertToEmployees(repository.findByManagerIdOrderByHireDateAsc(managerId, page));
		}catch(Exception e){
			return null;
		}
	}	
	public List<MEmployee> getByLastName(String lastName, int pageNumber, int pageSize){
		try{
		    PageRequest page = new PageRequest(pageNumber,pageSize);
		    return converter.convertToEmployees(repository.findByLastNameOrderByHireDateAsc(lastName, page));
		}catch(Exception e){
			return null;
		}
	}	
	public List<MEmployee> getBy(String lastName, int managerId, int jobId, int pageNumber, int pageSize){
		try{
		    PageRequest page = new PageRequest(pageNumber,pageSize);
		    return converter.convertToEmployees(repository.findByLastNameAndManagerIdAndJobIdOrderByHireDateAsc(lastName, managerId, jobId, page));
		}catch(Exception e){
			return null;
		}
	}
	public List<MEmployee> getByLocationId(int locationId){
		try{
		    return converter.convertToEmployees(repository.findByLocationId(locationId));
		}catch(Exception e){
			return null;
		}
	}
}
