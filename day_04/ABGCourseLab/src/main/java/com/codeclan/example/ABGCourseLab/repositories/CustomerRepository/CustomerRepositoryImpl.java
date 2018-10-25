package com.codeclan.example.ABGCourseLab.repositories.CustomerRepository;

import com.codeclan.example.ABGCourseLab.models.Course;
import com.codeclan.example.ABGCourseLab.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom{
    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> getCustomersFromCourse(String courseName) {
         List<Customer> results = null;
         Session session = entityManager.unwrap(Session.class);
         try {
             Criteria cr = session.createCriteria(Customer.class);
             cr.createAlias("bookings", "booking");
             cr.createAlias("booking.course", "course");
             cr.add(Restrictions.eq("course.name", courseName));
             results = cr.list();
         } catch (HibernateException ex) {
             ex.printStackTrace();
        } finally {
             session.close();
         }
         return results;
    }
}
