package com.medicalInventory.services.impl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import com.medicalInventory.dao.EmployeeRepo;
import com.medicalInventory.dto.Employee;
import com.medicalInventory.exceptions.ResourceNotFoundException;
import com.medicalInventory.services.EmployeeService;

class EmployeeServiceImplTest {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Test
	void testAddEmployee() {
		Employee e = new Employee();
		e.setId(1);
		e.setAddress("Mumbai");
		e.setContactNumber("9876543210");
		e.setEmailId("gaurav@123.com");
		e.setFirstName("Gaurav");
		e.setLastName("Anbhore");
		e.setDob("06/11/1994");
		e.setRole("Admin");
		Mockito.when(employeeRepo.save(e)).thenReturn(e);
		assertThat(employeeService.addEmployee(e)).isEqualTo(e);
		
		
	}
	
	@Test
	void testGetEmployeeById()throws ResourceNotFoundException{
		Employee e=new Employee();
		e.setId(50);
		e.setAddress("abc");
		e.setContactNumber("9876543210");
		e.setDob("06/05/1996");
		e.setEmailId("gaurva@gmail.com");
		e.setFirstName("Sujataanbhore");
		e.setLastName("anbhore");
		e.setRole("admin");
		
		Optional<Employee> e1=Optional.of(e);
		Mockito.when(employeeRepo.findById((long)50)).thenReturn(e1);
		assertThat(employeeService.getEmployeeById(50)).isEqualTo(e);
		
		
		
	}

}
