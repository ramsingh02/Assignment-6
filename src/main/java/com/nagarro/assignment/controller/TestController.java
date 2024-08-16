package com.nagarro.assignment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/api")
public class TestController {

    @GetMapping
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("Test Controller", HttpStatus.OK);
    }

    @GetMapping("/check")
    public ResponseEntity<String> check(){
        return new ResponseEntity<>("Jenkins Push Test Controller", HttpStatus.OK);
    }
}
