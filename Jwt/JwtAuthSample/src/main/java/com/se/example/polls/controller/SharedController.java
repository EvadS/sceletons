package com.se.example.polls.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/polls")
public class SharedController {

    private static final Logger logger = LoggerFactory.getLogger(SharedController.class);

    @GetMapping
    public ResponseEntity getHello() {
        return new ResponseEntity<>("Hello World from shared api! ", HttpStatus.OK);
    }
}
