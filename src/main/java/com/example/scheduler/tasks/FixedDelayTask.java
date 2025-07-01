package com.example.scheduler.tasks;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FixedDelayTask {
    
    @Scheduled(fixedDelay = 5000)
    public void delayExecute(){
        System.out.println("[fixedDelay] Começando: "+LocalDateTime.now());
    }

}
