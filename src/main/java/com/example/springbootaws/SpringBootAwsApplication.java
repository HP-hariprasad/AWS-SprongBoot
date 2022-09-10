package com.example.springbootaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAwsApplication {

    @GetMapping("/")
    public String awsHome(){
        return "Welcome to the AWS Home Page";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAwsApplication.class, args);
    }

}
