package com.sakib.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sakib.hibernate.entity.Student;

public class PrimaryKey {

	public static void main(String[] args) {
		
		// Create session factory
		SessionFactory sessionFactory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			// Create 3 student object 
			System.out.println("Creating 3 student object...");
			Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
			Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
			Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");
			
			// Start a transaction
			session.beginTransaction();
			
			
			// Save the student object
			System.out.println("Saving the students...");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			// Commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
			
		} finally {
			sessionFactory.close();
		}

	}

}
