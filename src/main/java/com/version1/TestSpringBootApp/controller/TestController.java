package com.version1.TestSpringBootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {

    @GetMapping
    public String testController() {
        return "Hello Everyone";
    }

    @GetMapping("/2")
    public String test() {
        return "2";
    }

}
