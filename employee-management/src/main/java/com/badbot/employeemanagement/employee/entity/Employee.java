package com.badbot.employeemanagement.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.GeneratorStrategy;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dbId;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String profilePicture;
    @Column(updatable = false, nullable = false)
    private String employeeCode;

}
