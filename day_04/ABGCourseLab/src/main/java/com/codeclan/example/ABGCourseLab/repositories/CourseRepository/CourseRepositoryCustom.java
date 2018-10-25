package com.codeclan.example.ABGCourseLab.repositories.CourseRepository;

import com.codeclan.example.ABGCourseLab.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> getCoursesWithRating(int rating);
    List<Course> getCoursesFromCustomer(String customerName);
}
