package com.sakib.learningspring;

public class BaseballCoach implements Coach{

    // Define a private field for the dependency
    private FortuneService fortuneService;

    // Define a constructor for the dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
