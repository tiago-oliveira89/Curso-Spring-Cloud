package com.cloud.course.lab1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Lab1Controller {

    @GetMapping("/")
    public String getHelloWorld() {
        return "hello";
    }
}
