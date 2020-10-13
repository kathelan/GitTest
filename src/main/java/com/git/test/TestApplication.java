package com.git.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {

    @RequestMapping("/")
    String home() {
        System.out.println("hello");
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
