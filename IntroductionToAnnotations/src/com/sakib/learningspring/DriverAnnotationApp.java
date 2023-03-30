package com.sakib.learningspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverAnnotationApp {

    public static void main(String[] args) {

        // Read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // Call a method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        // Close the context
        context.close();

    }

}
