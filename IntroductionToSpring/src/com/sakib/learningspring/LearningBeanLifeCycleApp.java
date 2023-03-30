package com.sakib.learningspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LearningBeanLifeCycleApp {

    public static void main(String[] args) {

        // Load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        //Close the context
        context.close();
    }

}
