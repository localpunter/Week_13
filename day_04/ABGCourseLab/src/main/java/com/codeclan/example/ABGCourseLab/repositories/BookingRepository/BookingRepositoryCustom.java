package com.codeclan.example.ABGCourseLab.repositories.BookingRepository;

import com.codeclan.example.ABGCourseLab.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {
    List<Booking> getAllBookingsByDate(String date);
}
