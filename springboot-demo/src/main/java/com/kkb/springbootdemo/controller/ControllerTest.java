package com.kkb.springbootdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {


    @GetMapping("/hello")
    public String hello() {
        return "略略略，你找到我了";
    }
}
