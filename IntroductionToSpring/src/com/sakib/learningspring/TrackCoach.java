package com.sakib.learningspring;

public class TrackCoach implements Coach {

    // Define a private field for the dependency
    private FortuneService fortuneService;

    public TrackCoach() {

    }

    // Define a constructor for the dependency injection
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: "+fortuneService.getFortune();
    }
}
