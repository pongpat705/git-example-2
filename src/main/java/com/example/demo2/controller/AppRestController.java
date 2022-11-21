package com.example.demo2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

    @GetMapping("/xxxx")
    public String getIndex(){
        System.out.println("get index");
        return "xxx";
    }

}
