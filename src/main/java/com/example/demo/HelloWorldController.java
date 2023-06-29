package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class HelloWorldController {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class, args);
    }

    @GetMapping("/")
    public String helloWorld(Model model) {
        model.addAttribute("message", "HelloWorld");
        return "index";
    }

}