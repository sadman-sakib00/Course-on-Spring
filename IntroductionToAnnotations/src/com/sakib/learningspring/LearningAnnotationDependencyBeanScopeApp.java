package com.sakib.learningspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LearningAnnotationDependencyBeanScopeApp {

    public static void main(String[] args) {

        // Load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // Check if they're the same object
        boolean result = (theCoach == alphaCoach);

        // Print out the results
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        // Close the context
        context.close();
    }

}
