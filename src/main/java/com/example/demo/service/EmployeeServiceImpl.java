package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeRepo.findAll();
	}

	@Override
	public void addEmployee(Employee emp) {
		employeeRepo.save(emp);	
	}
	
}
