package com.examania.schdata.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/healthCheck")
    public String HealthCheck(){
        return "OK";
    }
}
