package com.sakib.learningspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LearningManualConfigurationWithJavaApp {
    public static void main(String[] args) {

        // Read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // Calling swim coach methods that has values injected from properties file
        System.out.println("Email: " + theCoach.getEmail());
        System.out.println("Team: " + theCoach.getTeam());

        // Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // Call a method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        // Close the context
        context.close();

    }
}
