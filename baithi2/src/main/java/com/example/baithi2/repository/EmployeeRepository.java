package com.example.baithi2.repository;

import com.example.baithi2.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}

