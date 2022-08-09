package com.genspark.Employee.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/") // mapping URL
    public String home() {
        return "<HTML><H1>Employee Database.</H1></HTML>";
    }

}
