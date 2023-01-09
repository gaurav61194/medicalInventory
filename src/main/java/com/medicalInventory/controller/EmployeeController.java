package com.medicalInventory.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {
	
	Log logger = LogFactory.getLog(EmployeeController.class);
	
	@Autowired
	public EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployee(){
		return employeeService.getEmployee();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@Valid @PathVariable("id") long id)throws Throwable  {
		return employeeService.getEmployeeById(id);
	}
	
	@PostMapping("/employees")
	public Object addEmployee(@Valid @RequestBody Employee employee) throws Throwable{
		return employeeService.addEmployee(employee);
		
	}
	
	@PutMapping("/employees/{id}")
	public ResponseEntity <Employee> upadateEmployee(@Valid @PathVariable("id") Long id, @RequestBody Employee employeeDetails) throws Throwable{
		Employee emp = employeeService.getEmployeeById(id);
		
		emp.setFirstName(employeeDetails.getFirstName());
		emp.setLastName(employeeDetails.getLastName());
		emp.setDob(employeeDetails.getDob());
		emp.setAddress(employeeDetails.getAddress());
		emp.setContactNumber(employeeDetails.getContactNumber());
		emp.setEmailId(employeeDetails.getEmailId());
		emp.setRole(employeeDetails.getRole());
		
		Employee upadatedEmployee = employeeService.upadateEmployee(emp);
		
		return ResponseEntity.ok(upadatedEmployee);	
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity <String> deleteEmployeeById(@Valid @PathVariable("id") long id)throws Throwable{
		employeeService.deleteEmployeeById(id);
		return new ResponseEntity<>("Employee deleted sucessfully..!", HttpStatus.OK);
	}

}
