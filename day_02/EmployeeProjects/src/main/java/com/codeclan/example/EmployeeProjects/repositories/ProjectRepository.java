package com.codeclan.example.EmployeeProjects.repositories;

import com.codeclan.example.EmployeeProjects.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
