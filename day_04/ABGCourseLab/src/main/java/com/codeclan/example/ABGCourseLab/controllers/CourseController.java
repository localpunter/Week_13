package com.codeclan.example.ABGCourseLab.controllers;

import com.codeclan.example.ABGCourseLab.models.Course;
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
@RequestMapping(value = "/courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> getCoursesByRating(@PathVariable int rating) {
        return courseRepository.getCoursesWithRating(rating);
    }

    @GetMapping(value = "/customer/{name}")
    public List<Course> getCoursesByCustomer(@PathVariable String name) {
        return courseRepository.getCoursesFromCustomer(name);
    }
}
