package com.example.scheduler.tasks;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class InitialDelayTask {
    
    @Scheduled(initialDelay = 6000)
    public void initialDelayExecute(){
        System.out.println("[initialDelay] Rodando em: "+LocalDateTime.now());
    }
}
