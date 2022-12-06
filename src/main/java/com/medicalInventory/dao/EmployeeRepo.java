package com.medicalInventory.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicalInventory.dto.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

		Optional<Employee> findByEmailId(String email);

		Employee save(long id);

		
}
