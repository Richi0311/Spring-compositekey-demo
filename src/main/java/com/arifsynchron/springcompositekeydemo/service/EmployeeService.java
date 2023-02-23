package com.arifsynchron.springcompositekeydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arifsynchron.springcompositekeydemo.entity.Employee;
import com.arifsynchron.springcompositekeydemo.entity.EmployeePKId;
import com.arifsynchron.springcompositekeydemo.reposirtory.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository reposirtyRepository;
	
	
	public Employee getEmployeeById(EmployeePKId empId) {
		
		return reposirtyRepository.findById(empId).get();
		
	}

}
