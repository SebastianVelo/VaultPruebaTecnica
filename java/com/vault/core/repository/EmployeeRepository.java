package com.vault.core.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.vault.core.entity.Employee;

@Repository("EmployeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Serializable>, PagingAndSortingRepository<Employee, Serializable>{

	public abstract Employee findById(int id);
	public abstract List<Employee> findByDepartmentId(int departmentId);
	public abstract Page<Employee> findByJobIdOrderByHireDateAsc(int jobId, PageRequest page);
	public abstract Page<Employee> findByManagerIdOrderByHireDateAsc(int managerId, PageRequest page);
	public abstract Page<Employee> findByLastNameOrderByHireDateAsc(String lastName, PageRequest page);
	public abstract Page<Employee> findByLastNameAndManagerIdAndJobIdOrderByHireDateAsc(String lastName, int managerId, int jobId, PageRequest Page);
	@Query(
			value = "SELECT * FROM Employee e INNER JOIN Department d ON e.department_id = d.department_id AND d.location_id = ?1",
			nativeQuery = true)
	public abstract Page<Employee> findByLocationId(int locationId);
}
