package com.example.javademo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sunny
 * @date 2022/10/27 16:27
 */
@RestController
@RequestMapping("/demo")
public class TestController {


    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
