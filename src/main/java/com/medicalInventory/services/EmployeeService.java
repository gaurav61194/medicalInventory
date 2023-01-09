package com.medicalInventory.services;

import java.util.List;

import com.medicalInventory.dto.Employee;
import com.medicalInventory.exceptions.ResourceNotFoundException;

public interface EmployeeService {

	public List<Employee> getEmployee();
	
	public Employee getEmployeeById(long id)throws ResourceNotFoundException;

	public Object addEmployee(Employee employee);

	public Employee deleteEmployeeById(long id)throws ResourceNotFoundException;

	public Employee upadateEmployee(Employee employee)throws ResourceNotFoundException;

}
