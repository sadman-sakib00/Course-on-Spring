package com.sakib.learningspring;

import com.sakib.learningspring.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
}
