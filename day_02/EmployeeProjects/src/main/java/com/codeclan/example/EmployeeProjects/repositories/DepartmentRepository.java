package com.codeclan.example.EmployeeProjects.repositories;

import com.codeclan.example.EmployeeProjects.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
