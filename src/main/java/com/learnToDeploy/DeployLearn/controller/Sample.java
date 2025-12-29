package com.learnToDeploy.DeployLearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello world";
    }

    @GetMapping("/hello/{name}")
    public String getHelloWithName(@PathVariable String name){
        return "Hello world  " + Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }
}
