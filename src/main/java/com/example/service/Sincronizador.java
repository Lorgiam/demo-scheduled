package com.example.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Sincronizador implements  ISincronizador{



    @Scheduled(fixedDelayString = "${fixed.delay.string}")
    @Override
    public void Test() {
        System.out.println("Tarea Automatica Inicio");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tarea Automatica Fin");
    }
}
