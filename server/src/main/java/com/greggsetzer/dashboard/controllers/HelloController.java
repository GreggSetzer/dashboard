package com.greggsetzer.dashboard.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(HelloController.BASE_URL)
public class HelloController {
    static final String BASE_URL = "/api/v1/hello";

    public HelloController() {

    }

    @GetMapping(produces = "application/json")
    Map sayHello() {
        return Collections.singletonMap("response", "Hello World");
    }
}

