package com.learnToDeploy.DeployLearn.controller;

import com.learnToDeploy.DeployLearn.model.Users;
import com.learnToDeploy.DeployLearn.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Sample {
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/")
    public String initial(){
        return "Running Successful";
    }

    @GetMapping("/hello")
    public String getHello(){
        return "Hello world";
    }

    @GetMapping("/hello/{name}")
    public String getHelloWithName(@PathVariable String name){
        return "Hello " + Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }


    @PostMapping("/add/{name}")
    public ResponseEntity<?> addNewUser(@PathVariable String name){
        Users u = new Users();
        u.setName(name);
        return new ResponseEntity<>(usersRepository.save(u), HttpStatus.OK);
    }

    @PostMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(usersRepository.findAll(), HttpStatus.OK);
    }
}
