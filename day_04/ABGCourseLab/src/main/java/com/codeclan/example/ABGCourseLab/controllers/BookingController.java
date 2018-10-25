package com.codeclan.example.ABGCourseLab.controllers;

import com.codeclan.example.ABGCourseLab.models.Booking;
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
@RequestMapping(value = "/bookings")
public class BookingController {
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> getAllBookingsForDate(@PathVariable String date) {
        return bookingRepository.getAllBookingsByDate(date);
    }

}
