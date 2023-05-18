package com.sakib.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String user = "sakib";
		String pass = "password";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			Connection connection = 
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful!!!");
			
		} catch(Exception exception) {
			exception.printStackTrace();
		}
	}

}
