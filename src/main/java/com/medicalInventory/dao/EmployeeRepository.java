package com.medicalInventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicalInventory.dto.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Employee save(Long id);

	public Employee findByEmailId(String emailId);
	
}
