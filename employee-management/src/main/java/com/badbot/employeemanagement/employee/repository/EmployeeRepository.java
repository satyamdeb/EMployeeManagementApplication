package com.badbot.employeemanagement.employee.repository;

import com.badbot.employeemanagement.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> deleteByEmployeeCode(String employeeCode);
}
