package com.codeclan.example.ABGCourseLab.repositories.CourseRepository;

import com.codeclan.example.ABGCourseLab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
