package com.arifsynchron.springcompositekeydemo.reposirtory;

import com.arifsynchron.springcompositekeydemo.entity.Employee;
import com.arifsynchron.springcompositekeydemo.entity.EmployeePKId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, EmployeePKId> {
}
