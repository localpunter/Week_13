package com.codeclan.example.ABGCourseLab.controllers;

import com.codeclan.example.ABGCourseLab.models.Customer;
import com.codeclan.example.ABGCourseLab.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.ABGCourseLab.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.ABGCourseLab.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/course/{name}")
    public List<Customer> getAllCustomerForCourse(@PathVariable String name) {
        return customerRepository.getCustomersFromCourse(name);
    }
}
