package com.codeclan.example.ABGCourseLab;

import com.codeclan.example.ABGCourseLab.models.Booking;
import com.codeclan.example.ABGCourseLab.models.Course;
import com.codeclan.example.ABGCourseLab.models.Customer;
import com.codeclan.example.ABGCourseLab.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.ABGCourseLab.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.ABGCourseLab.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AbgCourseLabApplicationTests {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void	canGetCoursesWithCertainStarRating() {
		List<Course> results = courseRepository.getCoursesWithRating(5);
		assertEquals(1, results.size());
	}

	@Test
    public void canGetCustomersOnCourse() {
	    List<Customer> results = customerRepository.getCustomersFromCourse("JavaScript");
	    assertEquals(1, results.size());
    }

    @Test
    public void canGetCoursesFromCustomer() {
	    List<Course> results = courseRepository.getCoursesFromCustomer("Peter");
	    assertEquals(2, results.size());
    }

    @Test
    public void canGetBookingsByDate() {
	    List<Booking> results = bookingRepository.getAllBookingsByDate("01-08-2018");
	    assertEquals(2, results.size());
    }
}
