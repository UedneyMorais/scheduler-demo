package com.example.scheduler.tasks;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronTask {

    @Scheduled(cron = "0 17 14 * * *")
    public void cronJob(){
        System.out.println("[cronJob]: Rodando em"+ LocalDateTime.now());
    }


    @Scheduled(cron = "30 17 14 * * *")
    public void cronJob2(){
        System.out.println("[cronJob2]: Rodando em"+ LocalDateTime.now());
    }


    
}
