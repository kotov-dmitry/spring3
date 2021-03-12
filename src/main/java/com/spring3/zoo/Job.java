package com.spring3.zoo;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Job {
    @Scheduled(cron = "1 * * * * *")
    public void job(){
        System.out.println(LocalDateTime.now());
    }
}
