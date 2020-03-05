package com.docker.first.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("")
public class HelloWorldController {

    @GetMapping(value = "/test")
    public ResponseEntity<String> home() {

        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://localhost:5051/1";
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
        return response;
    }
}