package com.se.example.polls.controller;

import com.se.example.polls.config.CurrentUser;
import com.se.example.polls.config.UserPrincipal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/secured")
public class SecuredController {


    private static final Logger logger = LoggerFactory.getLogger(SecuredController.class);

    @GetMapping("/user/me")
    //per specified user role
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity getCurrentUser(@CurrentUser UserPrincipal currentUser) {
        return new ResponseEntity<>("Hello World for role USER !", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getHello(@CurrentUser UserPrincipal currentUser) {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}