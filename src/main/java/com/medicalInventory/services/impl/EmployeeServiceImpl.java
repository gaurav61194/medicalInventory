package com.medicalInventory.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalInventory.dto.Employee;
import com.medicalInventory.exceptions.ResourceNotFoundException;
import com.medicalInventory.services.EmployeeService;
import com.medicalInventory.dao.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
    private EmployeeRepository employeeRepo;

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
    public Object addEmployee(Employee employee) throws ResourceNotFoundException
    {
		Employee existingDoctor = employeeRepo.findByEmailId(employee.getEmailId());
        if(existingDoctor == null)
        {
            return employeeRepo.save(employee);
        }
        else
        {
            return "Employee Already Exists with this EmailID!";
        }
    }
	
	@Override
	public Employee upadateEmployee(Employee employee) throws ResourceNotFoundException{
		return employeeRepo.save(employee);
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

