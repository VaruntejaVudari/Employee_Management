package com.emp.Service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.Exception.ResourceNotFountException;
import com.emp.model.Employee;
@Service
public class EmployeeServiceImpl implements iEmployeeService {

	@Autowired
	iEmployeeRepository  employeeRepository;

	@Override
	public Integer saveEmployee(Employee employee) {
		Employee saveEmployee = employeeRepository.save(employee);
		return saveEmployee.getId();
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	
	

	@Override
	public Optional<Employee> getEmployee(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public void deleteEmployee(Integer id) {
	employeeRepository.deleteById(id); 
		
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer id) {
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
				()-> new ResourceNotFountException("Employee","id",id));
			existingEmployee.setFirstname(employee.getFirstname());
			existingEmployee.setLastname(employee.getLastname());
			existingEmployee.setEmail(employee.getEmail());
			
			//we will update the value first and then save the updated value
			employeeRepository.save(existingEmployee);
		return existingEmployee;
	}

	
		
		
		
	}

