package com.vijay.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.employeemanagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}