package com.springboot.demo.mycoolapp.rest;

import com.springboot.demo.mycoolapp.entities.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

//@Controller
//@ResponseBody
@RestController
//@RequestMapping("/test")
public class FunRestController {
    //expose "/" that return "Hello World"

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting() {
        return new Greeting(counter.incrementAndGet(), String.format(template, "name"));
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World, Spring Boot App.";
    }

}
