package com.hackley.mydomain.firstWebApp;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class FirstWebAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstWebAppApplication.class, args);
        System.out.println("http://localhost:8080");
    }
}
