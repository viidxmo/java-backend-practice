package com.viidxmo.backendpractice.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String generateGreeting(String name){
        return "Hello, " + name;
    }
}
