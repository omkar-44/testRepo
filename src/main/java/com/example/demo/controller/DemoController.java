package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
//added comment from development
    @GetMapping(value="/demo")
    public void getDemo(){
        System.out.println("Hello world");
    }
}
