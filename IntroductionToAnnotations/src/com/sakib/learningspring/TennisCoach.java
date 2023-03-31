package com.sakib.learningspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
//@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // Defining a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: Inside the default constructor.");
    }

    // Defining an init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    // Defining a destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
    }

    /*
    // Constructor injection
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
     */

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    /*
    // Defining a setter method
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: Inside setFortuneService() method.");
        this.fortuneService = fortuneService;
    }

     */

    /*
    // Defining a custom method for injection
    @Autowired
    public void aCustomMethod(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: Inside aCustomMethod()");
        this.fortuneService = fortuneService;
    }

     */

}
