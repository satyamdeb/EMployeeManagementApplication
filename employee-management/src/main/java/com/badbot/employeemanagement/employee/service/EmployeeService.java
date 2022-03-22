package com.badbot.employeemanagement.employee.service;

import com.badbot.employeemanagement.employee.entity.Employee;
import com.badbot.employeemanagement.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> deleteEmployeeByEmployeeCode(String employeeCode) {
        return employeeRepository.deleteByEmployeeCode(employeeCode);
    }
}
