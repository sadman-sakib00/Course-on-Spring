package com.sakib.learningspring;

import org.springframework.stereotype.Component;

@Component("theTennisCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
