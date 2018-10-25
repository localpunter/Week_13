package com.codeclan.example.ABGCourseLab.components;

import com.codeclan.example.ABGCourseLab.models.Booking;
import com.codeclan.example.ABGCourseLab.models.Course;
import com.codeclan.example.ABGCourseLab.models.Customer;
import com.codeclan.example.ABGCourseLab.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.ABGCourseLab.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.ABGCourseLab.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {


        Course course1 = new Course("JavaScript", "Musselburgh", 5);
        Course course2 = new Course("Nonsense101", "Edinburgh", 3);
        Course course3 = new Course("Python", "Rosyth", 4);
        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);

        Customer customer1 = new Customer("Tony", "Glasgow", 35);
        Customer customer2 = new Customer("Maria", "London", 18);
        Customer customer3 = new Customer("Peter", "Dundee", 55);
        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);

        Booking booking1 = new Booking("17-02-2017", course1, customer1);
        Booking booking2 = new Booking("01-08-2018", course3, customer2);
        Booking booking3 = new Booking("01-08-2018", course3, customer3);
        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        bookingRepository.save(booking3);

    }
}
