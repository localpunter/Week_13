package com.codeclan.example.ABGCourseLab.repositories.CustomerRepository;

import com.codeclan.example.ABGCourseLab.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> getCustomersFromCourse(String courseName);
}
