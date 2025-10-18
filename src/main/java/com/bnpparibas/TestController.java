package com.bnpparibas;


import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/getData")
    public ResponseEntity<String> getData(){

        return  new ResponseEntity<>("Hello", HttpStatusCode.valueOf(200));
    }
}
