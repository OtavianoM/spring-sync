package com.async.project;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class service {

    @Async
    public void execute() throws InterruptedException {
        System.out.println("Iniciando metodo");
        Thread.sleep(2000);
        System.out.println("Finalizando metodo");
        //System.out.println(2/0);
    }

}
