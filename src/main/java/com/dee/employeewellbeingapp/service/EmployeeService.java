package com.dee.employeewellbeingapp.service;

import com.dee.employeewellbeingapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface EmployeeService {
    Employee addEmployee(Employee employee);
    Optional<Employee> getEmployeeByName(String name);

    Employee getById(Long id);

    List<Employee> getAllEmployees();

    void deleteById(Long id);

    Employee updateById(Long id,Employee employee);
}
