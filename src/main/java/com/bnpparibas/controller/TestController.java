package com.bnpparibas.controller;


import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/getData")
    public ResponseEntity<String> getData(){

        return  new ResponseEntity<>("Hello My name is Amit and his sister's name is diksha and mini", HttpStatusCode.valueOf(200));
    }
}
