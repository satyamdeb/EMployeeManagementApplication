package com.badbot.employeemanagement.employee.controller;

import com.badbot.employeemanagement.employee.entity.Employee;
import com.badbot.employeemanagement.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "*")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping()
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeService.addEmployee(employee);
    }

    @GetMapping()
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{employeeCode}")
    public Optional<Employee> deleteEmployeeByEmployeeCode(@PathVariable("employeeCode") String employeeCode){
        return employeeService.deleteEmployeeByEmployeeCode(employeeCode);
    }

}
