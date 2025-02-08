package com.dee.employeewellbeingapp.repository;

import com.dee.employeewellbeingapp.model.Employee;import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByName(String name);

}
