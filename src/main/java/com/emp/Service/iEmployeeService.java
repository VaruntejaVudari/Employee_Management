package com.emp.Service;

import java.util.List;
import java.util.Optional;

import com.emp.model.Employee;

public interface iEmployeeService {

	Integer saveEmployee(Employee employee);
	
	public List<Employee>getAllEmployee();
	
	Optional<Employee> getEmployee(Integer id);

	List<Employee> getAllEmployees();
	
	public void deleteEmployee(Integer id);
	
	Employee updateEmployee(Employee employee, Integer id);
	
	public void deleteAllEmployees();
	
}

