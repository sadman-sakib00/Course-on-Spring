package com.sakib.hibernate.practice;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sakib.hibernate.entity.Student;

public class CreateStudent {

	public static void main(String[] args) {
		
		// Create session factory
		SessionFactory sessionFactory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			// Use the session object to save Java object
			
			// Create a student object 
			System.out.println("Creating a new student object...");
			Student tempStudent = new Student("Paul", "Wall", "paul@luv2code.com");
			
			// Start a transaction
			session.beginTransaction();
			
			
			// Save the student object
			System.out.println("Saving the student...");
			session.save(tempStudent);
			
			// Commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
			
		} finally {
			sessionFactory.close();
		}
		
	}

}
