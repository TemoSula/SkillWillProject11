package com.example.skillwillproject2.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class GreetingController {

    @GetMapping("/hello")
    public String greeting(){
        return "Hello World";
    }

    @GetMapping(value = {"/hello/{name}"})
    public String greetingWithYourName(@PathVariable String name)
    {
        return "Hello" + " " + name;
    }

}
