package com.example.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Sincronizador2 implements  ISincronizador2 {
    @Scheduled(fixedDelay = 3000)
    @Async
    @Override
    public void Test2() {
        System.out.println("Tarea TEst2");
    }
}
