package com.emp.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.model.Employee;

public interface iEmployeeRepository extends JpaRepository<Employee, Integer> {

}
