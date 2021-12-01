package com.application.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class HomeController {
  
  @GetMapping("/greet")
  public ResponseEntity<?> greet() {
    String message = "Welcome dear, how're you ?";
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(message);
  }
}