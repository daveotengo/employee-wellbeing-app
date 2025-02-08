package com.dee.employeewellbeingapp.controller;

import com.dee.employeewellbeingapp.dto.EmployeeDTO;
//import com.dee.employeewellbeingapp.mapper.EmployeeMapper;
import com.dee.employeewellbeingapp.mapper.EmployeeMapper;
import com.dee.employeewellbeingapp.model.Employee;
import com.dee.employeewellbeingapp.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeMapper employeeMapper;
    private final EmployeeService employeeService;

    @GetMapping("")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getById(id);
    }

    @PostMapping("")
    public Employee addEmployee(@RequestBody EmployeeDTO employeeDTO){
        Employee employee = employeeMapper.toEntity(employeeDTO);
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO employeeDTO){
        Employee employee = employeeMapper.toEntity(employeeDTO);
        return employeeService.updateById(id,employee);
    }
}
