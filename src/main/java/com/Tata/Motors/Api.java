package com.Tata.Motors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Api {
    

    @GetMapping("/")
    public String getMethodName() {
        return "hi";
    }
    
}
