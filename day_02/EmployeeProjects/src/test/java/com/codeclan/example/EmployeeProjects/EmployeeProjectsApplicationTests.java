package com.codeclan.example.EmployeeProjects;

import com.codeclan.example.EmployeeProjects.models.Department;
import com.codeclan.example.EmployeeProjects.models.Employee;
import com.codeclan.example.EmployeeProjects.models.Project;
import com.codeclan.example.EmployeeProjects.repositories.DepartmentRepository;
import com.codeclan.example.EmployeeProjects.repositories.EmployeeRepository;
import com.codeclan.example.EmployeeProjects.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeProjectsApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    ProjectRepository projectRepository;


	@Test
	public void contextLoads() {
	}

    @Test
    public void createEmployeeAndDepartment() {
        Department department = new Department("HR");
        departmentRepository.save(department);

        Employee employee = new Employee("Bob", "Smith", 12345, department);
        employeeRepository.save(employee);
    }

    @Test
    public void addEmployeesAndProjects() {
	    Department department = new Department("IT");
	    departmentRepository.save(department);

	    Employee employee = new Employee("Tam", "Scoobie", 54321, department);
	    employeeRepository.save(employee);

        Project project = new Project("Java", 5);
        projectRepository.save(project);

        project.addEmployee(employee);
        projectRepository.save(project);
    }

}
