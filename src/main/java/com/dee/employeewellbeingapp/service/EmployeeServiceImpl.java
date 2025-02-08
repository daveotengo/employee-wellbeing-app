package com.dee.employeewellbeingapp.service;

import com.dee.employeewellbeingapp.model.Employee;
import com.dee.employeewellbeingapp.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repository;

    @Override
    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Optional<Employee> getEmployeeByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Employee getById(Long id) {
        Optional<Employee> employee = repository.findById(id);
        return employee.orElse(new Employee());
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Employee updateById(Long id,Employee employee) {
        boolean employeeExists = repository.existsById(id);
        //done because we are going to map the dto to entity in controller and pass it
        if(employeeExists){
            employee.setId(id);
            return repository.save(employee);
        } else{
            return null;
        }
    }
}
