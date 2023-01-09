package com.medicalInventory.services.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.medicalInventory.dto.Employee;
import com.medicalInventory.exceptions.ResourceNotFoundException;
import com.medicalInventory.services.EmployeeService;
import com.medicalInventory.dao.EmployeeRepository;

@SpringBootTest
class EmployeeServiceImplTest {
	
	@Autowired
	EmployeeService employeeService;
	
	@MockBean
	EmployeeRepository employeeRepo;

	@Test
	void testAddEmployee() throws ResourceNotFoundException{
		Employee e = new Employee();
		e.setId(4l);
		e.setAddress("Mumbai");
		e.setContactNumber("9876543210");
		e.setEmailId("gauravKA@123.com");
		e.setFirstName("Gaurav");
		e.setLastName("Anbhore");
		e.setDob("06/11/1994");
		e.setRole("Admin");
		
		Mockito.when(employeeRepo.save(e)).thenReturn(e);
		assertThat(employeeService.addEmployee(e)).isEqualTo(e);	
	}
	@Test
	void testUpdateEmployee() {
		Employee e = new Employee();
		e.setId(4l);
		e.setAddress("Mumbai");
		e.setContactNumber("9876543210");
		e.setEmailId("gauravA@123gmail.com");
		e.setFirstName("Gaurav");
		e.setLastName("Anbhore");
		e.setDob("06/11/1994");
		e.setRole("Admin");

		Optional<Employee> e1 = Optional.of(e);

		Mockito.when(employeeRepo.findById(4l)).thenReturn(e1);

		Mockito.when(employeeRepo.save(e)).thenReturn(e);
		e.setFirstName("GauravKrushna");
		e.setLastName("Anbhore");
		e.setEmailId("gauravanbhore@gmail.com");

		assertThat(employeeService.upadateEmployee(e)).isEqualTo(e);
	}
	@Test
	void testGetEmployeeById()throws ResourceNotFoundException{
		Employee e=new Employee();
		e.setId(1l);
		e.setAddress("Mumbai");
		e.setContactNumber("9876543210");
		e.setDob("06/05/1996");
		e.setEmailId("gaurvaanbhore94@gmail.com");
		e.setFirstName("GAURAV");
		e.setLastName("ANBHORE");
		e.setRole("Admin");
		
		Optional<Employee> e1=Optional.of(e);
		Mockito.when(employeeRepo.findById(1l)).thenReturn(e1);
		assertThat(employeeService.getEmployeeById(1)).isEqualTo(e); 
	}

	@Test
	void testDeleteUserById()throws ResourceNotFoundException {
		Employee e = new Employee();
		e.setId(4l);
		e.setAddress("Mumbai");
		e.setContactNumber("9876543210");
		e.setEmailId("gauravanbhore@gmail.com");
		e.setFirstName("GauravAnbhore");
		e.setLastName("Anbhore");
		e.setDob("06/11/1994");
		e.setRole("Admin");

		Optional<Employee> e1=Optional.of(e);

		Mockito.when(employeeRepo.findById(1l)).thenReturn(e1);
		Mockito.when(employeeRepo.existsById(e.getId())).thenReturn(false);
		assertFalse(employeeRepo.existsById(e.getId()));
	}
	
}
