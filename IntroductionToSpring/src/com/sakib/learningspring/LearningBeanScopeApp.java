package com.sakib.learningspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LearningBeanScopeApp {

    public static void main(String[] args) {

        // Load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // Check if these two are the same bean
        boolean result = theCoach ==alphaCoach;

        // Print out the result
        System.out.println("\nPointing to the same object: "+result);
        System.out.println("\nMemory location for theCoach: "+theCoach);
        System.out.println("\nMemory location for alphaCoach: "+alphaCoach);

        //Close the context
        context.close();
    }

}
