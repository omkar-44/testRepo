package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//omkar/c02/
@RestController
public class DemoController {
//added comment from development
    @GetMapping(value="/demo")
    public void getDemo(){
        System.out.println("Hello world");
    }
}
