package com.codeclan.example.EmployerLab;

import com.codeclan.example.EmployerLab.models.Employee;
import com.codeclan.example.EmployerLab.repositories.EmployeeRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployerLabApplicationTests {

	@Autowired
	EmployeeRespository employeeRespository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void	canCreateAndSaveEmployee() {
		Employee employee = new Employee("Colin", 32, 1234567, "colin@colins.com");
		employeeRespository.save(employee);
	}

}
