package com.sakib.learningspring;

import com.sakib.learningspring.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
}
