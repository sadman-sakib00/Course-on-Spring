package com.sakib.learningspring;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach() {

    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15minutes!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
