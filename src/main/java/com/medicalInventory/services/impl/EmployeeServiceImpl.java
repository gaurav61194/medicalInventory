package com.medicalInventory.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalInventory.dao.EmployeeRepo;
import com.medicalInventory.dto.Employee;
import com.medicalInventory.exceptions.ResourceNotFoundException;
import com.medicalInventory.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
    private EmployeeRepo employeeRepo;

	@Override
	public List<Employee> getEmployee(){
	return employeeRepo.findAll();
	}
	
	@Override
	public Employee getEmployeeById(long id)throws ResourceNotFoundException{
		Optional<Employee> result = employeeRepo.findById(id);
		if(result.isPresent()) {
			return result.get();
		}
		else {
			throw new ResourceNotFoundException("Employee does not exists...!");
		}
	}
	
	@Override
	public Employee addEmployee(Employee employee) {
//		Optional<Employee> addEmployee = employeeRepo.findByEmailId(employee.getEmailId());
//		if(addEmployee.isPresent()) {
//			throw new ResourceNotFoundException("Employee already exist with given email: "+employee.getEmailId());
//		}
		return employeeRepo.save(employee);
	}
	
	@Override
	public Employee upadateEmployee(Employee emp)throws ResourceNotFoundException{
		return employeeRepo.save(emp);
	}
	
	@Override
	public Employee deleteEmployeeById(long id)throws ResourceNotFoundException{
		Optional<Employee> result = employeeRepo.findById(id);
		if(result.isPresent()) {
			employeeRepo.deleteById(id);
			return result.get();
		}
		else {
			throw new ResourceNotFoundException("Employee does not exists..does.!");
		}
	}

}

