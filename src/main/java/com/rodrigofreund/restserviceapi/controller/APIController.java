package com.rodrigofreund.restserviceapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping(value = "getvalue")
    public ResponseEntity<String> getValue() {
        String message = System.getProperty("message");
        if(message.isBlank()) {
            message = "Empty message";
        }
        return ResponseEntity.ok(message);
    }
    
}
