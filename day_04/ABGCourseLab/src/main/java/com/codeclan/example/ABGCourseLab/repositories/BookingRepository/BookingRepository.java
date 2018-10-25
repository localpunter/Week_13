package com.codeclan.example.ABGCourseLab.repositories.BookingRepository;

import com.codeclan.example.ABGCourseLab.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom{


}
