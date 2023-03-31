package com.sakib.learningspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    // Defining a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: Inside the default constructor.");
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
