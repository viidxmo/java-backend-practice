package com.viidxmo.backendpractice.controller;

import com.viidxmo.backendpractice.dto.GreetingRequest;
import com.viidxmo.backendpractice.dto.GreetingResponse;
import com.viidxmo.backendpractice.service.GreetingService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    private final GreetingService greetingService;


    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @PostMapping("/greet")
    public GreetingResponse greet(@Valid @RequestBody GreetingRequest request){
        String response = greetingService.generateGreeting(request.name());
        return new GreetingResponse(response);
    }
}
