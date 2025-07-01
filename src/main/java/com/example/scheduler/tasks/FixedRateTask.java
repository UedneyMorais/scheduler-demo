package com.example.scheduler.tasks;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FixedRateTask {
    
    @Scheduled(fixedRate = 5000)
    public void execute(){
        System.out.println("[FixedRateTask] Rodando: "+ LocalDateTime.now());
    }


}
