package com.JavaAngular.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DemoSwaggerController {

    @RequestMapping("/say")
    public String sayHello(){
        return "Hiiiiiiiii from Swagger!!";
    }
}
