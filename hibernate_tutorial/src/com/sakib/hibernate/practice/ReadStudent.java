package com.sakib.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sakib.hibernate.entity.Student;

public class ReadStudent {
	
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
			Student tempStudent = new Student("Daffy", "Duck", "daffy@luv2code.com");
			
			// Start a transaction
			session.beginTransaction();
			
			
			// Save the student object
			System.out.println("Saving the student...");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			// Commit transaction
			session.getTransaction().commit();
			
			// Find out the student's id: primary key
			System.out.println("Saved student. Generated ID: "+tempStudent.getId());
			
			// Now get a new session and start transaction
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			// Retrieve student based on the ID: primary key
			System.out.println("\nGetting student with ID: " + tempStudent.getId());
			
			Student aStudent = session.get(Student.class, tempStudent.getId());
			
			System.out.println("Get complete: " + aStudent);
			
			// Commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
			
		} finally {
			sessionFactory.close();
		}
		
	}

}


