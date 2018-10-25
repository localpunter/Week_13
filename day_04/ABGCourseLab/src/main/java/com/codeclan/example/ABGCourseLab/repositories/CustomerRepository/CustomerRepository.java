package com.codeclan.example.ABGCourseLab.repositories.CustomerRepository;

import com.codeclan.example.ABGCourseLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
