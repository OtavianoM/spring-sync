package com.async.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAsync
public class HomeController {

    @Autowired
    service service;

    @GetMapping("/")
    public String execute() throws InterruptedException {

        long l = System.currentTimeMillis();
        service.execute();
        long f = System.currentTimeMillis();

        return String.valueOf(f - l);
    }

}
