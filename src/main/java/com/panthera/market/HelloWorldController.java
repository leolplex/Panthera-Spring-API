package com.panthera.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayHello")
public class HelloWorldController {
    @GetMapping("hey")
    public String sayHello(){
        return  "Hey guy";
    }
}
