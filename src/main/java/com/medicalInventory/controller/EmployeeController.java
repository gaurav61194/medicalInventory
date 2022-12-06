package com.medicalInventory.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicalInventory.dto.Employee;
import com.medicalInventory.services.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployee(){
		return employeeService.getEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@Valid @PathVariable("id") long id)throws Throwable  {
		return employeeService.getEmployeeById(id);
	}
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee){
		employee = employeeService.addEmployee(employee);
		ResponseEntity<Employee> emp = new ResponseEntity<>(employee, HttpStatus.OK);
		return emp;
		
	}
	
	@PutMapping("/employee/{id}")
	public ResponseEntity <Employee> updateEmployee(@Valid @PathVariable("id") long id, @RequestBody Employee employee) throws Throwable{
		Employee emp = employeeService.getEmployeeById(id);
		
		
		emp.setFirstName(employee.getFirstName());
		emp.setLastName(employee.getLastName());
		emp.setDob(employee.getDob());
		emp.setAddress(employee.getAddress());
		emp.setContactNumber(employee.getContactNumber());
		emp.setEmailId(employee.getEmailId());
		emp.setRole(employee.getRole());
		
		Employee updateEmployee = employeeService.upadateEmployee(emp);
		
		return ResponseEntity.ok(updateEmployee);
		
	}
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity <String> deleteEmployeeById(@Valid @PathVariable("id") long id)throws Throwable{
		employeeService.deleteEmployeeById(id);
		return new ResponseEntity<>("Employee deleted sucessfully..!", HttpStatus.OK);
	}
}
