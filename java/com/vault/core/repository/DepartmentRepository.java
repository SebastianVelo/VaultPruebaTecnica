package com.vault.core.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.vault.core.entity.Department;

@Repository("DepartmentRepository")
public interface DepartmentRepository extends JpaRepository<Department, Serializable>, PagingAndSortingRepository<Department, Serializable>{

	public abstract Department findById(int id);
	public abstract List<Department> findByLocationId(int locationId);
}
