package com.codeclan.example.EmployerLab.controllers;

import com.codeclan.example.EmployerLab.models.Employee;
import com.codeclan.example.EmployerLab.repositories.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")


public class EmployeeController {

    @Autowired
    EmployeeRespository employeeRespository;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return  employeeRespository.findAll();
    }

    @GetMapping(value = "{id}")
    public Employee getEmployee(@PathVariable long id) {
        return employeeRespository.findById(id).get();
    }

}
